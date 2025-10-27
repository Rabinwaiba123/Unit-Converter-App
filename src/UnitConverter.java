import java.util.Scanner;

public class UnitConverter {
    // Method to convert kilometers to miles
    public static double kmToMiles(double kilometers){
        return kilometers * 0.621371;
    }

    // Method to convert Celsius to Fahrenheit
    public static double kgToPounds(double kilograms){
        return kilograms * 2.20462;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    // Main method to run the program
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Unit Converter!");

        // Let the user choose the conversion type
        System.out.println("Choose the conversion type:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Kilograms to Pounds");
        System.out.println("3. Celsius to Fahrenheit");
        int choice = scanner.nextInt();

        //Ask the user to input a value for conversion
        double inputValue = 0;
        double convertedValue = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter the value in kilometers:");
                inputValue = scanner.nextDouble();
                if(inputValue < 0){
                    System.out.println("Invalid input! Kilometers can't be negative!");
                }else {
                    convertedValue = kmToMiles(inputValue);
                    System.out.println(inputValue + " kilometers is equal to " + convertedValue + " miles.");
                    break;
                }
            case 2:
                System.out.print("Enter the value in kilograms:");
                inputValue = scanner.nextDouble();
                if(inputValue < 0){
                    System.out.println("Invalid input! Kilometers can't be negative!");
                }else {
                    convertedValue = kgToPounds(inputValue);
                    System.out.println(inputValue + " kilograms is equal to " + convertedValue + " Pounds.");
                    break;
                }
            case 3:
                System.out.print("Enter the value in Celsius to Fahrenheit:");
                inputValue = scanner.nextDouble();
                convertedValue = celsiusToFahrenheit(inputValue);
                System.out.println(inputValue + " Celsius is equal to "+ convertedValue + " Fahrenheit.");
                break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}