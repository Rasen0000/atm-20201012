package com.github.Rasen0000;

import java.math.BigDecimal;
import java.util.*;


import static com.github.Rasen0000.Currency.*;



public interface Interaction {

    List<String> list = new ArrayList<>();
    Set<String> checkDuplicates = new HashSet<String>();

    ATM atm = new ATM(RUR, new BigDecimal(100000), new BigDecimal(500));


    String getMoney(String password, BigDecimal bankAccount, BigDecimal cash);

    static void enterPassword(boolean isPasswordTrue) {
        if (isPasswordTrue) {
            atm.getMoney();
            list.add("enterPassword");
        }

        else {
            System.out.println("Отказ");
        }
    }


    static void repeatOperation(){
        for (int i = 0; i < list.size(); i++) {
            String repeat = list.get(i);
            if (!checkDuplicates.add(repeat)) {
                System.out.println("Repeat operation " + repeat);
            }
        }
    }


}