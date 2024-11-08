package cmpe131;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWeather Station Menu:");
            System.out.println("1. Collect Weather Data");
            System.out.println("2. Display All Collected Data");
            System.out.println("3. Analyze Data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    station.collectData();
                    break;
                case 2:
                    station.displayAllData();
                    break;
                case 3:
                    station.analyzeData();
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}