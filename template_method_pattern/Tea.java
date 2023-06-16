package Complete_Design_Patterns.template_method_pattern;

public class Tea extends CaffineBevertage{

	@Override
	void brew() {
		System.out.println("dip tea bag");
		
	}

	@Override
	void addCondiments() {
		System.out.println("add lemon");
	}

}
