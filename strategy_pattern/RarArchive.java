package Complete_Design_Patterns.strategy_pattern;

public class RarArchive implements  StrategyArchive{

	@Override
	public void archiveFile() {
		System.out.println("rar archiving ...");
	}

}
