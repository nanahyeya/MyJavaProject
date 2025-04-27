package lab.book.control;
import java.util.Arrays;
import java.util.List;

import lab.book.entity.Magazine;
import lab.book.entity.Novel;
import lab.book.entity.Publication;
import lab.book.entity.ReferenceBook;

public class ManageBook {
    public static void main(String[] args) {
        // Create sample publications
        List<Publication> publications = Arrays.asList(
            new Magazine("����ũ�μ���Ʈ", "2007-10-01", 328, 9900, "�ſ�"),
            new Magazine("�濵����ǻ��", "2007-10-03", 316, 9000, "�ſ�"),
            new Novel("���߿�", "2007-07-01", 396, 9800, "����������������", "����Ҽ�"),
            new Novel("���ѻ꼺", "2007-04-14", 383, 11000, "����", "���ϼҼ�"),
            new ReferenceBook("�ǿ��������α׷���", "2007-01-14", 496, 25000, "����Ʈ�������"),
            new Novel("�ҳ��̿´�", "2014-05-01", 216, 15000, "�Ѱ�", "����Ҽ�"),
            new Novel("�ۺ������ʴ´�", "2021-09-09", 332, 15120, "�Ѱ�", "����Ҽ�")
        );

        // Print publication information
        System.out.println("==== ���� ���� ��� ====");
        for (int i = 0; i < publications.size(); i++) {
            System.out.println((i+1) + ". " + publications.get(i));
        }

        // Price modification example
        Publication lastBook = publications.get(publications.size() - 1);
        System.out.println("\n==== ���� ���� ====");
        System.out.println(lastBook.getTitle() + " ���� �� ����: " + lastBook.getPrice() + "��");
        lastBook.setPrice((int)(lastBook.getPrice() * 0.8)); // 20% discount
        System.out.println(lastBook.getTitle() + " ���� �� ����: " + lastBook.getPrice() + "��");
        System.out.println("����: " + (int)(lastBook.getPrice() * 0.25) + "��"); // 20% of original is 25% of new

        // Shopping cart example
        ShoppingCart cart = new ShoppingCart();
        publications.forEach(cart::addItem);

        // Statistics analysis
        StatisticAnalyser analyser = new StatisticAnalyser();
        analyser.printStatistics(publications);
    }
}