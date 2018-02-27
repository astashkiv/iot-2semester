import java.util.ArrayList;
import java.util.List;

public class BookShop {
	


	public BookShop(ArrayList<Good> goods) {
		// TODO Auto-generated constructor stub
	}

	ArrayList<Good> searchByPages (ArrayList<Good> goods) {
		goods.sort((o1, o2) -> o1.getPages()
				- o2.getPages());
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
