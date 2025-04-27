package lab.bank.entity;

import lab.bank.entity.SavingsAccount;
import lab.bank.exception.AccountNotFoundException;
import lab.bank.exception.InsufficientBalanceException;
import lab.bank.exception.WithdrawalLimitExceededException;

public class Bank {
    private Account[] accounts;
    private int nextAccountNumber;
    private int accountCount;

    public Bank(int initialSize) {
        accounts = new Account[initialSize];
        nextAccountNumber = 1000;
        accountCount = 0;
    }

    public SavingsAccount createSavingsAccount(String ownerName, double balance, double interestRate) {
        String accountNumber = "AC" + nextAccountNumber++;
        SavingsAccount account = new SavingsAccount(accountNumber, ownerName, balance, interestRate);
        addAccount(account);
        return account;
    }

    public CheckingAccount createCheckingAccount(String ownerName, double balance, double withdrawalLimit) {
        String accountNumber = "AC" + nextAccountNumber++;
        CheckingAccount account = new CheckingAccount(accountNumber, ownerName, balance, withdrawalLimit);
        addAccount(account);
        return account;
    }

    private void addAccount(Account account) {
        if (accountCount >= accounts.length) {
            Account[] newAccounts = new Account[accounts.length * 2];
            System.arraycopy(accounts, 0, newAccounts, 0, accounts.length);
            accounts = newAccounts;
        }
        accounts[accountCount++] = account;
    }

    public Account findAccount(String accountNumber) throws AccountNotFoundException {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        throw new AccountNotFoundException(
            String.format("계좌번호 %s에 해당하는 계좌를 찾을 수 없습니다.", accountNumber));
    }

    public void deposit(String accountNumber, double amount) throws AccountNotFoundException {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount) 
            throws AccountNotFoundException, InsufficientBalanceException {
        Account account = findAccount(accountNumber);
        account.withdraw(amount);
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount)
            throws AccountNotFoundException, InsufficientBalanceException {
        Account fromAccount = findAccount(fromAccountNumber);
        Account toAccount = findAccount(toAccountNumber);
        
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    public void printAllAccounts() {
        System.out.println("=== 모든 계좌 목록 ===");
        for (int i = 0; i < accountCount; i++) {
            System.out.println(accounts[i]);
        }
        System.out.println("===================");
    }
}