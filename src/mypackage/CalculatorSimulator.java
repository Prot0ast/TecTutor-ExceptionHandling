//Author: Alan Barragan
//Project: Exceptions
package mypackage;

public class CalculatorSimulator {

	public CalculatorSimulator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TaxCalculator cal = new TaxCalculator();
//		try {
//			System.out.println(cal.calculateTax("Ron", false, 34000));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println(cal.calculateTax("Tim", true, 1000));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			System.out.println(cal.calculateTax("Jack", true, 55000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			System.out.println(cal.calculateTax(null, true, 30000));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//commented out for the sake of testing
	}

}
