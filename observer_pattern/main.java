package Complete_Design_Patterns.observer_pattern;

public class main {

	public static void main(String[] args) {
	WeatherData wd= new WeatherData();
	wd.setMeasurements(34, 10, 20);
	CurrentWeather currrent=new CurrentWeather(wd);

}

}
