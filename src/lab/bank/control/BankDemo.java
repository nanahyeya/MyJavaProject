package lab.bank.control;

import lab.bank.entity.*;
import lab.bank.exception.*;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank(10);
        
        try {
            // ���� ����
            System.out.println("=== ���� ���� ===");
            SavingsAccount sa1 = bank.createSavingsAccount("ȫ�浿", 10000, 3.0);
            System.out.printf("Saving(����) ���°� �����Ǿ����ϴ�: %s%n", sa1);
            
            CheckingAccount ca1 = bank.createCheckingAccount("��ö��", 20000, 5000);
            System.out.printf("üŷ ���°� �����Ǿ����ϴ�: %s%n", ca1);
            
            SavingsAccount sa2 = bank.createSavingsAccount("�̿���", 30000, 2.0);
            System.out.printf("���� ���°� �����Ǿ����ϴ�: %s%n", sa2);
            
            // ��� ���� ��� ���
            bank.printAllAccounts();
            
            // �Ա�/��� �׽�Ʈ
            System.out.println("=== �Ա�/��� �׽�Ʈ ===");
            bank.deposit("AC1000", 5000);
            System.out.printf("5000.0���� �ԱݵǾ����ϴ�. ���� �ܾ�: %.1f��%n", bank.findAccount("AC1000").getBalance());
            
            bank.withdraw("AC1001", 3000);
            System.out.printf("3000.0���� ��ݵǾ����ϴ�. ���� �ܾ�: %.1f��%n", bank.findAccount("AC1001").getBalance());
            
            // ���� ���� �׽�Ʈ
            System.out.println("=== ���� ���� �׽�Ʈ ===");
            sa1.applyInterest();
            System.out.printf("���� %.1f���� ����Ǿ����ϴ�. ���� �ܾ�: %.1f��%n", 
                    sa1.getBalance() * sa1.getInterestRate() / 100, sa1.getBalance());
            
            // ���� ��ü �׽�Ʈ
            System.out.println("=== ���� ��ü �׽�Ʈ ===");
            bank.transfer("AC1002", "AC1001", 5000);
            System.out.printf("5000.0���� AC1002���� AC1001�� �۱ݵǾ����ϴ�.%n");
            
            // ��� ���� ��� ���
            bank.printAllAccounts();
            
            // ���� �׽�Ʈ
            bank.withdraw("AC1001", 6000); // ��� �ѵ� �ʰ�
            bank.withdraw("AC1000", 20000); // �ܾ� ����
            bank.findAccount("AC9999"); // �������� �ʴ� ����
            
        } catch (AccountNotFoundException e) {
            System.out.println("���� �߻�: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("���� �߻�: " + e.getMessage());
        }
    }
}