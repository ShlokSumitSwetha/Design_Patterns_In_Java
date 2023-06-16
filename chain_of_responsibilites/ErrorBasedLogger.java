package Complete_Design_Patterns.chain_of_responsibilites;


public class ErrorBasedLogger extends Logger {
	public ErrorBasedLogger(int levels) {
		this.levels=levels;
	}
	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("ERROR LOGGER INFO: "+msg);
	}
}
