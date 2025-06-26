package sayan.Bank;

public class BankAccount {
    private  String accountNumber;
    private  String accountHolderName;
    private  double balance;

    // public static int deposit;
    // public static double withdraw;

    public BankAccount(String accountNumber , String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depoisted( double money){
        if(money <= 0){
            System.out.println("Invalid Deposit");
        }
        else{
            balance += money;
        }
    }
    public double withdrawmoney(double money){
         if(money <= 0){
          System.out.println("Invalid Withdraw");
        }else if(balance >= money){
            balance -= money;
        } else{
         money = balance;
         balance =0;
        }
        return money;
    }
}
