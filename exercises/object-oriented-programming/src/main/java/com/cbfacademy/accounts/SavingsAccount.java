package main.java.com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    private double interestRate = 0.05;
    public SavingsAccount(int number, int accountNumber)
    {
        super( number, accountNumber);
    }
        public void addInterest()
        {
            this.balance += balance * interestRate;
        }
}
