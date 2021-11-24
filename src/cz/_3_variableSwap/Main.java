package cz._3_variableSwap;

public class Main {
    public static void main(String[] args){

        //SWAPPING VARIABLES WITH HELP OF THIRD VARIABLE
        String x = "Watter";
        String y = "juice";

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);


        //SWAPPING WITHOUT THIRD VARIABLE
        int a = 29;
        int b = 17;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
