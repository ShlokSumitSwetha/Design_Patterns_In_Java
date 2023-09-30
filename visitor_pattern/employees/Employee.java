package Complete_Design_Patterns.visitor_pattern.employees;

import Complete_Design_Patterns.visitor_pattern.visitor.Visitor;

public interface Employee {
	
	void accept(Visitor visitor);
}
