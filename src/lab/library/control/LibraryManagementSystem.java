package lab.library.control;

import java.util.List;

import lab.library.entity.Book;
import lab.library.entity.Library;

public class LibraryManagementSystem {

	public static void main(String[] args) {
        Library library = new Library("중앙 도서관");

        addSampleBooks(library);
        
        System.out.println("===== 중앙 도서관 =====");

        library.getAvailableBooks();

        testFindBook(library);

        testCheckOut(library);

        testReturnBook(library);

        library.getAvailableBooks();
        
        printAvailableBooks(library);
    }
	
	private static void addSampleBooks(Library library) {
        library.addBook(new Book("자바 프로그래밍", "김자바", "978-89-01-12345-6", 2022));
        library.addBook(new Book("객체지향의 사실과 오해", "조영호", "978-89-01-67890-1", 2015));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0-13-235088-4", 2008));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "978-0-13-468599-1", 2018));
        library.addBook(new Book("Head First Java", "Kathy Sierra", "978-0-596-00920-5", 2005));
        library.addBook(new Book("자바의 정석", "남궁성", "978-89-01-14077-4", 2019));
    }

	
	private static void testFindBook(Library library) {
        System.out.println("===== 도서 검색 테스트 =====");
        
        Book bookByTitle = library.findBookByTitle("자바의 정석");
        if (bookByTitle != null) {
            System.out.println("제목으로 검색 결과:");
            System.out.println(bookByTitle);
            System.out.println();
        }

        Book bookByAuthor = library.findBookByAuthor("Robert C. Martin");
        if (bookByAuthor != null) {
            System.out.println("저자로 검색 결과:");
            System.out.println(bookByAuthor);
            System.out.println();
        }
    }

    private static void testCheckOut(Library library) {
        System.out.println("===== 도서 대출 테스트 =====");
        boolean result = library.checkOutBook("978-89-01-14077-4"); // 자바의 정석 ISBN
        if (result) {
            System.out.println("도서 대출 성공!");
            Book borrowed = library.findBookByTitle("자바의 정석");
            System.out.println("대출된 도서 정보:");
            System.out.println(borrowed);
            System.out.println();
        } else {
            System.out.println("도서 대출 실패!");
        }
        System.out.println("도서관 현재 상태:");
        library.getAvailableBooks();
    }
    
    private static void testReturnBook(Library library) {
        System.out.println("===== 도서 반납 테스트 =====");
        boolean result = library.returnBook("978-89-01-14077-4");
        if (result) {
            System.out.println("도서 반납 성공!");
            Book returned = library.findBookByTitle("자바의 정석");
            System.out.println("반납된 도서 정보:");
            System.out.println(returned);
            System.out.println();
        } else {
            System.out.println("도서 반납 실패!");
        }

        System.out.println("도서관 현재 상태:");
        library.getAvailableBooks();
    }
    
    private static void printAvailableBooks(Library library) {
        System.out.println("===== 대출 가능한 도서 목록 =====");
        List<Book> books = library.getBooks();

        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
                System.out.println("------------------------");
            }
        }
    }
}
