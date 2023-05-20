package Java_OOP.ConstructorOverloading;

public class constructorOverloading {
    public static void main(String[] args) {
        
        // overloaded constructors - multiple constructors within a class with the same name,
        //                           But have different parameters
        //                           name + parameters = signature

        Pizza pizza = new Pizza("thicc crust", "tomato", "mozerella", "pepperoni");
        
        System.out.println("here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheeze);
        System.out.println(pizza.topping);
    }
}
