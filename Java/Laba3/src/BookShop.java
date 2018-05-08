package com.company.astashkiv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookShop {
	


	public BookShop(ArrayList<Good> goods) {
		// TODO Auto-generated constructor stub
	}

	ArrayList<Good> searchByPages (ArrayList<Good> goods) {
		goods.sort(Comparator.comparingInt(Good::getPages));
		return goods;
	}
	
	ArrayList<Good> searchByCategory (ArrayList<Good> goods, CategoryEnum categoryEnum) {
		List<Good> listInput = new ArrayList<Good>();
		for (int i = 0; i < goods.size(); i++) {
		      if(goods.get(i).categoryEnum == categoryEnum) {
		          
				listInput.add(goods.get(i));
		            }
		    }
		return (ArrayList<Good>) listInput;
	}	
	
	
	

}
