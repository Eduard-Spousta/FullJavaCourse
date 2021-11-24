package cz._11_logicOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // LOGICAL OPERATORS = used to connect two or more expressions
        // && = AND - both conditions must be true
        // || = OR - either conditions must be true
        // !  = NOT - different from value (revers boolean value)

        //AND
        int temp = 25;
        if(temp>=20 && temp<=30){
            System.out.println("It is warm outside");
        }

        //OR
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit.");
        String response = scanner.next();

        if(response.equals("q")|| response.equals("Q")){
            System.out.println("You quit the game!");
        } else {
            System.out.println("Nothing happend...");
        }

        //NOT
        Scanner scan = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit.");
        String response2 = scan.next();

        if(!response2.equals("q") && !response2.equals("Q")){
            System.out.println("Nothing happend...");
        } else {
            System.out.println("You quit the game!");
        }



    }
}
