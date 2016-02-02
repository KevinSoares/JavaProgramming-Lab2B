/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2b;

/**
 *
 * @author kevso
 */
public class Degrees {
    
    public double getCelsius(double f)
    {
        double convertToCelsius = (f - 32) * 0.5556;
        
        return convertToCelsius;
    }
    
    public double getFahrenheit(double c)
    {
        double convertToFahrenheit = c * 1.8 + 32;
        
        return convertToFahrenheit;
    }
    
    public void displayTable()
    {
    }
}
