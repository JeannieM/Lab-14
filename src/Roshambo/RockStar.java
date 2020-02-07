package Roshambo;
/**
 * @author JeannieMcCarthy
 *
 */
public class RockStar extends Player {


	public RockStar(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
