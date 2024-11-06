/**
 * @author Mihir Patel
 * This program will predict the future population of Earth in the next 75 years using
 * the population and growth rate given by the user.
 */

import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Welcome to the world calculator");
        System.out.print("Enter the current world population: ");

        long population = console.nextLong();
        console.nextLine();

        System.out.print(
                "Enter the current growth rate: (e.g, 1.14% would be 0.0114): ");

        double growthRate = console.nextDouble();

        System.out.println("Year  Estimated Population  Change from prior Year");

        for (int year = 1; year <= 75; year++) {

            long futurePopulation = (long) (population * Math.pow((1 + growthRate), year));

            long populationChange = futurePopulation - population;

            System.out.printf("%-5d %-21d %d \n", year, futurePopulation, populationChange);
        }

    }
}