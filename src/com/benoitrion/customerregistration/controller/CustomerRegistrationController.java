package com.benoitrion.customerregistration.controller;

import com.benoitrion.customerregistration.model.CustomerVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "registration")
public class CustomerRegistrationController {

	List<String> stateList;

	public CustomerRegistrationController() {

		this.stateList = Arrays.asList("Tamilnadu", "Karnataka","Maharashtra");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
	    System.out.println("Hello index");
		return "redirect:/registration";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String renderRegistration(Model model) {
        System.out.println("Hello registerRegistration");

        CustomerVO customer = new CustomerVO();
		model.addAttribute("registration", customer);

		return "registration";
	}

    @RequestMapping(method = RequestMethod.POST)
    public String registerCustomer(@ModelAttribute("registration") CustomerVO customerVO,
								   BindingResult result, Model model) {

        return "redirect:/success";
    }


}
