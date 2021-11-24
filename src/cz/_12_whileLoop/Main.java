package cz._12_whileLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //while loop = executes a bock of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        //i need to put smt -> just enter -> loop continue
        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
    }
}
