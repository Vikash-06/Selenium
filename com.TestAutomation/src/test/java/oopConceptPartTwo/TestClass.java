package oopConceptPartTwo;

public class TestClass {

	public static void main(String[] args) {
		
		System.out.println(USBank.minBalance);
		

		HDFCBank obj = new HDFCBank();
		//compile time polymorphism
		obj.credit();
		obj.debit();
		obj.transferMoney();
		obj.Educationloan();
		obj.PersonalLoan();
		obj.FD();
		obj.Vechileloan();
		
		
		//run time polymorphism
		//when child class object referred by parent interface reference variable.
		
		USBank us = new HDFCBank();
		//only overriden methods will be called.
		us.debit();
		us.credit();
		us.transferMoney();
		
		BrazilBank bb = new HDFCBank();
		bb.FD();
		bb.Vechileloan();
		
		
		

	}

}
