package oopConceptPartTwo;

public interface USBank {
	
	//In "Interface" We only defined method prototype but inside the method we do not define the logic.
	//we do not create an object of interface.
	//In Interface methods we define all are abstract type in nature.
	//In interface Variables we defined are static in nautre by default and cannot be change means final/constant in nature
	//method prototype we define in interface should be non static.
	//No main method in interface.
	
	int minBalance = 200;

	public void credit();

	public void debit();

	public void transferMoney();

}
