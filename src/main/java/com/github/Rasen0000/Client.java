package com.github.Rasen0000;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class Client {
    private String password;
    private BigDecimal bankAccount;
    private BigDecimal cash;   //наличные
    private BigDecimal money;


    public Client(String password, BigDecimal bankAccount, BigDecimal cash) {
        this.password = password;
        this.bankAccount = bankAccount;
        this.cash = cash;
        this.money = money;
    }

    public String getMoney(Interaction atm){
        cash = cash.add(money);
        return atm.getMoney(password, bankAccount, cash);
// TODO: 28.11.2020 к имеющимся наличным нужно прибавить, то что выдается из банкомата
    }



}



