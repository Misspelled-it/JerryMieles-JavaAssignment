package JavaAssignment_PartB;
import java.io.*;

public class TransformerQuest {
	public static void main(String[] args) throws IOException {
		int x =0, y=0;
		System.out.println("Enter up to 10 valid movement commands:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String cmd = reader.readLine();
		if(cmd.length() < 11){
			for(int i=0; i<cmd.length();i++) {
				if(cmd.charAt(i) == 'U') {
					y++;
				}
				else if(cmd.charAt(i) == 'R') {
					x++;
				}
				else if(cmd.charAt(i) == 'D') {
					y--;
				}
				else if(cmd.charAt(i) == 'L') {
					x--;
				}
			}
			System.out.println(x + ", " + y);
		}
		else {
			System.out.println("I won't be able to make it that far");
		}
	}
}
