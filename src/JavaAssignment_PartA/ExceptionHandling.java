package JavaAssignment_PartA;

import java.util.*;

public class ExceptionHandling {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		//Prompt the user for an array size
		System.out.println("Enter the number of elements in the array:");
		Scanner scanner = new Scanner(System.in);
		try {
			int size = scanner.nextInt();
			//if the size is less than 1 then prompt for a valid size
			if(size <1) {
				boolean validSize = false;
				while(!validSize) {
					System.out.println("Number of elements must be greater than 0, reenter:");
					size = scanner.nextInt();
					if(size>0) {
						validSize = true;
					}
				}
			}
			//receive integers from the user
			int[] array = new int[size];
			System.out.println("Enter the elements in the array:");
			for(int i = 0; i<size; i++) {
				array[i] = scanner.nextInt();
			}
			//prompt for the index to output
			System.out.println("Enter the index of the array element you want to access:");
			int index = scanner.nextInt();
			System.out.println("The array element at index " + index
					+ " = " +array[index] +
					"\nThe array element successfully accessed");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("IndexOutOfRangeException");
		} finally {
			scanner.close();
		}
	}
}
