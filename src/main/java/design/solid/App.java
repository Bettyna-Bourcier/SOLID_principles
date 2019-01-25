package design.solid;

import design.solid.WithoutDependencyInversion.Display;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Display display = new Display();
        String weatherIcon = display.displayWeatherIcon();
        
        System.out.println("Weather icon : " + weatherIcon);
    }
}
