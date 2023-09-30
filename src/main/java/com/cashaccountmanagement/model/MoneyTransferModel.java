package com.cashaccountmanagement.model;

import lombok.Data;

@Data
public class MoneyTransferModel {
    private Long accountId;
    private String receiverName;
    private String description;
    private String currency;
    private String amount;
    private String executionDate;
}
