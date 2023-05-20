package Java_OOP.VariableScope;

import java.util.Random;

public class DiceRoller {

    Random random = new Random();
    
    int number;

    DiceRoller(){
        // local
        // Random random = new Random();
        // int number = 0;
        // roll(random, number);
        roll();
    }

    // void roll(Random random, int number)
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
    
}
