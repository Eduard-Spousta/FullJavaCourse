package cz._8_randomNumbers;

import java.util.Random;

public class Main {
    //private random
    //private static Random random = new Random();
    public static void main(String[] args){
        Random random = new Random();

        //ROLL A DICE -> 1 - 6
        //random starts at 0 so +1
        int x = random.nextInt();
        System.out.println(x);
        //double betwwen 0-1
        double y = random.nextDouble();
        System.out.println(y);
        //bol - true/false
        boolean b = random.nextBoolean();
        System.out.println(b);
    }
}
