package Quiz_2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		double totalPrice;
		int lengthOfMonths;
		double interestRate;
		double monthlyPayment;
		double interest;
		double carCost;

		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total price of the car");
		totalPrice = input.nextDouble();
		
		System.out.println("Enter the duration of the loan");
		lengthOfMonths = input.nextInt();
		
		System.out.println("Enter the interest rate");
		interestRate = input.nextDouble();
		
		
		Price_Calculator thisCar = new Price_Calculator(totalPrice, lengthOfMonths, interestRate);
		
		carCost = thisCar.carCost(totalPrice, interestRate);
		interest = thisCar.interest(carCost, totalPrice);
		monthlyPayment = thisCar.monthlyPayment(carCost, lengthOfMonths);
		
		System.out.printf("monthly payment is %s%n", monthlyPayment);
		System.out.printf("Total interest is %s%n", interest);
		
	
		
		
	}

}
