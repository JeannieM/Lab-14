package Roshambo;

/**
 * @author JeannieMcCarthy
 *
 */
import java.util.*;

public class RoshamboApp {

	public static void main(String[] args) {
		int userChoice;
		String userWeapon;
		String avaWeapon;
		boolean goAgain;
		Scanner scnr = new Scanner(System.in);
		Player ava = new Ava("Ava");
		Player rockStar = new RockStar("Rocky The Rockstar");

		System.out.println("Salutations! Welcome to Jeannie's Roshambo. This is the chance of a lifetime.");

		System.out.println("What should we call you?");
		Player userPlayer = new User(scnr.nextLine());
		
		do {
		System.out.println("Great! " + userPlayer.name + ", here are the available players:");

		System.out.println("________________________");
		System.out.printf("%-2s| %-20s|\n", "#", "Player");
		System.out.println("__|_____________________|");
		System.out.printf("%-2d| %-20s|\n", 1, ava.name);
		System.out.println("........................|");
		System.out.printf("%-2d| %-20s|\n", 2, rockStar.name);
		System.out.println("........................|");

		userChoice = Validator.getInt(scnr, "Who would you like to play against?", 1, 2);
		// here we go
		// User chose to play against Ava
		if (userChoice == 1) {
			System.out.println("Okay, Get Ready to Play " + ava.name);
			// generate Roshambo
			userWeapon = userPlayer.generateRoshambo().toString();
			avaWeapon = ava.generateRoshambo().toString();
			// sysout choices
			System.out.println(userPlayer.name + ": " + userWeapon);
			System.out.println(ava.name + ": " + avaWeapon);

			// display outcome
			if (userWeapon.equals(avaWeapon)) {
				System.out.println("You have tied " + ava.name + ".");
			} else if ((userWeapon.equals("Rock")) && (avaWeapon.equals("Scissors"))) {
				System.out.println("Huzzah! You have beaten " + ava.name);
			} else if ((userWeapon.equals("Rock")) && (avaWeapon.equals("Paper"))) {
				System.out.println("WOMP WOMP. You have lost to " + ava.name);
			} else if ((userWeapon.equals("Paper")) && (avaWeapon.equals("Scissors"))) {
				System.out.println("WOMP WOMP. You have lost to " + ava.name);
			} else if ((userWeapon.equals("Paper")) && (avaWeapon.equals("Rock"))) {
				System.out.println("Huzzah! You have beaten " + ava.name);
			} else if ((userWeapon.equals("Scissors")) && (avaWeapon.equals("Paper"))) {
				System.out.println("Huzzah! You have beaten " + ava.name);
			} else if ((userWeapon.equals("Scissors")) && (avaWeapon.equals("Rock"))) {
				System.out.println("WOMP WOMP. You have lost to " + ava.name);
			}
			// User chose to fight RockStar
		} else if (userChoice == 2) {
			System.out.println("Okay, Get Ready to Play " + rockStar.name);
			userWeapon = userPlayer.generateRoshambo().toString();
			System.out.println(userPlayer.name + ": " + userWeapon);
			System.out.println(rockStar.name + ": " + rockStar.generateRoshambo().toString());
			// don't need to generate roshambo into a variable because it's always Rock
			if (userWeapon.equals("Rock")) {
				System.out.println("You have tied " + rockStar.name + ".");
			} else if (userWeapon.equals("Paper")) {
				System.out.println("You have beaten " + rockStar.name + ".");
			}
			if (userWeapon.equals("Scissors")) {
				System.out.println("You have lost to " + rockStar.name + ".");
			}

		}
		System.out.println("Would you like to play again?");
		goAgain = Validator.goAgain(scnr);
		}while(goAgain);
	}
}
