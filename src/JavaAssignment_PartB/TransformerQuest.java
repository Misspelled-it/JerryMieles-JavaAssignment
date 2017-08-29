package JavaAssignment_PartB;
import java.io.*;

public class TransformerQuest {
	public static void main(String[] args) throws IOException {
		//Optimus stars off at 0, 0.
		int x =0, y=0;
		//Prompt the user for input
		System.out.println("Enter up to 10 valid movement commands:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String cmd = reader.readLine();
		reader.close();
		//if the commands are less than 11 we can continue, otherwise print that we can't
		if(cmd.length() < 11){
			for(int i=0; i<cmd.length();i++) {
				//iterate through the commands and do the appropriate action at a recognized command
				switch(cmd.charAt(i)) {
					case 'U': y++;
						break;
					case 'R': x++;
						break;
					case 'D': y--;
						break;
					case 'L': x--;
						break;
					default:
						break;

				}
			}
			System.out.println(x + ", " + y);
		}
		else {
			System.out.println("I won't be able to make it that far");
		}
	}
}
