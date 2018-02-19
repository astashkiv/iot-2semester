
public class Bicycle {
	private String situation = "Any";
	private String type;
	private String maker;
	private double discountPrice;
	private boolean forChildren;
	
	public static double originalPrice = 2900;

	public Bicycle() {
	}
	
	public Bicycle (String type, String situation, String maker, double discountPrice) {
		setSituation(situation);
		setType(type);
		setMaker(maker);
		setDiscountPrice(discountPrice);
	}
	
	public Bicycle (String type, String situation, String maker, double discountPrice, boolean forChildren) {
		setSituation(situation);
		setType(type);
		setMaker(maker);
		setDiscountPrice(discountPrice);
		setForChildren(forChildren);
	}
	
	public String toString() {
		return "This is " + type + " bicycle for " + situation + " by " + maker + "\nIs it for children? " + forChildren + "\nHow much with discount? " + discountPrice + "$";	
	}
	
	public static void printStaticSum () {
		 System.out.println("Price without discount  " + originalPrice + "$");
	}
	
	 public void printSum() {
		 System.out.println("This " + type + " bicycle for " + situation + " by " + maker + " now costs " + discountPrice + "$, not " + originalPrice + "$");
	 }
	 
	public void resetValues(String type, String situation, String maker, double discountPrice, boolean forChildren) {
		setSituation(situation);
		setType(type);
		setMaker(maker);
		setDiscountPrice(discountPrice);
		setForChildren(forChildren);
	}
	
	 	public String getSituation() {
	        return situation;
	    }

	    public void setSituation(String situation) {
	        this.situation = situation;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }
	    
		public String getMaker() {
	        return maker;
	    }

	    public void setMaker(String maker) {
	        this.maker = maker;
	    }
	    
	    public double getDiscountPrice() {
	        return discountPrice;
	    }

	    public void setDiscountPrice(double discountPrice) {
	        this.discountPrice = discountPrice;
	    }

	    public boolean getForChildren() {
	    	return forChildren;
	    }
	 
	    public void setForChildren(boolean forChildren) {
	    	this.forChildren = forChildren;
		}
	    	
		
}