package Complete_Design_Patterns.visitor_pattern.employees;

import Complete_Design_Patterns.visitor_pattern.employees.Employee;

import java.util.Collection;
import java.util.Collections;

public abstract class AbstractEmployee implements Employee {
	
	private String name;
	
	public AbstractEmployee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}