package com.cognizant.tax;

public class TaxCalculator {
	float basicSalary;
	boolean citizenship;
	float tax;
	int nettSalary;
	public TaxCalculator(float salary, boolean citizen) {
		this.basicSalary = salary;
		this.citizenship = citizen;
	}
	public void calculateTax() {
		this.tax = 30*this.basicSalary/100;
		System.out.println("The Tax of the employee for the "+(int)this.basicSalary +" is " + (int)this.tax);
	}
	public void deductTax() {
		this.nettSalary = (int)(this.basicSalary-this.tax);
		System.out.println("The nett salary of the employee "+(int)this.nettSalary);
	}
	public void validateSalary(){
		if(this.citizenship && this.basicSalary>100000f) {
			System.out.println("The salary and citizenship eligibility: true");
		}
		else {
			System.out.println("The salary and citizenship eligibility: false");
		}
	}
}
