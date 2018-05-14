package ua.lviv.iot.goods.goods;

import ua.lviv.iot.goods.enums.CategoryEnum;

public class Book extends Good {
    private String author;


    public Book(final Integer id, String name, CategoryEnum categoryEnum, boolean aviability, int price, String author, int pages) {
        super(id, name, categoryEnum, aviability, price, author, pages);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String getHeaders() {
        return super.getHeaders() + "author";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + author;
    }

}