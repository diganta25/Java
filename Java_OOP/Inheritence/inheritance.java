package Java_OOP.Inheritence;

public class inheritance {
    public static void main(String[] args) {
        // inheritance = the process where one class acquires,
		//				 the attributes and methods of another.

        Car car = new Car();

        car.go("car");

        Bicycle bike = new Bicycle();

        bike.stop("bike");

        System.out.println(car.doors);
        System.out.println(bike.pedals);
        
        
    }
    
}
