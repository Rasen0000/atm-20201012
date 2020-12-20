package com.github.Rasen0000;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
@Getter
@Setter
@NotNull
public class Client <SavingAccount, DefaultAccount> {
    @Size (min = 6, max = 8, message = "Пароль должен состоять из 6-8 символов")
    private String password;
    private BigDecimal bankAccount;
    @Positive
    private BigDecimal cash;   //наличные
    @Positive
    private BigDecimal money;


    public Client(String password, BigDecimal bankAccount, BigDecimal cash) {
        this.password = password;
        this.bankAccount = bankAccount;
        this.cash = cash;
    }



    public SavingAccount  getMoney(Interaction atm){
        cash = cash.add(money);
        return (SavingAccount) atm.getMoney(password, bankAccount, cash);
// TODO: 28.11.2020 к имеющимся наличным нужно прибавить, то что выдается из банкомата
    }



}



