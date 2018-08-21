import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		

		System.out.println("Enter a line of text here");

		String line = input.nextLine();

		System.out.println("you entered: " + line);
	}

}
