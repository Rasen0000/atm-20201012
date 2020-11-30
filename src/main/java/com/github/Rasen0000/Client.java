package com.github.Rasen0000;

public class Client {
   ATMMoney atmMoney = new ATMMoney();
   public void enterPassword(boolean password){
      if (password = true)  {

      atmMoney.getMoney();
      }
      //todo: пока не понимаю как реализовать отказ в выдаче средств. Должен выводить сообщение на экран. Реализовать экран и сообщения на нем
       else if (password = false) {
         System.out.println("Отказ");
      }


   }

}
