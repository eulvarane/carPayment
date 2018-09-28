package Quiz_2;

public class Price_Calculator {

		
	private double totalPrice;
	private int lengthOfMonths;
	private double interestRate;
	private double monthlyPayment;
	private double interest;
	private double carCost;
	
	
	
	
public Price_Calculator(double totalPrice, int lengthOfMonths, double interestRate) {
		super();
		this.totalPrice = totalPrice;
		this.lengthOfMonths = lengthOfMonths;
		this.interestRate = interestRate;
	}


	
	public double carCost(double totalPrice, double interestRate){
		carCost = totalPrice+((totalPrice*interestRate)/100);
		return carCost;
	}
	
	public double monthlyPayment (double carCost, double lengthOfMonths){
		monthlyPayment = carCost/lengthOfMonths;
		return monthlyPayment;
	}
	
	public double interest(double carCost, double totalPrice) {
	return (carCost - totalPrice);
	}
	
	
}

	

	
	

