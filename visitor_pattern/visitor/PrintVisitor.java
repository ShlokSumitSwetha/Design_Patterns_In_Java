package Complete_Design_Patterns.visitor_pattern.visitor;
import Complete_Design_Patterns.visitor_pattern.employees.*;


public class PrintVisitor implements Visitor {
	public PrintVisitor() {}
	
	@Override
	public void visit(Programmer programmer) {
		String msg = programmer.getName() +" is a " + programmer.getSkill()+" programmer.";
		System.out.println(msg);
	}

	@Override
	public void visit(ProjectLead lead) {
		String msg  = lead.getName()+" is a Project Lead.";
		System.out.println(msg);
	}

	@Override
	public void visit(Manager manager) {
		String msg = manager.getName()+" is a Manager with.";
	}

	@Override
	public void visit(VicePresident vp) {
		String msg = vp.getName()+" is a Vice President.";
		System.out.println(msg);
	}
}
