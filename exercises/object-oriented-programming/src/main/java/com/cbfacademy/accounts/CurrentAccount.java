package main.java.com.cbfacademy.accounts;

public class CurrentAccount extends Account{
    private int overDraftLimit = -200;
    public CurrentAccount(int number, int accountNumber){
        super(number, accountNumber);
    }

    public void overDraftLimitChecker(){
        if(this.balance <= overDraftLimit){
            System.out.println("Over Draft Limit Reached!");
        }
        else{
            System.out.println("Go Ahead!");
        }
    }
}
