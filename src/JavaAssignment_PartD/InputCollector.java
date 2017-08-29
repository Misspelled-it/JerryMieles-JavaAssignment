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
		//prompt the user for the function to perform 
		System.out.println("Enter the number of the desired function:\n"
				+ "1. Add\n"
				+ "2. Subtract\n"
				+ "3. Multiply\n"
				+ "4. Divide");
		Scanner input = new Scanner(System.in);
		//take input for the function
		int function = input.nextInt();
		if(function > 0 && function < 5) {
			//prompt for the third integer if it exists
			System.out.println("Do you have a third integer?\n"
					+ "1. Yes\n"
					+ "2. No");
			//receive third input option
			int varOption = input.nextInt();
			if (varOption == 2) {
				//take input for 2 operands
				System.out.println("Please enter the two integers:");
				this.num1 = input.nextInt();
				this.num2 = input.nextInt();
			}
			else if (varOption == 1) {
				//take input for 3 operands
				System.out.println("Please enter the three integers:");
				this.num1 = input.nextInt();
				this.num2 = input.nextInt();
				this.num3 = input.nextInt();
			}
			//close the scanner before we do the function
			input.close();
			//open the log using the append option, we append after the method finishes
			File log = new File("Mathematician's Log Book");
			FileWriter outputStream = new FileWriter(log, true);
			try {
				switch (function) {
					//adder with both options
					case 1:
						if(varOption == 2) {
							Adder add = new Adder(num1, num2, timeRequested);
							add.add(num1, num2);
						}
						else if(varOption == 1) {
							Adder add = new Adder(num1, num2, num3, timeRequested);
							add.add(num1, num2, num3);
						}
						outputStream.write(Calendar.getInstance().getTime().toString());
						break;
					//subtractor with both options
					case 2:
						if(varOption == 2) {
							Subtractor sub = new Subtractor(num1, num2, timeRequested);
							sub.subtract(num1, num2);
						}
						else if(varOption == 1) {
							Subtractor sub = new Subtractor(num1, num2, num3, timeRequested);
							sub.subtract(num1, num2, num3);
						}
						outputStream.write(Calendar.getInstance().getTime().toString());
						break;
					//multiplier with both options
					case 3:
						if(varOption == 2) {
							Multiplier mul = new Multiplier(num1, num2, timeRequested);
							mul.multiply(num1, num2);
						}
						else if(varOption == 1) {
							Multiplier mul = new Multiplier(num1, num2, num3, timeRequested);
							mul.multiply(num1, num2, num3);
						}
						outputStream.write(Calendar.getInstance().getTime().toString());
						break;
					//divider with both options
					case 4:
						if(varOption == 2) {
							Divider div = new Divider(num1, num2, timeRequested);
							div.divide(num1, num2);
						}
						else if(varOption == 1) {
							Divider div = new Divider(num1, num2, num3, timeRequested);
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
				//close the output stream after the try block
				outputStream.close();
			}
			//call the garbage collector to tidy up
			System.gc();
		}
	}

}
