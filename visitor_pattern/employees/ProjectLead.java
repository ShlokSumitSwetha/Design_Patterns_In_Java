package Complete_Design_Patterns.visitor_pattern.employees;
import Complete_Design_Patterns.visitor_pattern.visitor.Visitor;

public class ProjectLead extends AbstractEmployee {

	public ProjectLead(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
