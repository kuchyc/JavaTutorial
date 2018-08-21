import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int value = 0;

		do

		{
			System.out.println("enter a number: ");
			value = scanner.nextInt();
		}

		while (value != 5);

		System.out.println("Got : " + value);
	}

}
