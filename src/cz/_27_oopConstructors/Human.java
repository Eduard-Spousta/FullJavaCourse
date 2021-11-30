package cz._27_oopConstructors;

public class Human {
    String name;
    int age;
    double weight;

    public Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat(){
        System.out.println(this.name + " is eating");
    }
    public void drink(){
        System.out.println(this.name + " is drinking");
    }
}
