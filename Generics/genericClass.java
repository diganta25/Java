package Generics;

import java.util.HashMap;

public class genericClass {
    public static void main(String[] args) {

        // bounded types - you can create the objects of a generic class to have data
        //                 of specific derived types e.g.Number
        
        // MyIntegerClass myInt = new MyIntegerClass(1);
        // MyDoubleClass myDouble = new MyDoubleClass(3.14);
        // MyCharacterClass myChar = new MyCharacterClass('@');
        // MyStringClass myString = new MyStringClass("Hello");

        MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,7);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 1.01);

        // MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '$');
        // MyGenericClass<String ,Character> myString = new MyGenericClass<>("Hello", '!');
        
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        // System.out.println(myChar.getValue());
        // System.out.println(myString.getValue());

        HashMap<Integer, String> user = new HashMap<>();
    }
}
