package Java_OOP.VariableScope;

public class variableScope {
    public static void main(String[] args) {
        // local = declared inside a method
        // visible only to that method

        // global = declared outside a method, but within a class
        // visible to all parts of a class

        DiceRoller diceRoller = new DiceRoller();
        diceRoller.roll();
        
    }
}
