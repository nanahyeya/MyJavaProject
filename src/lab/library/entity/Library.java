package lab.library.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
    private String name;
    private List<Book> books;
    
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("도서가 추가되었습니다: " + book.getTitle());
    }
    
    public List<Book> getBooks() {
        return books;
    }
    
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle() == title) {
                return book;
            }
        }
        return null;
    }
    
    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }
    
    public boolean checkOutBook(String isbn) {
        for (Book book : books) {
            if (book != null && book.getIsbn().equals(isbn)) {
                return book.checkOut();
            }
        }
        return false;
    }
    
    public boolean returnBook(String isbn) {
        for (Book book : books) {
            if (book != null && book.getIsbn().equals(isbn)) {
                book.returnBook();
                return true;
            }
        }
        return false;
    }
    
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
    
    public void getAllBooks() {
    	
    	List<Book> availableBooks = getAvailableBooks();
        
    	int count = 0;
        for (Book book : books) {
            if (book.isAvailable()) {
                count++;
            }
        }
        
        int checkedoutbookcount = books.size() - count;
        
        System.out.println("전체 도서 수: " +  books.size());
        System.out.println("대출 가능 도서 수: " + count);
        System.out.println("대출 중인 도서 수: " + checkedoutbookcount);
        System.out.println();
        
    }



}
