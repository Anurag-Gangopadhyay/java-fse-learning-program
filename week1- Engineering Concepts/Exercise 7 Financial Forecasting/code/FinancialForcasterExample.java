//week 1 exercise 4- Financial Forcasting

/**This program uses a recursive method to calculate future growth rates for nth year by calculating the average growth rates of
* past 3 alternate years. For example, growth rate of 7th year, is equal to average(rate of 6th year+ 4th year + 2nd year).
* The rates of first 5 years are taken as input, as past values. */

import java.util.*;
class Predictor{
	public double predict(double past_rates[], int nth_year){// recursive method to predict by average of previous 3 alternate years
		if(nth_year > 0 && nth_year < 6){
			return( past_rates[nth_year-1] );
		}
		else{
			return((predict(past_rates, nth_year-1) + predict(past_rates, nth_year-3) + predict(past_rates, nth_year-5)) / 3);
		}
	}
}
class FinancialForcasterExample{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Predictor p= new Predictor();
		double[] past_rates= new double[5];
		
		System.out.println("Enter growth rates of previous five years:");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+"th year: ");
			past_rates[i] = sc.nextDouble();
		}
		
		System.out.println("Enter nth year for prediction: ");
		int year= sc.nextInt();
		double result= p.predict(past_rates, year);
		System.out.println("Predicted growth rate = "+ result);
	}
}
		
			