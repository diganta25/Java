package Java_OOP.Encapsulation;

public class encapsulation {
    public static void main(String[] args) {
        
        // Encapsulation - attributes of a class will be hidden or private,
        //                 can be accessed only through methods (getters and setters)
        //                 You should make attributes private if you dont have a reson to make them public or protected

        Car car = new Car("Dodge", "Challenger", 2021);

        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        
        
        
    }
    
}
