package Complete_Design_Patterns.bridge_pattern;


public interface Question {
	
	
	public void nextQuestion();
	
	public void previousQuestion();
	
	public void newQuestion(String q);
	
	public void deleteQuestion(String q);
	
	public void displayQuestion();
	
	public void displayAllQuestions();
	

}
