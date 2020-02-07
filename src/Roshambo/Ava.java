package Roshambo;

import java.util.Random;

/**
 * @author JeannieMcCarthy
 *
 */
public class Ava extends Player {

	public Ava(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		
		Random randomGenerator = new Random();
		int avaRandom = randomGenerator.nextInt(3);
		switch(avaRandom) {
			case 0:
				return Roshambo.ROCK;
			case 1:
				return Roshambo.PAPER;
			default:
				return Roshambo.SCISSORS;
		}
	}

}
