public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592; // Conversion factor
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462; // Conversion factor
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541; // Conversion factor
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172; // Conversion factor
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Test the conversion methods
        double fahrenheit = 98.6;
        double celsius = 37.0;
        double pounds = 150.0;
        double kilograms = 68.0;
        double gallons = 5.0;
        double liters = 20.0;

        System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheit, convertFahrenheitToCelsius(fahrenheit));
        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, convertCelsiusToFahrenheit(celsius));
        System.out.printf("%.2f pounds is %.2f kilograms%n", pounds, convertPoundsToKilograms(pounds));
        System.out.printf("%.2f kilograms is %.2f pounds%n", kilograms, convertKilogramsToPounds(kilograms));
        System.out.printf("%.2f gallons is %.2f liters%n", gallons, convertGallonsToLiters(gallons));
        System.out.printf("%.2f liters is %.2f gallons%n", liters, convertLitersToGallons(liters));
    }
}
