package practice;

import java.util.Scanner;

public class Demo9_switch {
	public static void main(String[] args) {
		System.out.println("Enter country code");
		Scanner s = new Scanner(System.in);
		 String c = s.nextLine();
		 c = c.toUpperCase();
		 char firstIndex = c.charAt(0);
		 
		switch (firstIndex) {
		case 'I':
					System.out.println("India");
					break;
					
		case 'J':
					System.out.println("Japan");
					break;
		case 'A':
					System.out.println("America");
					break;

		default:
					System.out.println("Invalid character");
		}
		
	}

}
