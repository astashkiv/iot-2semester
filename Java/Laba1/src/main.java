
public class main {
	 public static void main(String args[])
	    {
		 Bicycle ural = new Bicycle();
		 Bicycle moscow80 = new Bicycle("BMX", "village", "USSR", 1200);
		 Bicycle ukraina = new Bicycle("extreme", "city", "Zhytomyr", 3445, true);
	        
	        System.out.println(ural.toString());
	        System.out.println(moscow80.toString());
	        System.out.println(ukraina.toString());
	        
	        ural.resetValues("portable", "mountains", "China", 740, true);
	        
	        ural.printSum();
	        moscow80.printSum();
	        ukraina.printSum();
	        
	        ural.setDiscountPrice(999);
	        
	        Bicycle.printStaticSum();
	        
	    }
	}
