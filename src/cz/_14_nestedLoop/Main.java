package cz._14_nestedLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //nested(=vnoreny)
        //nested loop = a loop inside of a loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter a symbol: ");
        symbol = scanner.next();
        
        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int x=1; x<=columns; x++){
                System.out.print(symbol);
            }
        }
    }
}
