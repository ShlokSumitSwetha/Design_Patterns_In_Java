package Complete_Design_Patterns.visitor_pattern.visitor;

import Complete_Design_Patterns.visitor_pattern.employees.Manager;
import Complete_Design_Patterns.visitor_pattern.employees.Programmer;
import Complete_Design_Patterns.visitor_pattern.employees.ProjectLead;
import Complete_Design_Patterns.visitor_pattern.employees.VicePresident;

public interface Visitor {

	void visit(Programmer programmer);
	
	void visit(ProjectLead lead);
	
	void visit(Manager manager);
	
	void visit(VicePresident vp);
}
