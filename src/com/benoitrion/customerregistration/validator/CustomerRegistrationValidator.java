package com.benoitrion.customerregistration.validator;

import com.benoitrion.customerregistration.model.CustomerVO;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class CustomerRegistrationValidator implements Validator {

    public boolean supports(Class<?> aClass) {
        return CustomerVO.class.equals(aClass);
    }

    public void validate(Object target, Errors errors) {

        CustomerVO customerVO = (CustomerVO) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.customerVO.password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "NotEmpty.customerVO.confirmPassword");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.street", "NotEmpty.customerVO.address.street");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.state", "NotEmpty.customerVO.address.state");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dateOfBirth", "NotEmpty.customerVO.dateOfBirth");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "NotEmpty.customerVO.gender");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "NotEmpty.userForm.address");

        if (customerVO.getCustomerName().equalsIgnoreCase(customerVO.getPassword())) {
            errors.rejectValue("password", "Valid.customerVO.nameDiffersFromPassword");
        }
        if (!customerVO.getPassword().equalsIgnoreCase(customerVO.getConfirmPassword())) {
            errors.rejectValue("confirmPassword", "Valid.customerVO.password");
        }

    }
}
