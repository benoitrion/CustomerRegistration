package com.benoitrion.customerregistration.controller;

import com.benoitrion.customerregistration.model.Address;
import com.benoitrion.customerregistration.model.CustomerVO;
import com.benoitrion.customerregistration.validator.CustomerRegistrationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerRegistrationController {

    private Map stateList = new HashMap();
    private List genderList;

    @Autowired
    private CustomerRegistrationValidator customerRegistrationValidator;

    @InitBinder("customer")
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(customerRegistrationValidator);
    }

    public CustomerRegistrationController() {
        stateList.put("Tamilnadu", "Tamilnadu");
        stateList.put("Karnataka", "Karnataka");
        stateList.put("Maharashtra", "Maharashtra");

        genderList = Arrays.asList("Male", "Female");

    }

    @RequestMapping(value = "/registrationForm", method = RequestMethod.GET)
    public String displayRegisterFrom(Model model) {

        Address address = new Address();
        address.setStreet("Test address");
        model.addAttribute("address", address);

        CustomerVO customer = new CustomerVO();
        customer.setCustomerName("Customer");
        customer.setAddress(address);
        customer.setDateOfBirth("12-12-1993");
        customer.setGender("Male");
        customer.setAgreed(false);
        model.addAttribute("customerVO", customer);

        model.addAttribute("stateList", stateList);
        model.addAttribute("genderList", genderList);

        return "registration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerCustomer(@Valid @ModelAttribute CustomerVO customerVO,
                                   BindingResult result, Model model, Errors errors) {

        model.addAttribute("stateList", stateList);
        model.addAttribute("genderList", genderList);

        customerRegistrationValidator.validate(customerVO, errors);

        if (result.hasErrors()) {

            return "registration";
        }

        return "success";
    }

}
