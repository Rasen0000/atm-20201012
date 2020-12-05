package com.github.Rasen0000;

import java.math.BigDecimal;
import java.util.*;
import static com.github.Rasen0000.Currency.RUR;


public interface Interaction {

    ArrayList <Integer>  requests = new ArrayList<>();
    Set<Integer> set = new HashSet<>(requests);
    ATM atm = new ATM(RUR, new BigDecimal(100000), new BigDecimal(500));


    String getMoney(String password, BigDecimal bankAccount, BigDecimal cash);

    static void enterPassword(boolean isPasswordTrue) {
        if (isPasswordTrue) {
            atm.getMoney("112", new BigDecimal(10000), new BigDecimal(10));
            requests.add(1);
            }
        //todo: пока не понимаю как реализовать отказ в выдаче средств. Должен выводить сообщение на экран. Реализовать экран и сообщения на нем
        else {
            System.out.println("Отказ");
        }
    }


//    Map<Integer, Integer> hashMap = new HashMap<>();



}