package cz._27_oopConstructors;

public class Main {
    public static void main(String[] args){
        //CONSTRUCTOR = special method that s called when an object is instantiated (created)
        Human human1 = new Human("Rick",65,70);
        Human human2 = new Human("Morty", 16, 50);
        System.out.println(human1.name);
        System.out.println(human2.age);

        human1.eat();
        human2.drink();
    }
}
