package design.solid;

import org.mockito.Mock;

import design.solid.WithDependencyInversion.WeatherStation;
import design.solid.WithoutDependencyInversion.Display;
import junit.framework.TestCase;

import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testWithoutDependencyInversion()
    {
        Display display = new Display();
        
        String iconWeather = display.displayWeatherIcon();
        
     // Impossible to test the cold case because we can not control the weather station behavior
     // We could control the behavior by injecting WeatherStation in the constructor (SOLID => principle of Dependency inversion)
        assertEquals("froid" ,iconWeather); 
    }
    
    public void testWithDependencyInversion()
    {
    	WeatherStation weatherStation = mock(WeatherStation.class);
    	
    	when(weatherStation.getTempeture()).thenReturn(2);
        design.solid.WithDependencyInversion.Display display = new design.solid.WithDependencyInversion.Display(weatherStation);
        
        String iconWeather = display.displayWeatherIcon();
        
        assertEquals("froid" ,iconWeather); 
    }
}
