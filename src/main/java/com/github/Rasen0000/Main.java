package com.github.Rasen0000;


import java.math.BigDecimal;

import static com.github.Rasen0000.Currency.*;
import static com.github.Rasen0000.Interaction.requests;
import static com.github.Rasen0000.Interaction.set;

public class Main {
        public static void main(String[] args) {
        Client client = new Client("P@$$word", new BigDecimal(2000), new BigDecimal(15));
        ATM atm = new ATM(RUR, new BigDecimal(100000), new BigDecimal(500));
        Interaction.enterPassword(true); //ввод пароля и результат
            getMessage();
        try {
            boolean b = set.size() < requests.size();
        }
        catch (Exception e) {
            System.out.println("Repeat operation.");
        }
    }
    private static String getMessage(){
            switch (ATM.getErrorState()){
                case RETRY_REQUEST: return "Повтор запроса";
                case INSUFFICIENT_FUNDS_BALANCE: return "Недостаточно средств на счете";
                case INSUFFICIENT_FUNDS_ATM: return "Недостаточно средств в банкомате";
                case NON:
                    break;
            }
        return "42";
    }

}
