package ie.atu.week5;

import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args) {
        //Created first instance of rectangle
        System.out.println("please enter the Length of the rectangle");
        Scanner input = new Scanner(System.in);
        double lenght = input.nextDouble();
        Rectangle shapeRect = new Rectangle();
        shapeRect.setLenght(lenght);
        System.out.println("You entered : " + shapeRect.getLenght());


        System.out.println("please enter the Width of the rectangle");
        double width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.println("You entered : " + shapeRect.getWidth());

        //Created second instance of rectangle
        Rectangle shapeRect2 = new Rectangle();
        System.out.println("please enter the second Length of the rectangle");
        double lenght2 = input.nextDouble();
        shapeRect2.setLenght(lenght2);
        System.out.println("You entered : " + shapeRect2.getLenght());

        System.out.println("please enter the Width of the rectangle");
        double width2 = input.nextDouble();
        shapeRect2.setWidth(width2);
        System.out.println("You entered : " + shapeRect2.getWidth());
    }
}
