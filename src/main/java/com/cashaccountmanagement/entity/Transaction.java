package com.cashaccountmanagement.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transaction")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transaction" )
    @SequenceGenerator(
            name = "seq_transaction",
            allocationSize = 1
    )
    @Column(name = "id",  nullable = false)
    private Long id;

    @Column(name ="operation_id",  nullable = false, unique=true)
    private String operationId;

    @Column(name ="accounting_date",  nullable = false)
    private LocalDate accountingDate;

    @Column(name ="value_date",  nullable = false)
    private LocalDate valueDate;

    @Column(name ="amount",  nullable = false)
    private Double amount;

    @Column(name ="currency",  nullable = false)
    private String currency;

    @Column(name ="description",  nullable = false)
    private String description;

    @Column(name ="type_enumeration",  nullable = false)
    private String typeEnumeration;

    @Column(name ="type_value",  nullable = false)
    private String typeValue;

    @ManyToOne
    @JoinColumn(name = "account_id",  nullable = false)
    private Account account;
}
