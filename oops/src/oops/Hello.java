package oops;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.println("Hello " + name);
		
		input.close();
	}
	
}