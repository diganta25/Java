package Java_OOP.MethodOverriding;

public class methodOverriding{
    // method overriding = Declaring a method in sub class,
	//					   which is already present in parent class.
	//					   done so that a child class can give its own implementation

    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();

        dog.speak();
        animal.speak();
        
    }
}
