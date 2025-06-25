package sayan.Bank;

public class BankAccount {
    private  String accountNumber;
    private  String accountHolderName;
    private  double balance;

    // public static int deposit;
    // public static double withdraw;

    public void depoisted( double money){
        if(money <= 0){
            System.out.println("Invalid Deposit");
        }
        else{
            balance += money;
        }
    }
    public double withdrawmoney(double money){
        if(balance >= money){
            balance -= money;
        } else if(money <= 0){
          System.out.println("Invalid Withdraw");
        }else{
         money = balance;
         balance =0;
        }
        return money;
    }
}
