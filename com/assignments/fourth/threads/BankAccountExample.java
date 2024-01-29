package threads;

public class BankAccountExample {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(5000);

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(200);
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(500);
            }
        });

        depositThread.start();
        withdrawThread.start();

        depositThread.join();
        withdrawThread.join();

        System.out.println("Final account balance: " + account.getBalance());
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal amount: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
