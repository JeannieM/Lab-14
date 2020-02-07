package Roshambo;
/**
 * @author JeannieMcCarthy
 *
 */
public abstract class Player {
	
	protected String name;
	
	
	public Player(String name) {
		this.name = name;
	}
	
	public abstract Roshambo generateRoshambo();

}
