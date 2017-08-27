package JavaAssignment_PartC;

import java.util.*;

public class Number_Program extends Thread{
	int start, end;
	String numberType;
	List<Integer> numberList;
	public Number_Program(String numberType, int start, int end){
		this.numberType = numberType;
		this.start = start;
		this.end = end;
		this.numberList = null;
	}
	public void run() {
		if(this.numberType == "EVEN") {
			this.numberList = new ArrayList<Integer>();
			for(int i = start; i<= end; i++) {
				if(i%2 == 0) {
					this.numberList.add(i);
				}
			}
		}
		else if(this.numberType == "ODD"){
			this.numberList = new ArrayList<Integer>();
			for(int i = start; i<= end; i++) {
				if(i%2 == 1 || i%2 == -1) {
					this.numberList.add(i);
				}
			}
		}
	}
	public void display() {
		System.out.println(numberType + " numbers in given range:");
		for(int i = 0; i < this.numberList.size(); i++) {
			System.out.print(this.numberList.get(i) + " ");
		}
		System.out.print("\n");
		
	}
}
