package customclasses;

import java.util.Scanner;

class BankAccount {
    private Integer accountNumber;
    private String holderName;
    private Integer balance;

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void depositAmount(int amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
    }

    public void withdrawAmount(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New Balance: ₹" + balance);
        }
        else {
            System.out.println("Insufficient Funds!");
        }
    }

    public void displayBalance() {
        System.out.println("Final Balance: ₹" + balance);
    }

    @Override
    public String toString() {
        return "Account Number = " + getAccountNumber() + "\nHolder Name =  " + getHolderName() + "\nBalance: ₹ " + getBalance();
    }

}

public class BankAccountManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount b1 = new BankAccount();

        System.out.println("\n===== Bank Manager =====");
        System.out.print("Holder's Name: " );
        b1.setHolderName(scanner.nextLine());
        System.out.print("Account Number: ");
        b1.setAccountNumber(scanner.nextInt());
        System.out.print("Initial Balance: ₹");
        b1.setBalance(scanner.nextInt());

        System.out.println("Your Bank Account is Created Successfully!");

        System.out.println("\n--- Transactions ---");
        b1.depositAmount(1500);
        b1.depositAmount(500);

        b1.withdrawAmount(500);
        b1.withdrawAmount(50000); // insufficient funds

        b1.displayBalance();
    }
}
