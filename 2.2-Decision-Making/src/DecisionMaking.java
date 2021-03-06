import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Hello user! What is your name? ");
		String name = scnr.next();
		System.out.print("Hi " + name + "! How old are you? ");
		int age = scnr.nextInt();
		int num = -1;
		boolean repeat = true;
		
		while (repeat) {
			
			System.out.print("Please enter an integer between 1 and 100. ");
			if (scnr.hasNextInt()) {
				num = scnr.nextInt();
				
				if (num < 1) {
					System.out.println(name + ", that number is too small.");
				} else if (num > 100) {
					System.out.println("That number is too big, " + name + ".");
				}
				
				if (1 <= num && num <= 100) {
					if (num % 2 == 0) {
						if (num < 25) {
							System.out.println(name + ", your number is even and less than 25.");
						} else if (num < 61) {
							System.out.println(name + ", your number is even.");
						} else {
							System.out.println(name + ", your number and its parity are: " + num + " and even.");
						}
					} else {
						if (num < 60) {
							System.out.println(name + ", your number and its parity are: " + num + " and odd.");
						} else {
							System.out.println(name + ", the number you chose is " + num + ", and it's odd and over 60.");
						}
					}
					
					int difference = num - age;
					String message =
							num <= age 
							? "Being " + num + " was pretty fun, wasn't it?" 
							: "You'll be " + num + " in " + difference + " years. I hope you make it!"; 
					System.out.println();
					System.out.println(message);
					
					System.out.println();
					System.out.print("Would you like to go again? y/n ");
					String repeatChoice = scnr.next();
					if (!repeatChoice.equals("y") && !repeatChoice.equals("Y")) {
						repeat = false;
					}
				}
				
				
			} else {
				System.out.println("Invalid input. Try again!");
				scnr.next();
			}
		}
		System.out.println("Thanks for playing, " + name + "! Live long and prosper.");
	}
}
