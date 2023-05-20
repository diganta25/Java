package Java_OOP.Interface;

public class Fish implements Prey,Predetor {

    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("This fish is fleeing from larger fish");
    }
    
}
