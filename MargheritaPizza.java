package com.miit.pizzaApplication;

import java.util.Scanner;

public class MargheritaPizza extends PizzaApp {
	
	String base; // round, square
	String size; // small, medium, large, x-large
	double BASE_PRICE = 7.99;
	Toppings toppings;  // onion, cheese, tomato, jalepeno, corn
	
	double totalCost;
	double toppingsCost;
	
	Scanner sc = new Scanner(System.in);
	int ch;
	
	public void addToppings() {
		System.out.println("Please choose your toppings from below...");
		do {
			System.out.println(" 1. Onion ($1) \n 2. Cheese ($1.50) \n 3. Tomato ($1) \n 4. Jalapeno ($1) \n 5. Corn ($1.50) \n 6. Done with Toppings.");
			
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				toppingsCost = toppingsCost + ONION_PRICE;
				//totalPizzaPrice();
			break;
			
			case 2:
				toppingsCost = toppingsCost + CHEESE_PRICE;
				//totalPizzaPrice();
			break;
			
			case 3:
				toppingsCost = toppingsCost + TOMATO_PRICE;
				//totalPizzaPrice();
			break;
			
			case 4:
				toppingsCost = toppingsCost + JALAPENO_PRICE;
				//totalPizzaPrice();
			break;
			
			case 5:
				toppingsCost = toppingsCost + CORN_PRICE;
				//totalPizzaPrice();
			break;
			
			case 6:
				totalPizzaPrice();
				System.out.println("Exiting from toppings choice. Thank you for choosing your toppings !!");
				
			break;
		}
		
		} while (ch!=6);
		
	}
	
	public void totalPizzaPrice() {
		totalCost = BASE_PRICE + toppingsCost;
		double priceAfterTax = (totalCost + totalCost * 0.13);
		System.out.println("Total Price for your Margherita Pizza ==> $" + totalCost + " + 13% Tax = " + (double) Math.round(priceAfterTax * 100)/100);
	}

}
