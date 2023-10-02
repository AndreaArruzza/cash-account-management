package com.cashaccountmanagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "type")
@Getter
@Setter
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",  nullable = false)
    private Long id;

    @Column(name ="enumeration")
    private String enumeration;

    @Column(name ="value")
    private String value;

    public Type(Long id, String enumeration, String value) {
        this.id = id;
        this.enumeration = enumeration;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", enumeration='" + enumeration + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
