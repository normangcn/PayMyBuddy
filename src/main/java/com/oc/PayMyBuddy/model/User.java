package com.oc.PayMyBuddy.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String username;
    private String email;
    private String password;
    private double balance;
}
