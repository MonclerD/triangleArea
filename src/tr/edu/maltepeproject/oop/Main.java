package tr.edu.maltepeproject.oop;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	double a, b, c;

    Scanner user_input = new Scanner(System.in);

        System.out.print(" first side length: ");
        a = user_input.nextDouble();

        System.out.print(" second side length: ");
        b = user_input.nextDouble();

        System.out.print(" third side length: ");
        c = user_input.nextDouble();

        //Üçgenin çevresi = 2u
        //u = (a+b+c)/2
        //Alan * Alan = u * (u-a) * (u-b) * (u-c)

        double u = (a + b + c) / 2;

        double triangelAreaSqrt = u * (u-a) * (u-b) * (u-c);
        double triangelArea = Math.sqrt(triangelAreaSqrt);
        System.out.println(" Area of the triangle: " + triangelArea);

    }
}
