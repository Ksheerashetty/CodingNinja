import java.util.*;
class FindCharacterCase {
	public static void main(String args[]) {
     String input = s.next();
        char ch = input.charAt(0);
		if(ch>='A' && ch<='Z')
			System.out.print("1");
		else if(ch>='a' && ch<='z')
			System.out.print("0");
		else 
			System.out.print("-1");
	// Scanner scanner = new Scanner(System.in);  
 //        char character = scanner.next().charAt(0); another way of taking user input for characters in java
        // if (Character.isUpperCase(character)) {
        //     System.out.println(1);
        // } else if (Character.isLowerCase(character)) {
        //     System.out.println(0);
        // } else {
        //     System.out.println(-1);
        // } using built-in
	}
}
