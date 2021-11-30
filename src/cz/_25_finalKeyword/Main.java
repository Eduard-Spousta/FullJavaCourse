package cz._25_finalKeyword;

public class Main {
    public static void main(String[] args){
        //final can not be changed or updated in progran

        double piAAA = 3.14159;
        piAAA = 4;
        System.out.println(piAAA);
        //it was updated

        //if final do it UPPER-CASE
        final double PI =  3.14159;
        //PI = 4; ==> can not be updated
        System.out.println(PI);
    }
}
