package Java_OOP.Constructor;

public class constructor {
    public static void main(String[] args) {

        // constructor - special method that is called when an object is instantiated (created)

        Human human1 = new Human("Stro", 21, 70);
        Human human2 = new Human("Anfi",16,50);

        human1.eat();
        human2.drink();;
        
    }
    
}
