package Java_OOP.Constructor;

public class Human {
    
    String name;
    int y;
    double z;

    Human (String name,int age, double weight){
        this.name = name;
        y = age;
        z = weight;
    }
    
    void eat(){
        System.out.println(this.name +" is eating");
    }

    void drink(){
        System.out.println(this.name +" is drinking *burp*");
    }
}
