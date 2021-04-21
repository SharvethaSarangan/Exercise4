package Inheritance;

public class Philips extends Radio {
	
   private int quantity;
		
	public Philips (String b, char t, int w, double p , int q) {
		super(b, t, w, p);
		quantity = q;
		
	}
	
	public int getQuantity() {
		return quantity;
}
	

	public double getTotalPrice() {
		return super.getPrice() * quantity;
	}
		
	public String toString() {
		return super.toString() + "\n" + "Quantity: " + quantity;
	}

}