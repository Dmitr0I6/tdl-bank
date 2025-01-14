package com.tdl.tdlbank.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity

public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Date openDate;
    private Date estimatedClosingDate;
    private Date actualClosingDate;
    private String typeOfDeposit;
    private double balance;
    private float percent;
    private String status;

    public Deposit(Deposit newDeposit) {
        this.id = newDeposit.id;
        this.name = newDeposit.name;
        this.openDate = newDeposit.openDate;
        this.estimatedClosingDate = newDeposit.estimatedClosingDate;
        this.actualClosingDate = newDeposit.actualClosingDate;
        this.typeOfDeposit = newDeposit.typeOfDeposit;
        this.balance = newDeposit.balance;
        this.percent = newDeposit.percent;
        this.status = newDeposit.status;
    }
}
