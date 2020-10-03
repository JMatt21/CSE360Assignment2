package cse360assignment02;

public class AddingMachine {
	  private int total;
	  private String history;
	  
	  /**
	   * Constructor for our class.
	   * Initializes total to be 0 and history to be "0".
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "0";
	  }
	  /**
	   * @return total int
	   */
	  public int getTotal () {
	    return total;
	  }
	  /**
	   * Takes value and adds it to total. Append " + " + value to history.
	   * @param value int
	   */
	  public void add (int value) {
		  total += value;
		  history += " + " + value;
	  }
	  /**
	   * Takes value and subtracts it from total. Append " - " + value to history.
	   * @param value int
	   */
	  public void subtract (int value) {
		  total -= value;
		  history += " - " + value;
	  }
	  /**
	   * @return history
	   */
	  public String toString () {
	    return history;
	  }

	  /**
	   * Resets AddingMachine object to a blank slate by setting total to 0 and history to "0".
	   */
	  public void clear() {
		  total = 0;
		  history = "0";
	  }
	}