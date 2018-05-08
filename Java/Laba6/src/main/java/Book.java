public class Book extends Good {
    private String author;


    public Book(String name, CategoryEnum categoryEnum, boolean aviability, int price, String author, int pages) {
        super(name, categoryEnum, aviability, price, author, pages);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}