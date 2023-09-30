package Complete_Design_Patterns.visitor_pattern.employees;
import Complete_Design_Patterns.visitor_pattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VicePresident extends AbstractEmployee {


	public VicePresident(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
