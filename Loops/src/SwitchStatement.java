import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch(text) {
		
		case "start":
		System.out.println("machine has been started");
		break;
		
		case "stop":
			System.out.println("machine has been stopped");
			break;
			
			default:
				System.out.println("Dont know that command");
		}
	}

}
