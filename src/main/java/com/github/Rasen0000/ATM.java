package com.github.Rasen0000;

public class ATM {
    private int money = 100;
    private String currency = "Руб.";

    public ATM() {
        this.money = money;
        this.currency = currency;
    }

    public void getMoney() {
        System.out.println("Выдача средств " + money +" "+ currency );
    }
}
