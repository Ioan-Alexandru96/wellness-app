package com.sda.project.dto;

public class CreateUser {

    private String userName;
    private String password;
    private String city;
    private String address;
    private String email;
    private Boolean agreementConditions;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAgreementConditions() {
        return agreementConditions;
    }

    public void setAgreementConditions(Boolean agreementConditions) {
        this.agreementConditions = agreementConditions;
    }

    @Override
    public String toString() {
        return "CreateUser{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", agreementConditions=" + agreementConditions +
                '}';
    }
}
