package cz._7_math;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double x = 5.69;
        double y = -10.1;

        //MATH OPERATION
        double max = Math.max(x,y);
        double min = Math.min(x,y);
        //System.out.println(Math.min(x,y));
        double abs = Math.abs(y);
        double sqrt = Math.sqrt(x);
        double round = Math.round(y);
        double ceil = Math.ceil(x);
        double floor = Math.floor(x);

        System.out.println(max);
        System.out.println(min);
        System.out.println(abs);
        System.out.println(sqrt);
        System.out.println(round);
        System.out.println(ceil);
        System.out.println(floor);


        //TRIANGLE
        //finding hypotenuse (=prepona)
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a: ");
        a = scanner.nextDouble();
        System.out.println("enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse is: "+c);
        scanner.close();

    }
}
