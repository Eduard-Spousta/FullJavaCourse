package cz._22_methods;

public class Main {
    public static void main(String[] args){
        // method = a block of code that is executed whenever it is called upon

        hello();

        String name = "Eda";
        hello2(name);

        int age = 20;
        hello3(name, age);

        int x = 3;
        int y = 4;
        System.out.println(add(x,y));
    }

    static void hello(){
        System.out.println("Hello world!");
    }

    static void hello2(String name){
        System.out.println("Hello " + name);
    }

    static void hello3(String name, int age){
        System.out.println("Hello " + name + " " + age);
    }

    static int add(int x, int y){
        return x+y;
    }

}
