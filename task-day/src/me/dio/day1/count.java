package me.dio.day1;

import java.math.BigDecimal;

public class count {
    //Atributes

    private int number;
    private BigDecimal balance;

    public void toWithdraw(BigDecimal value) {
        if(value.compareTo(BigDecimal.ZERO) <= 0 || this.balance.compareTo(value) <= -1) {
            throw new IllegalArgumentException("Invalid value to withdraw");
        }else {
            this.balance = this.balance.subtract(value);
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
