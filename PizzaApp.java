package com.miit.pizzaApplication;

import java.util.Scanner;

public class PizzaApp {

	double price;
	public static double ONION_PRICE = 1.00;
	public static double CHEESE_PRICE = 1.50;
	public static double TOMATO_PRICE = 1.00;
	public static double JALAPENO_PRICE = 1.00;
	public static double CORN_PRICE = 1.50;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		
		PizzaApp vegPizza = new VeggiePizza();
		PizzaApp margPizza = new MargheritaPizza();
		PizzaApp dPizza = new DeluxePizza();
		
		do {
			System.out.println("Choose your Pizza type from below.");
			System.out.println(" 1. Veggie Pizza \n 2. Marghetia Pizza \n 3. Deluxe Pizza \n 4. Exit");
			
			System.out.println("Enter your choice...");
			
			ch = sc.nextInt();
			
			switch (ch) {
				case 1:
					System.out.println("You have chosen Veggie Pizza...");
					System.out.println("Veggie Pizza Base Price is $8.99");
					((VeggiePizza) vegPizza).addToppings();
				break;
				
				case 2:
					System.out.println("You have chosen Margherita Pizza...");
					System.out.println("Margherita Pizza Base Price is $7.99");
					((MargheritaPizza) margPizza).addToppings();
					
				break;
				
				case 3:
					System.out.println("You have chosen Deluxe Pizza...");
					System.out.println("Deluxe Pizza Base Price is $9.99");
					((DeluxePizza) dPizza).addToppings();
				break;
				
				case 4:
					System.out.println("Thank you for ordering your Pizza. Exiting from this menu, Byee !!");					
				break;
				default:
					System.out.println("Enter a valid choice...");
			}
		} while (ch != 4);
		
		sc.close();
	}	

}
