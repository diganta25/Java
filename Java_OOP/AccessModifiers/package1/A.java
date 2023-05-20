package Java_OOP.AccessModifiers.package1;
import Java_OOP.AccessModifiers.package2.*;

public class A {
    protected String protectedMessage = "This is protected";
    public static void main(String[] args) {

        // C c = new C();
        // System.out.println(c.defaultMessage);    //only accessable within same package
        // System.out.println(c.publicMessage);
        
        B b = new B();
        // System.out.println(b.privateMessage);    // not visible
        
        
    }
    
}
