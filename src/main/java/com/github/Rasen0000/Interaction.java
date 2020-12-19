package com.github.Rasen0000;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface Interaction {
    ArrayList <Integer>  requests = new ArrayList<>();
    ATM atm = new ATM("RUR", new BigDecimal(100000), new BigDecimal(500));


    String getMoney(String password, BigDecimal bankAccount, BigDecimal cash);

    static void enterPassword(boolean password) {
        if (password) {
            atm.getMoney("112", new BigDecimal(10000), new BigDecimal(10));
            try {
                boolean n = requests.add(1);
            }
            //todo: сомневаюсь что это корректно.
            catch (ArrayStoreException e){
                System.out.println(e.getMessage());
                System.out.println("Повтор строки");
            }

        }
        //todo: пока не понимаю как реализовать отказ в выдаче средств. Должен выводить сообщение на экран. Реализовать экран и сообщения на нем
        else {
            System.out.println("Отказ");
        }
    }
//    Map<Integer, Integer> hashMap = new HashMap<>();



}