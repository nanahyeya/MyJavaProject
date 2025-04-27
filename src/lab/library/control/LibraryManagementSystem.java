package lab.library.control;

import java.util.List;

import lab.library.entity.Book;
import lab.library.entity.Library;

public class LibraryManagementSystem {

	public static void main(String[] args) {
        Library library = new Library("�߾� ������");

        addSampleBooks(library);
        
        System.out.println("===== �߾� ������ =====");

        library.getAvailableBooks();

        testFindBook(library);

        testCheckOut(library);

        testReturnBook(library);

        library.getAvailableBooks();
        
        printAvailableBooks(library);
    }
	
	private static void addSampleBooks(Library library) {
        library.addBook(new Book("�ڹ� ���α׷���", "���ڹ�", "978-89-01-12345-6", 2022));
        library.addBook(new Book("��ü������ ��ǰ� ����", "����ȣ", "978-89-01-67890-1", 2015));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0-13-235088-4", 2008));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "978-0-13-468599-1", 2018));
        library.addBook(new Book("Head First Java", "Kathy Sierra", "978-0-596-00920-5", 2005));
        library.addBook(new Book("�ڹ��� ����", "���ü�", "978-89-01-14077-4", 2019));
    }

	
	private static void testFindBook(Library library) {
        System.out.println("===== ���� �˻� �׽�Ʈ =====");
        
        Book bookByTitle = library.findBookByTitle("�ڹ��� ����");
        if (bookByTitle != null) {
            System.out.println("�������� �˻� ���:");
            System.out.println(bookByTitle);
            System.out.println();
        }

        Book bookByAuthor = library.findBookByAuthor("Robert C. Martin");
        if (bookByAuthor != null) {
            System.out.println("���ڷ� �˻� ���:");
            System.out.println(bookByAuthor);
            System.out.println();
        }
    }

    private static void testCheckOut(Library library) {
        System.out.println("===== ���� ���� �׽�Ʈ =====");
        boolean result = library.checkOutBook("978-89-01-14077-4"); // �ڹ��� ���� ISBN
        if (result) {
            System.out.println("���� ���� ����!");
            Book borrowed = library.findBookByTitle("�ڹ��� ����");
            System.out.println("����� ���� ����:");
            System.out.println(borrowed);
            System.out.println();
        } else {
            System.out.println("���� ���� ����!");
        }
        System.out.println("������ ���� ����:");
        library.getAvailableBooks();
    }
    
    private static void testReturnBook(Library library) {
        System.out.println("===== ���� �ݳ� �׽�Ʈ =====");
        boolean result = library.returnBook("978-89-01-14077-4");
        if (result) {
            System.out.println("���� �ݳ� ����!");
            Book returned = library.findBookByTitle("�ڹ��� ����");
            System.out.println("�ݳ��� ���� ����:");
            System.out.println(returned);
            System.out.println();
        } else {
            System.out.println("���� �ݳ� ����!");
        }

        System.out.println("������ ���� ����:");
        library.getAvailableBooks();
    }
    
    private static void printAvailableBooks(Library library) {
        System.out.println("===== ���� ������ ���� ��� =====");
        List<Book> books = library.getBooks();

        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
                System.out.println("------------------------");
            }
        }
    }
}
