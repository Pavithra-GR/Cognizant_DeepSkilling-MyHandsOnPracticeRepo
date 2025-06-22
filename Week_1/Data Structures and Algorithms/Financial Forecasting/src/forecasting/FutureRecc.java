package forecasting;

import java.util.Scanner;

public class FutureRecc {
	public double futureVal(double initial,double growth, int year) {
		if(year==0) {
			return initial;
		}
		return futureVal(initial, growth, year-1) *(1+growth);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Initial value ");
		double initial=scanner.nextDouble();
		
		System.out.println("Enter the Growth value ");
		double growth=scanner.nextDouble();
		
		System.out.println("Enter the year ");
		int year=scanner.nextInt();
		FutureRecc futureRecc=new FutureRecc();
		double val=futureRecc.futureVal(initial, growth, year);
		System.out.println("Future value after "+year+" "+val);
		
	}

}
