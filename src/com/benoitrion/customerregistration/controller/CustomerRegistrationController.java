package com.benoitrion.customerregistration.controller;

import com.benoitrion.customerregistration.model.Address;
import com.benoitrion.customerregistration.model.CustomerVO;
import com.benoitrion.customerregistration.validator.CustomerRegistrationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/customerRegistration")
public class CustomerRegistrationController {

    @Autowired
    private CustomerRegistrationValidator customerRegistrationValidator;

    @InitBinder("customerVO")
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(customerRegistrationValidator);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String displayRegisterFrom(Model model) {

        populateModel(model);

        return "registration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerCustomer(@Valid CustomerVO customerVO,
                                   BindingResult result, Model model) {

        if (result.hasErrors()) {
            populateModel(model);
            return "registration";
        }

        return "success";
    }

    private void populateModel(Model model) {

        Address address = new Address();
        address.setAddress("Test address");
        model.addAttribute("address", address);

        CustomerVO customer = new CustomerVO();
        customer.setCustomerName("Customer");
        customer.setAddress(address);
        customer.setDateOfBirth("12-12-1993");
        customer.setGender("Male");
        customer.setAgreed(false);
        model.addAttribute("registration", customer);

        Map stateList = new HashMap();
        stateList.put("Tamilnadu", "Tamilnadu");
        stateList.put("Karnataka", "Karnataka");
        stateList.put("Maharashtra", "Maharashtra");
        model.addAttribute("stateList", stateList);

        List genderList = Arrays.asList("Male", "Female");
        model.addAttribute("genderList", genderList);
    }


}
