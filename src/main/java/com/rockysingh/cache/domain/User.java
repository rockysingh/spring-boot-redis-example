package com.rockysingh.cache.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {


    private static final long serialVersionUID = 1L;

    private static long longId = 100;

    private String id;

    @NotEmpty
    @Size(min = 5, max = 100)
    private String name;

    @NotEmpty
    @Size(min = 5, max = 100)
    private String surname;

    private int age;

    private String address;

    private String email;

    public User() {
        this.id = generateNextId();
    }

    public static String generateNextId() {
        return String.valueOf(longId++);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
}
