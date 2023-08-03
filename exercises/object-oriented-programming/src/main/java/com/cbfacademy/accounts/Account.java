package main.java.com.cbfacademy.accounts;

public class Account {
    protected int balance;
    private int accountNumber;

    public Account(int balance, int accountNumber)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public Account(int accountNumber)
    {
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    public void deposit(int number)
    {
        balance += number;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public int getAccountBalance()
    {
        return balance;
    }

    public int withdraw(int number)
    {
        //to check if number is not negative
        int withdrawalAmount = Math.abs(number);

        if(balance >= withdrawalAmount)
        {
            balance -= withdrawalAmount;
            return withdrawalAmount;
        }
        else
        {
            System.out.println("Insufficient funds!");
            return 0;
        }
    }

}
