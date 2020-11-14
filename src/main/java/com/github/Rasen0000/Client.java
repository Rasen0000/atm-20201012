package com.github.Rasen0000;

public class Client {

   ATM atm = new ATM();
   public void enterPassword(boolean password){
      if (password = true)  {
      atm.getMoney();
      }
       else if (password = false) {
         System.out.println("Отказ");
      }


   }

}
