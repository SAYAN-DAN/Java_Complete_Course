package sayan.Bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Sayan");
        account.depoisted(100);
        // account.withdrawmoney(200);``
        System.out.println(account.withdrawmoney(200));
        account.depoisted(-40);
        account.withdrawmoney(0);
    }

}
