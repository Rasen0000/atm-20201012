package com.github.Rasen0000;


import lombok.*;

import java.math.BigDecimal;
import java.util.Scanner;
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
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму для снятия : ");
        cash = new BigDecimal(in.next());

        BigDecimal ATMMoney = BigDecimal.valueOf(2325.06);
        ATMMoney = ATMMoney.subtract(cash);
        if (n.test(ATMMoney)) {
            System.out.println("Остаток на счете: " + ATMMoney);
            errorState = NON;
        }
        else {
            System.out.println("Некорректный запрос. Повторить");
            getMoney();
            errorState = INSUFFICIENT_FUNDS_ATM;
        }
        return ATMMoney;
    }




}
