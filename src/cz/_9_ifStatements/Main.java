package cz._9_ifStatements;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age>=75){
            System.out.println("OK boomer...");
        }else if(age>=18){
            System.out.println("You are an adult! :)");
        }else if(age>=13){
            System.out.println("You are a teenager! :P");
        }else{
            System.out.println("Hey kido!");
        }
    }
}
