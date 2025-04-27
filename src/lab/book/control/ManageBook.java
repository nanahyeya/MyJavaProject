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
            new Magazine("마이크로소프트", "2007-10-01", 328, 9900, "매월"),
            new Magazine("경영과컴퓨터", "2007-10-03", 316, 9000, "매월"),
            new Novel("빠삐용", "2007-07-01", 396, 9800, "베르나르베르베르", "현대소설"),
            new Novel("남한산성", "2007-04-14", 383, 11000, "김훈", "대하소설"),
            new ReferenceBook("실용주의프로그래머", "2007-01-14", 496, 25000, "소프트웨어공학"),
            new Novel("소년이온다", "2014-05-01", 216, 15000, "한강", "장편소설"),
            new Novel("작별하지않는다", "2021-09-09", 332, 15120, "한강", "장편소설")
        );

        // Print publication information
        System.out.println("==== 도서 정보 출력 ====");
        for (int i = 0; i < publications.size(); i++) {
            System.out.println((i+1) + ". " + publications.get(i));
        }

        // Price modification example
        Publication lastBook = publications.get(publications.size() - 1);
        System.out.println("\n==== 가격 변경 ====");
        System.out.println(lastBook.getTitle() + " 변경 전 가격: " + lastBook.getPrice() + "원");
        lastBook.setPrice((int)(lastBook.getPrice() * 0.8)); // 20% discount
        System.out.println(lastBook.getTitle() + " 변경 후 가격: " + lastBook.getPrice() + "원");
        System.out.println("차액: " + (int)(lastBook.getPrice() * 0.25) + "원"); // 20% of original is 25% of new

        // Shopping cart example
        ShoppingCart cart = new ShoppingCart();
        publications.forEach(cart::addItem);

        // Statistics analysis
        StatisticAnalyser analyser = new StatisticAnalyser();
        analyser.printStatistics(publications);
    }
}