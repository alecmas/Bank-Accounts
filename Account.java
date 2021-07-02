//*****************************************************************
// Account.java
// Author: Alexander Mas
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//*****************************************************************

public class Account
{
   private double balance;
   private String name;
   private long acctNum;
   private static int numAccounts = 0;
   
   //--------------------------------------------------------------
   // Constructor -- initializes balance, owner, and account number
   //--------------------------------------------------------------
   
   public Account( double balance, String name, long acctNum )
   {
      this.balance = balance;
      this.name = name;
      this.acctNum = acctNum;
      numAccounts++;
   }
   
   //--------------------------------------------------------------
   // Checks to see if balance is sufficient for withdrawal.
   // If so, decrements balance by amount; if not, prints message.
   //--------------------------------------------------------------
   
   public void withdraw( double amount )
   {
      if ( balance >= amount )
         balance -= amount;
      else
         System.out.println( "Insufficient funds" );
   }
   
   //--------------------------------------------------------------
   // Adds deposit amount to balance.
   //--------------------------------------------------------------
   
   public void deposit ( double amount )
   {
      balance += amount;
   }
   
   //--------------------------------------------------------------
   // Returns balance.
   //--------------------------------------------------------------
   
   public double getBalance()
   {
      return balance;
   }
   
   //--------------------------------------------------------------
   // Returns account number.
   //--------------------------------------------------------------
   
   public long getAcctNumber()
   {
      return acctNum;
   }
   
   //--------------------------------------------------------------
   // Returns a string containing the name, account number, and balance.
   //--------------------------------------------------------------
   
   public String toString()
   {
      return "Name: " + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
   }
   
   //--------------------------------------------------------------
   // Returns the number of accounts created.
   //--------------------------------------------------------------
   
   public static int getNumAccounts()
   {
      return numAccounts;
   }
}
