package Complete_Design_Patterns.factory_pattern;

public class FactoryPatternMain {
public static void main(String[] args) {
	Loan loan=LoanFactory.getLoanType("Business");
	System.out.println(loan.getLoanAmount()+ " "+loan.getBankName());
}
}
