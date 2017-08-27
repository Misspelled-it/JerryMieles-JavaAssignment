package JavaAssignment_PartC;

import java.util.Scanner;

public class Main_Program {
	public static void main(String[] args) throws InterruptedException {
		int start= 0, end = 0;
		System.out.println("enter range of numbers:");
		Scanner input = new Scanner (System.in);
		start = input.nextInt();
		end = input.nextInt();
		input.close();
		if(start <= end) {
			Number_Program thread1 = new Number_Program("ODD",start,end);
			thread1.start();
			Number_Program thread2 = new Number_Program("EVEN",start,end);
			thread2.start();
			thread1.join();
			thread2.join();
			thread1.display();
			thread2.display();
		}
		else {
			System.out.println("End must be greater than Start");
		}
	}
}
