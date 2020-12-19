package com.github.Rasen0000;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
       Client client = new Client("P@$$word", new BigDecimal(2000), new BigDecimal(15));
       ATM atm = new ATM("RUR", new BigDecimal(100000), new BigDecimal(500));
       Interaction.enterPassword(true); //ввод пароля и результат

    }

}
