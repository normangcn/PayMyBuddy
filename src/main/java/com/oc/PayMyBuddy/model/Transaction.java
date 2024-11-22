package com.oc.PayMyBuddy.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sender;
    private int receiver;
    private double amount;
    private String transactionId;
}
