public class Sketchbook extends Good {
  private String colour;


  public Sketchbook(String name, CategoryEnum categoryEnum, boolean aviability, int price, String colour, int pages) {
   super(name, categoryEnum, aviability, price, colour, 1);
    this.colour = colour;
  }


  public String getColour() {
    return colour;
  }


  public void setColour(String colour) {
    this.colour = colour;
  }


  @Override
  String getType() {
    return "Sketchbook " + getName() + ", " + colour + " colour" + "\n"
      + "Price: " + getPrice() + "UAN" + "\n"
      + "Aviability: " + isAviability() + "\n";
  }
}

    