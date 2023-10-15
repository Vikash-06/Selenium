package oopConceptPartTwo;

public class HDFCBank implements USBank, BrazilBank {
	//A child class can have a multiple parent interface.
	//if a class implements an parent interface then it will need to call all the methods of a parent interface.

	// overriden methods (HDFC: USBank)
	@Override
	public void credit() {
		System.out.println("HDFC Credit");
	}

	@Override
	public void debit() {
		System.out.println("HDFC Debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("HDFC transferMoney");
	}
	

	// HDFC own seprates method.
	public void Educationloan() {
		System.out.println("HDFC Educationloan");
	}

	public void PersonalLoan() {
		System.out.println("HDFC Personalloan");
	}
	

	//overriden methods (BrazilBank: HDFCBank)
	@Override
	public void FD() {
		System.out.println("HDFC FD");
	}

	@Override
	public void Vechileloan() {
		System.out.println("HDFC VechileLoan");
	}

}
