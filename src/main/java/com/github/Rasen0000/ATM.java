package com.github.Rasen0000;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ATM<RUR> {

    private BigDecimal ATMMoney; //запас денег в банкомате
    private BigDecimal money; //деньги требуемые клиенту

    public ATM(Currency RUR, BigDecimal ATMMoney, BigDecimal money) {

    }


    public String getMoney(String password, BigDecimal bankAccount, BigDecimal cash){
    ATMMoney = ATMMoney.subtract(money);
    return "1";
}



}
