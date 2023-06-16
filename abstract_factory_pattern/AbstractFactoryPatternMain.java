package Complete_Design_Patterns.abstract_factory_pattern;

public class AbstractFactoryPatternMain {
public static void main(String[] args) {
	IciciLoan iciciLoan=LoanFactory.createLoanFactory("ICICI","homeloan");
	iciciLoan.processLoan();
 }
}
