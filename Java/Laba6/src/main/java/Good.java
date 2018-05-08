public class Good {

    private String name;
    private boolean aviability;
    private int price;
    private int pages = 1;
    private CategoryEnum categoryEnum;

    public Good(String name, CategoryEnum categoryEnum, boolean aviability, int price, String author, int pages) {
        this.setName(name);
        this.categoryEnum = categoryEnum;
        this.aviability = aviability;
        this.setPrice(price);
        this.pages = pages;
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

}