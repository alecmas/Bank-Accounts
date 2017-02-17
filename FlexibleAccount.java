//*****************************************************************
// FlexibleAccount.java
// Author: Alexander Mas
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//*****************************************************************

import java.util.Random;

public class FlexibleAccount
{
   Random random = new Random();
   
   private double balance;
   private String name;
   private long acctNum;
   
   //--------------------------------
   // Constructor -- initializes balance, owner, and account number
   //--------------------------------
   public FlexibleAccount ( String name )
   {
      this.balance = 0;
      this.name = name;
      this.acctNum = random.nextInt( 100 );
   }
   
   public FlexibleAccount ( double balance, String name )
   {
      this.balance = balance;
      this.name = name;
      this.acctNum = random.nextInt( 100 );
   }
   
   public FlexibleAccount( double balance, String name, long acctNum )
   {
      this.balance = balance;
      this.name = name;
      this.acctNum = acctNum;
   }
   
   //--------------------------------
   // Checks to see if balance is sufficient for withdrawal.
   // If so, decrements balance by amount; if not, prints message.
   //--------------------------------
   
   public void withdraw( double amount )
   {
      if ( balance >= amount )
         balance -= amount;
      else
         System.out.println( "Insufficient funds" );
      
   }
   
   public void withdraw( double amount, double fee )
   { 
      if ( balance >= amount + fee )
         balance -= fee;
      else
         System.out.println( "Insufficient funds" );
   }
   
   //--------------------------------
   // Adds deposit amount to balance.
   //--------------------------------
   
   public void deposit( double amount )
   {
      balance += amount;
   }
   
   //--------------------------------
   // Returns balance.
   //--------------------------------
   
   public double getBalance()
   {
      return balance;
   }
   
   //--------------------------------
   // Returns a string containing the name, account number, and balance.
   //--------------------------------
   
   public String toString()
   {
      return "Name: " + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
   }
}