package com.github.Rasen0000;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import static com.github.Rasen0000.ErrorCodes.NON;

@Getter
@Setter
public class ATM {

    private BigDecimal ATMMoney; //запас денег в банкомате
    private BigDecimal money; //деньги требуемые клиенту
    private ErrorCodes errorState;

    public static ErrorCodes getErrorState() {

        return ErrorCodes.valueOf("---");
    }

    public ATM(Currency RUR, BigDecimal ATMMoney, BigDecimal money) {

    }


    public String getMoney(String password, BigDecimal bankAccount, BigDecimal cash){
    ATMMoney = ATMMoney.subtract(money);
    errorState = NON;
    return "1";
}



}
