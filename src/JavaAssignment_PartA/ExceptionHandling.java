package JavaAssignment_PartA;

import java.util.*;

public class ExceptionHandling {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		System.out.println("Enter the number of elements in the array:");
		Scanner scanner = new Scanner(System.in);
		try {
			int size = scanner.nextInt();
			if(size <0) {
				boolean validSize = false;
				while(!validSize) {
					System.out.println("Number of elements must be greater than 0, reenter:");
					size = scanner.nextInt();
					if(size>0) {
						validSize = true;
					}
				}
			}
			int[] array = new int[size];
			System.out.println("Enter the elements in the array:");
			for(int i = 0; i<size; i++) {
				array[i] = scanner.nextInt();
			}
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
