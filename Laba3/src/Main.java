package com.company.astashkiv;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {
    	Book harryPotter = new Book("Harry Potter", CategoryEnum.FICTION, true, 150, "J.K. Roaling", 500);
        Book one = new Book("1984", CategoryEnum.FICTION, true, 200, "J. Orvell", 300);
        Book crucible = new Book("The Crusible", CategoryEnum.FICTION, true, 180, "A. Miller", 195);
    	Calendar newYear = new Calendar("New Year Calendar", CategoryEnum.CALENDAR, false, 20, "2018-2020", 1);
    	Sketchbook miffBook = new Sketchbook("Miff", CategoryEnum.DRAWING, true, 70, "Black", 1);

    	
    	 ArrayList<Good> goods = new ArrayList<>();
         

        goods.add(harryPotter);
        goods.add(newYear);
        goods.add(crucible);
        goods.add(miffBook);
        goods.add(one);

         BookShop bookShop = new BookShop(goods);

        System.out.println("\n Sorted by pages:");

         List<Good> sortedList = bookShop.searchByPages(goods);
        		 for(int i = 0; i < sortedList.size(); i++ ) {
        		 System.out.println(sortedList.get(i).toString());
        		 }

        System.out.println("\n Sorted by category FICTION:");
        sortedList = bookShop.searchByCategory(goods, CategoryEnum.FICTION);
        for(int i = 0; i < sortedList.size(); i++ ) {
            System.out.println(sortedList.get(i).toString());
        }

    }
}
