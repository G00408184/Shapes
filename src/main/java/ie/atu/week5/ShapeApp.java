package ie.atu.week5;

import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args) {
        System.out.println("please enter the Length of the rectangle");
        Scanner input = new Scanner(System.in);
        double lenght = input.nextDouble();
        System.out.println("You entered : " + lenght);

        System.out.println("please enter the Width of the rectangle");
        double width = input.nextDouble();
        System.out.println("You entered : " + width);
    }
}
