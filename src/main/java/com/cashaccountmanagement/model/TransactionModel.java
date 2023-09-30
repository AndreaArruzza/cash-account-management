package com.cashaccountmanagement.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionModel {
    private String accountId;
    private LocalDate fromAccountingDate;
    private LocalDate toAccountingDate;
}
