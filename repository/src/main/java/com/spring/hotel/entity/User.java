package com.spring.hotel.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@javax.persistence.Entity
public class User extends Entity {

    private int role;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emails;
}