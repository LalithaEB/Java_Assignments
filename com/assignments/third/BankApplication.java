package third;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SavingsAccount savingsAcc = new SavingsAccount(1000);
        CurrentAccount currentAcc = new CurrentAccount(1500);
        DematAccount dematAcc = new DematAccount(500);

        System.out.println("Enter amount for fixed deposit: ");
        double fixedDepositAmt = scanner.nextDouble();

        System.out.println("Enter time period for fixed deposit: ");
        int fixedTime = scanner.nextInt();

        // intrest rate assuming as 5%
        FixedDeposit fd = new FixedDeposit(fixedDepositAmt, fixedTime, 0.065);

        System.out.println("Maturity amount is: " + fd.calcMaturityAmt());

        System.out.println("Select an account type: \n1- Savings Account\n2- Current Account\n3- DematAccount");

        int inputAcc = scanner.nextInt();

        switch (inputAcc) {
            case 1 -> selectAccount(savingsAcc);
            case 2 -> selectAccount(currentAcc);
            case 3 -> selectAccount(dematAcc);
            default -> System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static void selectAccount(Account account) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option:\n1- Deposit Amount\n2- Withdraw Amount");
        int option = scanner.nextInt();

        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();

        switch (option) {
            case 1 -> account.deposit(amount);
            case 2 -> account.withdraw(amount);
            default -> System.out.println("Invalid option");
        }

        scanner.close();
    }
}

class FixedDeposit {
    private double amt;
    private int time;
    private double interest;

    public FixedDeposit(double amt, int time, double interest) {
        this.amt = amt;
        this.time = time;
        this.interest = interest;
    }

    public double calcMaturityAmt() {
        double maturityAmt = amt + ((amt * interest * time) / 12);
        return maturityAmt;
    }
}

abstract class Account {
    protected double balance;

    public Account(double initialBal) {
        this.balance = initialBal;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double initialBal) {
        super(initialBal);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(double initialBal) {
        super(initialBal);
    }
}

class DematAccount extends Account {
    public DematAccount(double initialBal) {
        super(initialBal);
    }
}