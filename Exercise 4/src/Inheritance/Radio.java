package Inheritance;

import java.util.Scanner;

public class Radio {
	
	Scanner r = new Scanner(System.in);
	
	private String brand;
	private char bluetooth;
	private int warranty;
	private double price ;
	
	Radio(String b, char t, int w, double p)  {
		System.out.println("Enter the brand of the radio : ");
		this.brand = r.nextLine();
		System.out.println("Does the radio have bluetooth ? : ");
		this.bluetooth = r.next().charAt(0);
		System.out.println("How long is the warranty of the radio ? : ");
		this.warranty = r.nextInt();
		System.out.println("What is a price of a radio ? : ");
		this.price = r.nextDouble();
	}
	

	public String getBrand() {
		return brand ;
		
	}
	
	public char getBluetooth () {
		return bluetooth ; 
		
	}
	
	public int getWarranty () {
		return warranty ;
	}
	
	public double getPrice() {
		return price ;
	}
	
	public double discountedprice(double d) {
		return discountedprice (price*0.25);
	
	}
	
	public String toString() {
		return "Brand: " + brand 
      + "\n" + "Bluetooth : " + bluetooth 
      + "\n" + "Warranty : " + warranty 
      + "\n" + "Price: RM " + price;
	}

	}
	
