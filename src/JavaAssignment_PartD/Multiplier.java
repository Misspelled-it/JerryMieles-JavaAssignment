package JavaAssignment_PartD;
import java.util.*;
public class Multiplier extends Mathematician{
	Multiplier(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = 0;
		this.result = 0;
		this.responseTime = 0;
		this.timeRequested = new Date();
	}
	Multiplier(int num1, int num2, int num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.result = 0;
		this.responseTime = 0;
		this.timeRequested = new Date();
	}
	public void multiply(int num1, int num2) {
		this.result = this.num1 * this.num2;
		Date timeNow = new Date();
		this.responseTime = (int) (this.timeRequested.getTime() - timeNow.getTime());
		print(this.result, this.responseTime);
	}
	public void multiply(int num1, int num2, int num3) {
		this.result = this.num1 * this.num2 * this.num3;
		Date timeNow = new Date();
		this.responseTime = this.timeRequested.getSeconds() - timeNow.getSeconds();
		print(this.result, this.responseTime);
	}

	void add(int num1, int num2) {}

	void subtract(int num1, int num2) {}

	void divide(int num1, int num2) {}

}