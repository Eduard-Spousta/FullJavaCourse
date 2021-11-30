package cz._26_oopObjectOrientedPrograming;

public class Main {
    public static void main(String[] args){
        //OBJECT = an instance of class that contain attributes and methods
        //example: (phone, desk, computer, coffee cup,..)

        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.name);
        System.out.println(myCar1.model);
        myCar1.drive();

        System.out.println();

        System.out.println(myCar2.name);
        System.out.println(myCar2.model);
        myCar1.drive();


    }
}
