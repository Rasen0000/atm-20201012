package com.github.Rasen0000;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.function.Predicate;

import static com.github.Rasen0000.ErrorCodes.*;


@Getter
@Setter
public class ATM {

    private BigDecimal ATMMoney; //запас денег в банкомате
    private BigDecimal money; //деньги требуемые клиенту
    private ErrorCodes errorState;
    Predicate<BigDecimal> negative = t ->ATMMoney.compareTo(BigDecimal.ZERO) > 0;
    public static ErrorCodes getErrorState() {

        return ErrorCodes.valueOf("---");
    }

    public ATM(Currency RUR, BigDecimal ATMMoney, BigDecimal money) {

    }


    public String getMoney(String password, BigDecimal bankAccount, BigDecimal cash){
    ATMMoney = ATMMoney.subtract(money);
        if (negative.test(ATMMoney)){
            errorState = INSUFFICIENT_FUNDS_ATM;
        }
        errorState = NON;
    return "1";
}



}
