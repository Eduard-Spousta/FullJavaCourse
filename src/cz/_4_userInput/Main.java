package cz._4_userInput;

import java.util.Scanner;

public class Main {

    // PRIVATE SCANNER
    // private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        //BASIC SCANNER
        Scanner scanner = new Scanner(System.in);

        //initializations
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        //it is necessary to clear line with scanner.nextLine(); because on next line is stored \n and it will not work
        scanner.nextLine();
        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();

        //printing out
        System.out.println("Hello "+name);
        System.out.println("Your age is "+age+" years old");
        System.out.println("Your favourite food is "+food);

    }
}
