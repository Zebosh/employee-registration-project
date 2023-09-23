package com.cydeo.employeeregistrationproject.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private String birthday;
    private LocalDate email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

    public Employee() {

    }
}
