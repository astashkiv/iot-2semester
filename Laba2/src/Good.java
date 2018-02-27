public class Good {
	
    private String name;
	private boolean aviability;
	CategoryEnum categoryEnum;
	private int price;



	public Good(String name, CategoryEnum categoryEnum, boolean aviability, int price, String author, int pages) {
		this.setName(name);
		this.categoryEnum = categoryEnum;
		this.aviability = aviability;
		this.setPrice(price);
	}

	String getType() {
		return null;
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
		return getPages();
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
	
	
	

}