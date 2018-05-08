package com.company.astashkiv;

import com.company.astashkiv.Good;

public class Book extends Good {
	
	
    private String author;
	int pages;


	public Book(String name, CategoryEnum categoryEnum, boolean aviability, int price, String author, int pages) {
		super(name, categoryEnum, aviability, price, author, pages);
		this.author = author;
		this.pages = pages; 
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}

    
	 @Override
	    String getType() {
	        return "Book " + getName() + " by " + author + "\n"
	        		+ "Number of pages: " + pages + "\n"
	        		+ "Price: " + getPrice() + "UAN" + "\n"
	        		+ "Aviability: " + isAviability() + "\n";
	    }



  
}