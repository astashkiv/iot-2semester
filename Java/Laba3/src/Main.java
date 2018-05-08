package com.company.astashkiv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
    	Book harryPotter = new Book("Harry Potter", CategoryEnum.FICTION, true, 150, "J.K. Roaling", 500);
        Book one = new Book("1984", CategoryEnum.FICTION, true, 200, "J. Orvell", 300);
        Book crucible = new Book("The Crusible", CategoryEnum.FICTION, true, 180, "A. Miller", 195);
    	Calendar newYear = new Calendar("New Year Calendar", CategoryEnum.CALENDAR, false, 20, "2018-2020", 1);
    	Sketchbook miffBook = new Sketchbook("Miff", CategoryEnum.DRAWING, true, 70, "Black", 1);


    	 ArrayList<Good> goods = new ArrayList<>();

        String inputNumber;
        Scanner mainmenuScanner = new Scanner(System.in); // Reading from System.in

        goods.add(harryPotter);
        goods.add(newYear);
        goods.add(crucible);
        goods.add(miffBook);
        goods.add(one);

         BookShop bookShop = new BookShop(goods);


        List<Good> sortedList = bookShop.searchByPages(goods); // Sort by pages

        List<Good> sortedList2 = bookShop.searchByCategory(goods, CategoryEnum.FICTION); // Sort by category FICTION


        do {

            System.out.println("\n"+"\n"+
                    "Choose an option:" + "\n" + "1. Sort by pages." + "\n" + "2. Sort by category FICTION." + "\n");

            inputNumber = mainmenuScanner.next(); // Scans the next token of the input.

            switch (inputNumber) {
                case "1":{
                    System.out.println("Sorted by pages:");
                    for(int i = 0; i < sortedList.size(); i++ ) {
                        System.out.println(sortedList.get(i).toString());
                    }
                    break;
                }

                case "2": {
                    System.out.println("Sorted by category FICTION:");
                    for(int i = 0; i < sortedList2.size(); i++ ) {
                        System.out.println(sortedList2.get(i).toString());
                    }
                    break;
                }



            }
        } while (!inputNumber.equals("0"));


    }
}
