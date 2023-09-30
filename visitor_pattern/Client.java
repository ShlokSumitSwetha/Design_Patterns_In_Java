package Complete_Design_Patterns.visitor_pattern;

import Complete_Design_Patterns.visitor_pattern.employees.*;
import Complete_Design_Patterns.visitor_pattern.visitor.PrintVisitor;
import Complete_Design_Patterns.visitor_pattern.visitor.Visitor;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		List<Employee> emps = buildOrganization();
		Visitor visitor = new PrintVisitor();
		visitOrgStructure(emps, visitor);
		System.out.println("***************************************");
	}

	private static List<Employee> buildOrganization() {
		
		Programmer p1 = new Programmer("Rachel","C++");
		Programmer p2 = new Programmer("Andy","Java");
		
		Programmer p3 = new Programmer("Josh","C#");
		Programmer p4 = new Programmer("Bill","C++");
		
		ProjectLead pl1 = new ProjectLead("Tina");
		ProjectLead pl2 = new ProjectLead("Joey");
		
		Manager m1 = new Manager("Chad", pl1);
		Manager m2 = new Manager("Chad II", pl2);
		
		VicePresident vp = new VicePresident("Richard");

		return List.of(p1,p2,p3,p4,pl1,pl2,m1,m2);
	}
	
	private static void visitOrgStructure(List<Employee> emp, Visitor visitor) {
		for (Employee employee: emp){
			employee.accept(visitor);
		}

	}

}
