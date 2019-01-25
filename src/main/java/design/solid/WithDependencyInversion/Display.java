package design.solid.WithDependencyInversion;

public class Display {
	
	WeatherStation weatherStation;
	
	public Display(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}
		
	public String displayWeatherIcon() {
		int temperature = this.weatherStation.getTempeture();
		
		return (temperature > 20) ? "chaud" : "froid";
	}
}
