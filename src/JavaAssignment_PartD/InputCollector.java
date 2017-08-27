package JavaAssignment_PartD;

import java.util.*;
import java.io.*;
public class InputCollector {
	private long timeRequested;
	private int num1, num2, num3;
	public InputCollector() {
		timeRequested = Calendar.getInstance().getTimeInMillis();
	}
	public void collectInput() throws IOException {
		System.out.println("Enter the number of the desired function:\n"
				+ "1. Add\n"
				+ "2. Subtract\n"
				+ "3. Multiply\n"
				+ "4. Divide");
		Scanner input = new Scanner(System.in);
		int function = input.nextInt();
		if(function > 0 && function < 5) {
			System.out.println("Do you have a third integer?\n"
					+ "1. Yes\n"
					+ "2. No");
			int varOption = input.nextInt();
			if (varOption == 2) {
				System.out.println("Please enter the two integers:");
				this.num1 = input.nextInt();
				this.num2 = input.nextInt();
			}
			else if (varOption == 1) {
				System.out.println("Please enter the three integers:");
				this.num1 = input.nextInt();
				this.num2 = input.nextInt();
				this.num3 = input.nextInt();
			}
			File log = new File("Mathematician's Log Book");
			FileWriter outputStream = new FileWriter(log, true);
			try {
				switch (function) {
					case 1:
						if(varOption == 2) {
							Adder add = new Adder(num1, num2);
							add.add(num1, num2);
						}
						else if(varOption == 1) {
							Adder add = new Adder(num1, num2, num3);
							add.add(num1, num2, num3);
						}
						outputStream.write(Calendar.getInstance().getTime().toString());
						break;
					case 2:
						if(varOption == 2) {
							Subtractor sub = new Subtractor(num1, num2);
							sub.subtract(num1, num2);
						}
						else if(varOption == 1) {
							Subtractor sub = new Subtractor(num1, num2, num3);
							sub.subtract(num1, num2, num3);
						}
						outputStream.write(Calendar.getInstance().getTime().toString());
						break;
					case 3:
						if(varOption == 2) {
							Multiplier mul = new Multiplier(num1, num2);
							mul.multiply(num1, num2);
						}
						else if(varOption == 1) {
							Multiplier mul = new Multiplier(num1, num2, num3);
							mul.multiply(num1, num2, num3);
						}
						outputStream.write(Calendar.getInstance().getTime().toString());
						break;
					case 4:
						if(varOption == 2) {
							Divider div = new Divider(num1, num2);
							div.divide(num1, num2);
						}
						else if(varOption == 1) {
							Divider div = new Divider(num1, num2, num3);
							div.divide(num1, num2, num3);
						}
						outputStream.write(Calendar.getInstance().getTime().toString());
						break;
					default:
						break;
				}
			} catch(IOException e) {
				e.printStackTrace();
			} finally{
				outputStream.close();
			}
			input.close();
			System.gc();
		}
	}

}
