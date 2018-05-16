package ua.lviv.iot.goods.goods;

import ua.lviv.iot.goods.enums.CategoryEnum;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Good {
    public CategoryEnum categoryEnum;
    @Id
    private Integer id;
    private String name;
    private boolean aviability;
    private int price;
    private int pages = 1;

    public Good() {
    }

    public Good(String name, CategoryEnum categoryEnum, boolean aviability, int price, int pages) {
        this.name = name;
        this.categoryEnum = categoryEnum;
        this.aviability = aviability;
        this.price = price;
        this.pages = pages;
    }

    public Good(final Integer id, String name, CategoryEnum categoryEnum, boolean aviability, int price, int pages) {
        this.name = name;
        this.categoryEnum = categoryEnum;
        this.aviability = aviability;
        this.price = price;
        this.pages = pages;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAviability() {
        return aviability;
    }

    public void setAviability(boolean aviability) {
        this.aviability = aviability;
    }

    public CategoryEnum getCategoryEnum() {
        return categoryEnum;
    }

    public void setCategoryEnum(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeaders() {
        return "name, " + "category, " + " aviability ";
    }

    public String toCSV() {
        return name + "," + categoryEnum + "," + aviability + ",";
    }
}