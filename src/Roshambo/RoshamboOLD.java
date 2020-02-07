package Roshambo;
import java.util.*;

public class RoshamboOLD {
	
	public static void main(String[] args) {
		
		String userName;
		String userAcquiesence;
		String userChoice;
		String compChoice;
		String goAgain = "Y";
		int compNumber;
		int userNumber;
		int i = 1;
		//Variables can be declared anywhere. For organization all at top is good, assigned later. Alternatively, declared and assigned together, which is called initialization.
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		//scanner can be built anywhere. build at the top best practice?
		Random randomGenerator = new Random();
		
		System.out.println("Salutations! Welcome to Jeannie's Roshambo. This is the chance of a lifetime. \nWould you like to play? Y/N");
		
		userAcquiesence = scan.next(); 
		//System.out.println(userAcquiesence);
		
		if (userAcquiesence.equalsIgnoreCase("Y")) {
			//for Strings you need .equal instead of == bc a String is actually an array of chars, so String is an object that hold functions
			
			System.out.println("You have made the correct choice.");
			System.out.println("What should we call you?");
			
			userName = scan.next(); 
			
			System.out.println("Great! " + userName + ", we're ready to play!");
			
			while (goAgain.equalsIgnoreCase("y")) {
			
			System.out.println("Choose your weapon! Please type R(Rock), P(Paper), or S(Scissors)");
			
			userChoice = scan.next();
			System.out.println(" ");
			//+ userChoice + "! Let's see what the computer will choose...");
			// I had concatenation there but in order to print the full words, Rock instead of R, I used boolean statements: 
			
			if (userChoice.equalsIgnoreCase("R")) {
				System.out.println("You chose Rock!");
				System.out.println("...");
			}
			else if (userChoice.equalsIgnoreCase("P")) {
				System.out.println("You chose Paper!");
				System.out.println("...");
			}
			else if (userChoice.equalsIgnoreCase("S")) {
				System.out.println("You chose Scissors!");
				System.out.println("...");
			}
			
				
				while (!(userChoice.equalsIgnoreCase("R")) && !(userChoice.equalsIgnoreCase("P")) && !(userChoice.equalsIgnoreCase("S")) && (i<4)) {
					System.out.print("You chose an unregulated weapon. You're disqualified this round. \nTry again! Choose R, P, or S.");
					userChoice = scan.next();
					i++;
					System.out.println(" ");
//+ userChoice + "! Let's see what the computer will choose...");
					// I had concatenation there but in order to print the full words, Rock instead of R, I used boolean statements: 
					
					if (userChoice.equalsIgnoreCase("R")) {
						System.out.println("You chose Rock!");
						System.out.println("...");
					}
					else if (userChoice.equalsIgnoreCase("P")) {
						System.out.println("You chose Paper!");
						System.out.println("...");
					}
					else if (userChoice.equalsIgnoreCase("S")) {
						System.out.println("You chose Scissors!");
						System.out.println("...");
					}
				if (i==4) {
					System.out.print("Jesus Christ, " +userName + ", I give up! If you can't play by the rules you can't play with me! :P \nGood Riddence to you, foul fiend!");
					return;
				}
			}
			switch (userChoice) {
			case "R":
				userNumber = 0;
				break;
			case "r":
				userNumber = 0;
				break;
			case "P":
				userNumber = 1;
			case "p":
				userNumber = 1;
				break;
			case "S":
				userNumber = 2;
			default:
				userNumber = 2;
			}
			//System.out.println(userNumber);
			compNumber = randomGenerator.nextInt(3); //(3) is bound to three options- not bound to integer, bound to number of choices
			//System.out.println(compNumber);
			
			switch(compNumber) {
				case 0:
					compChoice = "Rock";
					break;
				case 1:
					compChoice = "Paper";
					break;
				default:
					compChoice = "Scissors";
			}
			
			System.out.println("The computer chose " + compChoice + "!");
			System.out.println(" ");
			
			if (compNumber == userNumber) {
				System.out.println("You have tied the computer.");
			}
			else if ((compNumber == 0) && (userNumber == 1)) {
				System.out.println("Huzzah! You have beaten the computer.");
			}
			else if ((compNumber == 0) && (userNumber == 2)) {
				System.out.println("WOMP WOMP. You have lost to the computer.");
			}
			else if ((compNumber == 1) && (userNumber == 0)) {
				System.out.println("WOMP WOMP. You have lost to the computer.");
			}
			else if ((compNumber == 1) && (userNumber == 2)) {
				System.out.println("Huzzah! You have beaten the computer.");
			}
			else if ((compNumber == 2) && (userNumber == 0)) {
				System.out.println("Huzzah! You have beaten the computer.");
			}
			else if ((compNumber == 2) && (userNumber == 1)) {
				System.out.println("WOMP WOMP. You have lost to the computer.");
			}
			
			System.out.println("Want to go again? Y/N");
			
			goAgain = scan.next();
			
			}
			scan.close();
			System.out.println("Thanks for playing! Hope you had fun!");
			
		}
			
		//This is the end of the first if statement. The entire game is inside. The rest of the class did it differently
		else if (userAcquiesence.equalsIgnoreCase("N")) {
			
			System.out.println("You dare waste my time with your disinterest?! Why are you even here? Be gone, fool!");
			
		}//This is the followup else from the first if statement when asking user do you want to play?
		else {
			System.out.println("Invalid input.");
			//loop back to top? James says you can put this in a while loop, and break people out of it to create the loop, but we are going to move on for today. You would have to include an integer incremental thingy that might for instance max out number of tries
		
		
		}
	
		
		
	}
				
}		
		
