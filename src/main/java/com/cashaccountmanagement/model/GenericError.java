package com.cashaccountmanagement.model;

import lombok.Data;

import java.util.List;

@Data
public class GenericError {
    private String status;
    private List<Object> errors;
    private Object payload;
}
