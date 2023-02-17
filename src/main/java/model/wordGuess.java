/**
 * @author Chance - cbenna
 * CIS175 - Spring 2023
 * Feb 16, 2023
 */
package model;

/**
 * @author Chance
 *
 */
public class wordGuess {
	private String guess;
	
	public wordGuess() {
		super();
	}
	
	public wordGuess(String guess) {
		super();
		this.guess = guess;
	}
	
	public void setGuess(String newGuess) {
		this.guess = newGuess;
	}
	
	public String getGuess() {
		return this.guess;
	}
	
	@Override
	public String toString() {
		return "Your guess is: " + this.guess;
	}

}
