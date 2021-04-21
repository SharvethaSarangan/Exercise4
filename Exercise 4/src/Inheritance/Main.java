package Inheritance;

public class Main {

	public static void main(String[] args) {

		Radio object1 = new Radio ("SAMSUNG", 'Y', 2, 35.50 );
		Philips object2 = new Philips("PHILIPS", 'Y', 3, 45.50, 3);
		
		System.out.println(object1);
		System.out.println("*****************************************************");
		System.out.println("Total Price Base On Quantity: RM " + object2.getTotalPrice());
	    }
	}
