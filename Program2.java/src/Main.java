//Britt Bradley, Computing a Rubber Mallet's Vol, Weight, and TotalCost

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        double volume, length, width, hb_height, ch_height,
                radius, weight, CostPerPound, TotalCost;
        final double DensityRubber = 0.0341435;

        System.out.println("Computing a Rubber Mallet\n" );
        System.out.println("Please enter the dimensions");

        //Calculations for Volume and Weight
        System.out.print("Hammer Box's Length (inches): ");
        length = kb.nextDouble();

        System.out.print("Hammer Box's Width (inches): ");
        width = kb.nextDouble();

        System.out.print("Hammer Box's Height (inches): ");
        hb_height = kb.nextDouble();

        System.out.print("Cylindrical Handle's Radius (inches): ");
        radius = kb.nextDouble();

        System.out.print("Cylindrical Handle's height (inches): ");
        ch_height = kb.nextDouble();

        volume = (length * width * hb_height) + (Math.PI * Math.pow(radius,2) * ch_height);

        //Density of Rubber = lbs per cubic inch
        weight = (volume * DensityRubber);

        //Computing Cost
        System.out.print("Please enter the cost of Rubber (per pound): " );
        CostPerPound = kb.nextDouble();
        TotalCost = weight * CostPerPound;

        System.out.println("");
        System.out.println("The mallet's volume is " + volume);
        System.out.println("The mallet's weight is " + weight);
        System.out.println("The mallet's total cost is $" + TotalCost);
    }
}
