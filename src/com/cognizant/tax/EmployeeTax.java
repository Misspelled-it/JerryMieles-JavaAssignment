package com.cognizant.tax;

public class EmployeeTax {

	public static void main(String[] args) {
		TaxCalculator emp1 = new TaxCalculator(25000, true);
		TaxCalculator emp2 = new TaxCalculator(125000, true);
		emp1.calculateTax();
		emp1.deductTax();
		emp1.validateSalary();
		emp2.calculateTax();
		emp2.deductTax();
		emp2.validateSalary();
	}

}
