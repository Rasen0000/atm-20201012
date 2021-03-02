package com.github.Rasen0000;


import lombok.*;

import java.math.BigDecimal;
import java.util.function.Predicate;

import static com.github.Rasen0000.ErrorCodes.*;


@Getter
@Setter
public class ATM {
    private BigDecimal ATMMoney; //запас денег в банкомате
    private ErrorCodes errorState;
    private Currency currency;
    private BigDecimal cash;
    Predicate<BigDecimal> n = t -> t.compareTo(BigDecimal.ZERO) > 0;

    public ATM(Currency currency, BigDecimal ATMMoney,  BigDecimal cash) {
        this.ATMMoney = ATMMoney;
        this.currency = currency;
        this.cash = cash;
    }

    public static ErrorCodes getErrorState() {
        return NON;
    }


    public BigDecimal getMoney() {
        ATMMoney = ATMMoney.subtract(getCash());
        if (n.test(ATMMoney)) {
            errorState = INSUFFICIENT_FUNDS_ATM;
        }
        errorState = NON;
        return ATMMoney;
    }




}
