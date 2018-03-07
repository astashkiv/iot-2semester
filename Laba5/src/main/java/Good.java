import java.util.Arrays;

public class Good {
  public char[] toString;
  private String name;
  private boolean aviability;
  CategoryEnum categoryEnum;
  private int price;
  protected int pages;



  public Good(String name, CategoryEnum categoryEnum, boolean aviability, int price, String author, int pages) {
    this.setName(name);
    this.categoryEnum = categoryEnum;
    this.aviability = aviability;
    this.setPrice(price);
    this.pages = pages;
  }

  String getType() {
    return categoryEnum.toString();
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

  public int getPages() {
    return pages;
  }


  public int getPrice() {
    return price;
  }


  public void setPrice(int price) {
    this.price = price;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Good{"
                + "name='" + name + '\''
                + ", aviability=" + aviability
                + ", categoryEnum=" + categoryEnum
                + ", price=" + price
                + ", pages=" + pages
                + '}';
  }
}