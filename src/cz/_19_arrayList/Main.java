package cz._19_arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // ArrayList = 	a resizable array.
        //				Elements can be added and removed after compilation phase
        //				store reference data types

        ArrayList<String> food = new ArrayList<String>();
        //add sth to array list
        food.add("pizza");
        food.add("hamburger");
        food.add("hodDog");

        //replace
        food.set(0, "sushi");
        //remove
        food.remove(1);
        //clear
        food.clear();

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

    }
}
