package com.benoitrion.customerregistration.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.Valid;

public class CustomerVO {

    @NotEmpty
    private String customerName;
    @NotEmpty
    @Valid
    private String password;
    @NotEmpty
    @Valid
    private String confirmPassword;
    @NotEmpty
    private Address address;
    @NotEmpty
    private String state;
    @NotEmpty
    private String dateOfBirth;
    @NotEmpty
    private String gender;
    @NotEmpty
    private boolean agreed = false;
    @NotEmpty
    private String clientIpAddress;

    public CustomerVO() {};

    public CustomerVO(String customerName, String password, String confirmPassword, Address address, String state, String dateOfBirth, String gender, boolean agreed, String clientIpAddress) {
        this.customerName = customerName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.address = address;
        this.state = state;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.agreed = agreed;
        this.clientIpAddress = clientIpAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    public String getClientIpAddress() {
        return clientIpAddress;
    }

    public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
    }
}
