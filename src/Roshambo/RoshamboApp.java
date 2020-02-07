package Roshambo;

/**
 * @author JeannieMcCarthy
 *
 */
import java.util.*;

public class RoshamboApp {

	public static void main(String[] args) {
		int userChoice;
		int userWins = 0;
		int avaWins = 0;
		int rockStarWins = 0;
		String userWeapon;
		String avaWeapon;
		boolean goAgain;
		Scanner scnr = new Scanner(System.in);
		Player ava = new Ava("Ava");
		Player rockStar = new RockStar("Rocky The RockStar");
		
		System.out.println("Salutations! Welcome to Jeannie's Roshambo. This is the chance of a lifetime.");

		System.out.println("What should we call you?");
		//I got sick of typing my name every time:
		//Player userPlayer = new User(scnr.nextLine());
		Player userPlayer = new User("Bean");
		
		do {
		System.out.println("Great! " + userPlayer.name + ", here are the available players:");

		System.out.println(" -------------------------");;
		System.out.printf("| %-2s| %-20s|\n", "#", " ** Player ** ");
		System.out.println("|---|---------------------|");
		System.out.printf("| %-2d| %-20s|\n", 1, ava.name);
		System.out.println("|- -| - - - - - - - - - - |");
		System.out.printf("| %-2d| %-20s|\n", 2, rockStar.name);
		System.out.println(" -------------------------\n");

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
				userWins++;
			} else if ((userWeapon.equals("Rock")) && (avaWeapon.equals("Paper"))) {
				System.out.println("WOMP WOMP. You have lost to " + ava.name);
				avaWins++;
			} else if ((userWeapon.equals("Paper")) && (avaWeapon.equals("Scissors"))) {
				System.out.println("WOMP WOMP. You have lost to " + ava.name);
				avaWins++;
			} else if ((userWeapon.equals("Paper")) && (avaWeapon.equals("Rock"))) {
				System.out.println("Huzzah! You have beaten " + ava.name);
				userWins++;
			} else if ((userWeapon.equals("Scissors")) && (avaWeapon.equals("Paper"))) {
				System.out.println("Huzzah! You have beaten " + ava.name);
				userWins++;
			} else if ((userWeapon.equals("Scissors")) && (avaWeapon.equals("Rock"))) {
				System.out.println("WOMP WOMP. You have lost to " + ava.name);
				avaWins++;
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
				userWins++;
			}
			if (userWeapon.equals("Scissors")) {
				System.out.println("You have lost to " + rockStar.name + ".");
				rockStarWins++;
			}

		}
		// Scoreboard 
		System.out.println(" -------------------------");
		System.out.printf("|%-20s|\n", " ****** ScoreBoard ***** ");
		System.out.println("|-------------------------|");
		System.out.printf("|%-20s | %-2d|\n", ava.name, avaWins );
		System.out.println("|- - - - - - - - - - -|- -|");
		System.out.printf("|%-20s | %-2d|\n", rockStar.name, rockStarWins );
		System.out.println("|- - - - - - - - - - -|- -|");
		System.out.printf("|%-20s | %-2d|\n", userPlayer.name, userWins );
		System.out.println(" -------------------------");
		
		System.out.println("\nWould you like to play again?");
		goAgain = Validator.goAgain(scnr);
		}while(goAgain);
	}
}
