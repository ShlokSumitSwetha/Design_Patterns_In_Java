package Complete_Design_Patterns.factory_pattern;

public class EducationLoan implements Loan{

	@Override
	public int getLoanAmount() {
		return 10000;
	}

	@Override
	public String getBankName() {
		return "ICICI";
	}

}
