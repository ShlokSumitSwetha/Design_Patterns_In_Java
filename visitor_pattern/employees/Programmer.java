package Complete_Design_Patterns.visitor_pattern.employees;
import Complete_Design_Patterns.visitor_pattern.visitor.Visitor;

public class Programmer extends AbstractEmployee {
	private String skill;
	
	public Programmer(String name, String skill) {
		super(name);
		this.skill = skill;
	}
	
	public String getSkill() {
		return skill;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}


	
	
}
