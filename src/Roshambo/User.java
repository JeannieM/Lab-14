package Roshambo;

/**
 * 
 */
import java.util.*;

public class User extends Player {

	public User(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		Scanner scnr = new Scanner(System.in);

		String userWeapon;
		userWeapon = Validator.getStringMatchingRegexCustomMessage(scnr, "Choose your weapon! Please type R(Rock), P(Paper), or S(Scissors)", "[RrPpSs]", "You chose an unregulated weapon. You're disqualified this round. \nTry again! Choose R, P, or S.").toUpperCase();
		
		switch (userWeapon) {
			case "R":
				return Roshambo.ROCK;
			case "P":
				return Roshambo.PAPER;
			default:
				return Roshambo.SCISSORS;
		}
	}
}
