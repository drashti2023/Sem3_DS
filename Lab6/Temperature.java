import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        convertCelsiusToFahrenheit(celsius);
        convertFahrenheitToCelsius(fahrenheit);
        
        sc.close();
    }

    public static void convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }

    public static void convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}