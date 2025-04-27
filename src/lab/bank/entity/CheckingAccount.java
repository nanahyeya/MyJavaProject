package lab.bank.entity;

import lab.bank.exception.InsufficientBalanceException;
import lab.bank.exception.WithdrawalLimitExceededException;

public class CheckingAccount extends Account {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, String ownerName, double balance, double withdrawalLimit) {
        super(accountNumber, ownerName, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > withdrawalLimit) {
            throw new WithdrawalLimitExceededException(
                String.format("출금 한도를 초과했습니다. 한도: %.1f원", withdrawalLimit));
        }
        if (amount > getBalance()) {
            throw new InsufficientBalanceException("잔액이 부족합니다.");
        }
        setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", 출금 한도: %.1f원", withdrawalLimit);
    }

    public double getWithdrawalLimit() { return withdrawalLimit; }
}