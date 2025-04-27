package lab.bank.control;

import lab.bank.entity.*;
import lab.bank.exception.*;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank(10);
        
        try {
            // 계좌 생성
            System.out.println("=== 계좌 생성 ===");
            SavingsAccount sa1 = bank.createSavingsAccount("홍길동", 10000, 3.0);
            System.out.printf("Saving(저축) 계좌가 생성되었습니다: %s%n", sa1);
            
            CheckingAccount ca1 = bank.createCheckingAccount("김철수", 20000, 5000);
            System.out.printf("체킹 계좌가 생성되었습니다: %s%n", ca1);
            
            SavingsAccount sa2 = bank.createSavingsAccount("이영희", 30000, 2.0);
            System.out.printf("저축 계좌가 생성되었습니다: %s%n", sa2);
            
            // 모든 계좌 목록 출력
            bank.printAllAccounts();
            
            // 입금/출금 테스트
            System.out.println("=== 입금/출금 테스트 ===");
            bank.deposit("AC1000", 5000);
            System.out.printf("5000.0원이 입금되었습니다. 현재 잔액: %.1f원%n", bank.findAccount("AC1000").getBalance());
            
            bank.withdraw("AC1001", 3000);
            System.out.printf("3000.0원이 출금되었습니다. 현재 잔액: %.1f원%n", bank.findAccount("AC1001").getBalance());
            
            // 이자 적용 테스트
            System.out.println("=== 이자 적용 테스트 ===");
            sa1.applyInterest();
            System.out.printf("이자 %.1f원이 적용되었습니다. 현재 잔액: %.1f원%n", 
                    sa1.getBalance() * sa1.getInterestRate() / 100, sa1.getBalance());
            
            // 계좌 이체 테스트
            System.out.println("=== 계좌 이체 테스트 ===");
            bank.transfer("AC1002", "AC1001", 5000);
            System.out.printf("5000.0원이 AC1002에서 AC1001로 송금되었습니다.%n");
            
            // 모든 계좌 목록 출력
            bank.printAllAccounts();
            
            // 예외 테스트
            bank.withdraw("AC1001", 6000); // 출금 한도 초과
            bank.withdraw("AC1000", 20000); // 잔액 부족
            bank.findAccount("AC9999"); // 존재하지 않는 계좌
            
        } catch (AccountNotFoundException e) {
            System.out.println("예외 발생: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}