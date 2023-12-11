// Account class
class Account {
    private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

// SavingsAccount class derived from Account
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
    }
}

// CurrentAccount class derived from Account
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void sendOverdraftLetter() {
        if (balance < 0) {
            System.out.println("Letter sent: Account is in overdraft");
        }
    }
}

// Bank class
class Bank {
    private Account[] accounts;

    public Bank(int size) {
        accounts = new Account[size];
    }

    public void openAccount(int index, Account account) {
        accounts[index] = account;
    }

    public void closeAccount(int index) {
        accounts[index] = null;
    }

    public void payDividend(double amount) {
        for (Account acc : accounts) {
            if (acc != null) {
                acc.deposit(amount);
            }
        }
    }

    public void updateAccounts() {
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) acc;
                savingsAccount.addInterest();
            } else if (acc instanceof CurrentAccount) {
                CurrentAccount currentAccount = (CurrentAccount) acc;
                currentAccount.sendOverdraftLetter();
            }
        }
    }
}

// Main class for testing
public class exp4_Account {
    public static void main(String[] args) {
        // Creating instances of different accounts
        SavingsAccount savingsAcc = new SavingsAccount("SA001", 5000, 5.0);
        CurrentAccount currentAcc = new CurrentAccount("CA001", 2000, -1000);

        // Testing the account functionalities
        System.out.println("Initial Savings Account Balance: " + savingsAcc.getBalance());
        savingsAcc.addInterest();
        System.out.println("After adding interest, Savings Account Balance: " + savingsAcc.getBalance());

        System.out.println("\nInitial Current Account Balance: " + currentAcc.getBalance());
        currentAcc.sendOverdraftLetter();
        currentAcc.withdraw(3000);
        currentAcc.sendOverdraftLetter();
        System.out.println("After withdrawing, Current Account Balance: " + currentAcc.getBalance());

        // Creating a bank with an array of accounts
        Bank bank = new Bank(5);
        bank.openAccount(0, savingsAcc);
        bank.openAccount(1, currentAcc);

        // Updating accounts in the bank
        bank.updateAccounts();
    }
}
