package lab.bank.entity;


import lab.bank.exception.InsufficientBalanceException;

public abstract class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("입금액은 0보다 커야 합니다.");
        }
        balance += amount;
    }

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    @Override
    public String toString() {
        return String.format("계좌번호: %s, 소유자: %s, 잔액: %.1f원", 
                accountNumber, ownerName, balance);
    }

    // Getter 메서드들
    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }
    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }
}