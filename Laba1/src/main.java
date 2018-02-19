
public class main {
	 public static void main(String args[])
	    {
		 Bicycle Ural = new Bicycle();
		 Bicycle Moscow80 = new Bicycle("BMX", "village", "USSR", 1200);
		 Bicycle Ukraina = new Bicycle("extreme", "city", "Zhytomyr", 3445, true);
	        
	        System.out.println(Ural.toString());
	        System.out.println(Moscow80.toString());
	        System.out.println(Ukraina.toString());
	        
	        Ural.resetValues("portable", "mountains", "China", 740, true);
	        
	        Ural.printSum();
	        Moscow80.printSum();
	        Ukraina.printSum();
	        
	        Ural.setDiscountPrice(999);
	        
	        Bicycle.printStaticSum();
	        
	    }
	}
