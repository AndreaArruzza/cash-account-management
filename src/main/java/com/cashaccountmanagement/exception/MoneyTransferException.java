package com.cashaccountmanagement.exception;

import lombok.Data;

@Data
public class MoneyTransferException  extends RuntimeException{
    private String status;
    private String message;

    public MoneyTransferException(String status, String message){
        super();
        this.status = status;
        this.message = message;
    }
}
