package Complete_Design_Patterns.visitor_pattern.employees;

import Complete_Design_Patterns.visitor_pattern.employees.AbstractEmployee;
import Complete_Design_Patterns.visitor_pattern.employees.Employee;
import Complete_Design_Patterns.visitor_pattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Manager extends AbstractEmployee {


	public Manager(String name,Employee...employees) {
		super(name);
		Arrays.stream(employees);
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	
}
