package com.benoitrion.customerregistration.controller;

import com.benoitrion.customerregistration.model.Address;
import com.benoitrion.customerregistration.model.CustomerVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class CustomerRegistrationController {

    private List<String> stateList;
    private boolean isAgreed = false;

    public CustomerRegistrationController() {

        this.stateList = Arrays.asList("Tamilnadu", "Karnataka","Maharashtra");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        System.out.println("Hello index");
        return "redirect:/registration";
    }

    @RequestMapping(value = "/registrationForm", method = RequestMethod.GET)
    public String renderRegistration(Model model) {
        System.out.println("Hello registerRegistration");

        model.addAttribute("stateList", stateList);
        model.addAttribute("isAgreed", isAgreed);
        CustomerVO customer = new CustomerVO();
        Address address = new Address();
        model.addAttribute("registration", customer);
        model.addAttribute("address", address);

        return "registration";
    }

    @RequestMapping(value = "/successForm", method = RequestMethod.POST)
    public String registerCustomer(@ModelAttribute("registration") CustomerVO customerVO,
                                   BindingResult result, Model model) {

        return "redirect:/success";
    }


}
