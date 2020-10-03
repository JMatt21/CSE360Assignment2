package cse360assignment02;
import cse360assignment02.AddingMachine;
public class Tester {

	public static void main(String[] args) {
		
		AddingMachine myAddingMachine = new AddingMachine();
		System.out.println(myAddingMachine.toString());
		myAddingMachine.add(4);
		myAddingMachine.subtract(2);
		myAddingMachine.add(5);
		System.out.println(myAddingMachine.toString());
	}

}
