package lab.bank.entity;

import lab.bank.exception.InsufficientBalanceException;
import lab.bank.exception.WithdrawalLimitExceededException;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > getBalance()) {
            throw new InsufficientBalanceException("잔액이 부족합니다.");
        }
        setBalance(getBalance() - amount);
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", 이자율: %.1f%%", interestRate);
    }

    public double getInterestRate() { return interestRate; }
}