package com.example.project14;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String firstName;
    private String lastName;
    private String middleName;
    private int id;
    private int count = 0;


    public User() {
    }

    public User(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.id = count++;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
