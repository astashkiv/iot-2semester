package com.company.astashkiv;

public class Calendar extends Good {


    private String year;
    
	public Calendar(String name, CategoryEnum categoryEnum, boolean aviability, int price, String year, int pages) {
		super(name, categoryEnum, aviability, price, year, 1);
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	 @Override
	    String getType() {
	        return "Calendar " + getName() + " of " + year + " years" + "\n"
	        		+ "Price: " + getPrice() + "UAN" + "\n"
	        		+ "Aviability: " + isAviability()+ "\n";
	    }

 
}