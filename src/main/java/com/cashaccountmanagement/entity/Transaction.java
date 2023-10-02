package com.cashaccountmanagement.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transaction")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",  nullable = false)
    private Long id;

    @Column(name ="operation_id")
    private String operationId;

    @Column(name ="accounting_date")
    private LocalDate accountingDate;

    @Column(name ="value_date")
    private LocalDate valueDate;

    @Column(name ="amount")
    private Double amount;

    @Column(name ="currency")
    private String currency;

    @Column(name ="description")
    private String description;

    @Column(name ="type_enumeration")
    private String typeEnumeration;


    @Column(name ="type_value")
    private String typeValue;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
