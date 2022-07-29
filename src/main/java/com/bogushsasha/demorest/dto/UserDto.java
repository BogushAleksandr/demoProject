package com.bogushsasha.demorest.dto;

public class UserDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String car;
    private String address;

    public UserDto(Integer id, String firstName, String lastName, String car, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.car = car;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
