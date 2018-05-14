package ua.lviv.iot.goods.goods;

import ua.lviv.iot.goods.enums.CategoryEnum;

public class Sketchbook extends Good {

    private String colour;

    public Sketchbook(final Integer id, String name, CategoryEnum categoryEnum, boolean aviability, int price, String colour, int pages) {
        super(id, name, categoryEnum, aviability, price, colour, 1);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "colour";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + colour;
    }

}

    