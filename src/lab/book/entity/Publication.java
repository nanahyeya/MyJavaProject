package lab.book.entity;


public class Publication {
    private String title;
    private String publishDate;
    private int page;
    private int price;

    // Constructors
    public Publication() {}
    
    public Publication(String title, String publishDate, int page, int price) {
        this.title = title;
        this.publishDate = publishDate;
        this.page = page;
        this.price = price;
    }

    // Getters
    public String getTitle() { return title; }
    public String getPublishDate() { return publishDate; }
    public int getPage() { return page; }
    public int getPrice() { return price; }
    
    // Setter for price modification
    public void setPrice(int price) { this.price = price; }

    @Override
    public String toString() {
        return title;
    }
}