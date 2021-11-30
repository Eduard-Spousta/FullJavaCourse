package cz._28_variableScoup;

import java.util.Random;

public class DiceRoller {
    //global
    int number;
    Random random;

    public DiceRoller(){
        //local
        int a = 5;
        random = new Random();
        roll();
    }
    public void roll(){
        number = random.nextInt(6)+1;
    }
}
