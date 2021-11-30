package cz._15_array;

public class Main {
    public static void main(String[] args){
        //array = used to store multiple values in a single variable
        String[] cars = {"Tesla", "Skoda", "BMW", "Audi"};

        //CHANGING VARIABLE AT POS. 1
        cars[0] = "Mustang";
        System.out.println(cars[0]);

        String[] cars2 = new String[3];
        cars2[0] = "Ford";
        cars2[1] = "Honda";
        cars2[2] = "Kia";

        for(int i=0;i<cars2.length;i++){
            System.out.println(cars2[i]);
        }

    }
}


