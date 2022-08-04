package _08_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * CHECK ^^^^
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */

public class CaliforniaWeather implements ActionListener{
    
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton one = new JButton();
	JButton two = new JButton();
	JButton tree = new JButton();
	
	
    void start() {
 
    	frame.add(panel);
    	panel.add(one);
    	panel.add(two);
    	panel.add(tree);
    	
    	one.setText("Search City");
    	two.setText("Search Weather Condition");
    	tree.setText("Search Temp");
    	
    	one.addActionListener(this);
    	two.addActionListener(this);
    	tree.addActionListener(this);
    	
    	frame.pack();
    	frame.setVisible(true);
    	
    	
      
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == one) {
			HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
	        WeatherData datum = null;
	        
	        String name = JOptionPane.showInputDialog("Enter a city in california");
	        
	        for(String n : weatherData.keySet()){
	            if (n.equalsIgnoreCase(name)) {
	          	  name = Utilities.capitalizeWords( name );
	          	  datum = weatherData.get(name);
	            }
	        }  
	        
	        // All city keys have the first letter capitalized of each word
	        String cityName = Utilities.capitalizeWords( "National City" );
	        
	        
	        if( datum == null ) {
	            System.out.println("Unable to find weather data for: " + name);
	        } else {
	            System.out.println(name + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
	        }
	        
		}
		
		if (e.getSource() == two) {
			HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
	       String datum = "";
			
			String weather = JOptionPane.showInputDialog("Enter Weather Condition");
			
		
			
	        for(Entry<String, WeatherData> w : weatherData.entrySet()){
	        	if (w.getValue().weatherSummary.toLowerCase().contains(weather.toLowerCase())) {
	          	  weather = Utilities.capitalizeWords( weather );
	          	  datum = datum + w.getKey() + ", " ;
	            }
	        }
	        
	        if( datum == "" ) {
	            System.out.println("Unable to find cities with " + weather + " weather");
	        } else {
	            System.out.println(datum);
	        }
			
		}
		
		if (e.getSource() == tree) {
			HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
	        WeatherData datum = null;
	        
	        String minErature = JOptionPane.showInputDialog("Enter minimum temperature");
	        String maxErature = JOptionPane.showInputDialog("Enter maximum temperature");
	       
	        double minTemp = Double.parseDouble(minErature);
	        double maxTemp = Double.parseDouble(maxErature);
	        
	        ArrayList<Integer> cityTemps = new ArrayList<Integer>();
	        
	        
	        
	        
	        
	        
	        
	        
	        for(String city : weatherData.keySet()){
	        	datum = weatherData.get(city);
	        	
	            if (minTemp < datum.temperatureF && datum.temperatureF < maxTemp) {
	          	  
	          	  
	            }
	        }  
	        
	        // All city keys have the first letter capitalized of each word
	        String cityName = Utilities.capitalizeWords( "National City" );
	        
	        
	        if( datum == null ) {
	            System.out.println("Unable to find weather data for: " + minTemp + " to " + maxTemp);
	        } else {
	            System.out.println(datum + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
	        }
		}
		
	}
}
