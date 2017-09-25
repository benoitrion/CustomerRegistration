package com.benoitrion.customerregistration.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

public class CustomerVO {

    @NotEmpty
    private String customerName;
    @NotEmpty
    private String password;
    @NotEmpty
    private String confirmPassword;
    @NotEmpty
    private Address address;
    @NotEmpty
    private String dateOfBirth;
    @NotEmpty
    private String gender;
    @NotEmpty
    private boolean agreed = false;

    public CustomerVO() {}

    public CustomerVO(String customerName, String password, String confirmPassword, Address address, String dateOfBirth, String gender, boolean agreed) {
        this.customerName = customerName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.agreed = agreed;
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

}
