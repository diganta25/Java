package Generics;

public class MyGenericClass <Thing extends Number, Thing2 extends Number> {
    
    Thing x;
    Thing2 y;

    MyGenericClass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    // public Thing getValue(){
    //     return x;
    // }
    public Thing2 getValue(){
        return y;
        
    }
}
