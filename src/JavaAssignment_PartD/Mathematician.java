package JavaAssignment_PartD;
import java.util.*;

public abstract class Mathematician {
	protected int num1, num2, num3, result, responseTime;
	Date timeRequested;
	abstract void add(int num1, int num2);
	abstract void subtract(int num1, int num2);
	abstract void multiply (int num1, int num2);
	abstract void divide(int num1, int num2);
	public void print(int result, int timeTaken) {
		System.out.println("The answer to your inquiry is " + result);
		System.out.println("Response time: " + timeTaken);
	}
}
