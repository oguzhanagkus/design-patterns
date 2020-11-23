package Exoskeleton;

import java.util.Scanner;

/**
 * This is my driver class. It is an terminal application.
 * It gets inputs from user and create an exoskeleton.
 * Finally, shows total cost and weight of the exoskeleton.
 */
public class Demo {

    /**
     * Firstly, it wants to choose a suit.
     * Then you can add weapons how many you wont.
     * @param args default arguments, but not used
     */
    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        Component mySkeleton = null;

        System.out.println("Welcome to Zırhsan A.Ş. Ordering System");
        System.out.println("---------------------------------------");
        System.out.println("Available Suits:");
        System.out.println("1 - DecSuit  500000₺   25KG");
        System.out.println("2 - OraSuit  1500000₺  30KG");
        System.out.println("3 - TorSuit  5000000₺  50KG");
        System.out.println();
        System.out.print("Please choose a suit: ");
        do {
            choose = input.nextInt();
            switch (choose) {
                case 1: mySkeleton = new DecSuit(); break;
                case 2: mySkeleton = new OraSuit(); break;
                case 3: mySkeleton = new TorSuit(); break;
                default: System.out.print("Invalid choose! Try again: ");
            }
        } while (!(choose > 0 && choose < 4));

        System.out.println("---------------------------------------");
        System.out.println("Available Weapons:");
        System.out.println("1 - FlameThrower    50000₺   2.0KG");
        System.out.println("2 - AutoRiffle      30000₺   1.5KG");
        System.out.println("3 - RocketLauncher  150000₺  7.5KG");
        System.out.println("4 - Laser           200000₺  5.5KG");
        System.out.println();
        System.out.println("Add weapons by weapon number or complete with any other.");
        System.out.println("You can add one or more weapons.");
        do {
            System.out.print("Choose: ");
            choose = input.nextInt();
            switch (choose) {
                case 1: mySkeleton = new FlameThrower(mySkeleton); break;
                case 2: mySkeleton = new AutoRifle(mySkeleton); break;
                case 3: mySkeleton = new RocketLauncher(mySkeleton); break;
                case 4: mySkeleton = new Laser(mySkeleton); break;
                default: break;
            }
        } while (choose > 0 && choose < 5);

        System.out.println("---------------------------------------");
        System.out.println("Your order is completed.");
        System.out.println("Total cost = " + mySkeleton.getCost() + "₺");
        System.out.println("Total weight = " + mySkeleton.getWeight() + "KG");
    }
}