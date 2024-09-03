package bankAccount;

public class BankAccount {
    private String username;
    private double balance;

    public BankAccount(String username, int balance) {
        this.username = username;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int depositFunds) {
        balance += depositFunds;
    }

    public void withdraw(int withdrawnFunds) throws InsufficientFundsException {
        if (balance < withdrawnFunds) {
            throw new InsufficientFundsException("Insufficient funds on balance");
        } else {
            balance -= withdrawnFunds;
        }
    }

    @Override
    public String toString() {
        return "Username: " + username + "\nBalance: " + balance;
    }

}
