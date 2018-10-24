import java.util.Scanner;

public class StringManipulator {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Please Enter Any String:    ");
	String string = scan.nextLine();
	System.out.print("First Letter:   " + string.charAt(0));
	System.out.print("\nLast Letter:   " + string.charAt(string.length()-1));
	System.out.print("\nThe Length of the String:   " + (string.length()-1));
	
	


	}

}
