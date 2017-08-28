package JavaAssignment_PartD;
import java.util.*;
public class Divider extends Mathematician{
	Divider(int num1, int num2, long timeRequested){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = 0;
		this.result = 0;
		this.responseTime = 0;
		this.timeRequested = new Date(timeRequested);
	}
	Divider(int num1, int num2, int num3, long timeRequested){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.result = 0;
		this.responseTime = 0;
		this.timeRequested = new Date(timeRequested);
	}
	public void divide(int num1, int num2) {
		this.result = this.num1 / this.num2;
		Date timeNow = new Date();
		this.responseTime = timeNow.getSeconds() - this.timeRequested.getSeconds();
		print(this.result, this.responseTime);
	}
	public void divide(int num1, int num2, int num3) {
		this.result = this.num1 / this.num2 / this.num3;
		Date timeNow = new Date();
		this.responseTime = timeNow.getSeconds() - this.timeRequested.getSeconds();
		print(this.result, this.responseTime);
	}

	void add(int num1, int num2) {}

	void subtract(int num1, int num2) {}

	void multiply(int num1, int num2) {}

}