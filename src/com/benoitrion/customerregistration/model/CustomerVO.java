package com.benoitrion.customerregistration.model;

public class CustomerVO {

    private String customerName;
    private String password;
    private String confirmPassword;
    private Address address;
    private String state;
    private String dateOfBirth;
    private String gender;

    public CustomerVO() {};

    public CustomerVO(String customerName, String password, String confirmPassword, Address address, String state, String dateOfBirth, String gender) {
        this.customerName = customerName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.address = address;
        this.state = state;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
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

}
