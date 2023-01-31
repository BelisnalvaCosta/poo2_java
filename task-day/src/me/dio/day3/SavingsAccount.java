package me.dio.day3;

import java.math.BigDecimal;

public class SavingsAccount {
    //atributos
    private String number;
    private String nameCustomer;
    private BigDecimal balance;

    // Metodo construtor
    public SavingsAccount(String number, String nameCustomer, BigDecimal balance) {
        this.number = number;
        this.nameCustomer = nameCustomer;
        this.balance = BigDecimal.valueOf(300d);
    }

    //Metodos
    public void toDeposit(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid value to deposit");
        } else {
            this.balance = this.balance.add(value);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
