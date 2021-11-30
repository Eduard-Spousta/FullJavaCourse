package cz._29_overLoadedConstructors;

public class Main {
    public static void main(String[] args){
        //OVERLOADED CONSTRUCTORS = multiple constructors within a class with the same name but have different patterns
        //                          name + parameters = signature

        Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("There are the ingredients of your pizza: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzarella");
        System.out.println("There are the ingredients of your pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);

        Pizza pizza3 = new Pizza("thicc crust", "tomato");
        System.out.println("There are the ingredients of your pizza: ");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);
    }
}
