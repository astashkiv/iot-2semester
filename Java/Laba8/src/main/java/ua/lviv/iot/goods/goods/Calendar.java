package ua.lviv.iot.goods.goods;

import ua.lviv.iot.goods.enums.CategoryEnum;

public class Calendar extends Good {
    private String year;

    public Calendar(final Integer id, String name, CategoryEnum categoryEnum, boolean aviability, int price, String year, int pages) {
        super(id, name, categoryEnum, aviability, price, 1);
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "year";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + year;
    }
}