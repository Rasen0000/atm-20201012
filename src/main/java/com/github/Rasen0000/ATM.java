package com.github.Rasen0000;

import java.math.BigDecimal;

public class ATM {
    private BigDecimal money = BigDecimal.valueOf(100.00);
    private String currency = "Руб.";

    public ATM() {
        this.money = money;
        this.currency = currency;
    }

    public void getMoney() {
        System.out.println("Выдача средств " + money +" "+ currency );
    }
}
