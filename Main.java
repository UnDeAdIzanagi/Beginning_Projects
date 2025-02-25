//Brit Bradley, Converting Weights in Pounds to Kilograms

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char con;
        double pounds, kilograms;
        final double KiloPerPound = 0.45359237;

        System.out.println("Converting Pounds to Kilograms");

        do {

            do{
                System.out.print("Enter the weight (pounds): ");
                pounds = kb.nextDouble();

                if(pounds < 0){
                    System.out.println("Error");
                    System.out.println("Enter a positive number");
                }

            }while (pounds < 0);

            kilograms = pounds * KiloPerPound;

            System.out.println("\nPounds: " + pounds +
                    " = " + "Kilograms: " + kilograms);

            System.out.println("Converter another number? (y = yes / n = no)");
            con = kb.next().charAt(0);

        } while (con == 'y');

    }
}