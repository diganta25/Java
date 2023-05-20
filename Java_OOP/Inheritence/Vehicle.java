package Java_OOP.Inheritence;

public class Vehicle {

    double speed;
    String type;

    void go(String type){
        this.type = type;
        System.out.println("this "+type+" is moving");
    }

    void stop(String type){
        this.type = type;
        System.out.println("this "+type+ " is stopped");
    }
    
}
