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
public class adder {
	private int firstNum;
	private int secNum;
	
	public adder() {
		super();
	}
	
	public adder(int firstNum, int secNum) {
		super();
		this.firstNum = firstNum;
		this.secNum = secNum;
	}
	
	public void setFirst(int first) {
		this.firstNum = first;
	}
	
	public void setSec(int sec) {
		this.secNum = sec;
	}
	
	public int getFirst() {
		return this.firstNum;
	}
	
	public int getSec() {
		return this.secNum;
	}
	
	public int calc() {
		int result = this.firstNum + this.secNum;
		return result;
	}
	
	@Override
	public String toString() {
		return "Your two numbers add up to: " + this.calc();
	}

}
