package mypackage;

public class TaxCalculator{
	public TaxCalculator() {}
	public double lakh = 100000;
	
	public double calculateTax(String empName, boolean isIndian, double empSal) throws Exception {
		double taxAmount;
		if(!isIndian) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		if(empName.isBlank() || empName.isEmpty()) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		
		if(empSal > lakh) {
			taxAmount = empSal * 0.08;
		}
		else if (empSal <= lakh && empSal >= 50000) {
			taxAmount = empSal * 0.06;
		}
		else if (empSal <= 50000 && empSal >= 30000) {
			taxAmount = empSal * 0.05;
		}
		else if (empSal <= 30000 && empSal >= 10000) {
			taxAmount = empSal * 0.04;
		}
		else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}
		return taxAmount;
	}

}
