package Complete_Design_Patterns.observer_pattern;

public interface Subject {

	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
