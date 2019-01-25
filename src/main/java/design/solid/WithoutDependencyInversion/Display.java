package design.solid.WithoutDependencyInversion;

public class Display {

	WeatherStation weatherStation = new WeatherStation();
	
	public String displayWeatherIcon() {
		int temperature = weatherStation.getTempeture();
		
		return (temperature > 20) ? "chaud" : "froid";
	}
	
}
