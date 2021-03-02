package com.github.Rasen0000;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

import static com.github.Rasen0000.Currency.*;


@Slf4j

public class Main {
    public static void main(String[] args) {
        Client client = new Client("P@$$word", new BigDecimal(2000), new BigDecimal(15));
        ATM atm = new ATM(RUR, new BigDecimal(100000), new BigDecimal(500));

        Interaction.enterPassword(true); //ввод пароля и результат
        getMessage();
        try {
            Interaction.repeatOperation(); //проверка на повторную операцию

        } catch (IllegalArgumentException e) {
            log.info("Repeat operation.");
            ATM.getErrorState();
            System.exit(1);
        }
    }

    private static String getMessage() {
        switch (ATM.getErrorState()) {
            case RETRY_REQUEST:
                return "Повтор запроса";
            case INSUFFICIENT_FUNDS_BALANCE:
                return "Недостаточно средств на счете";
            case INSUFFICIENT_FUNDS_ATM:
                return "Недостаточно средств в банкомате";
            case NON:
                break;
        }
        return "42";
    }

    public static void getClient() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);
        Client obj = context.getBean("client", Client.class);
    }

}
