package basic.numbersmanipulation;

import java.util.Random;

public class RandomNumberGeneration {
    
     //Generate 10 Random number from 0 to 10000
    public void generateRandomNumbers(){
        Random random = new Random();        
        for(int i=0;i<10;i++){
            System.out.println(random.nextInt(10000));
        }
    }
    
    //Generate given number of Random number from given range
    public void generateRandomNumbers(int a, int b, int numberOfRandom){
        int random = 0;
        for(int i=0;i<numberOfRandom;i++){
            random = a+(int)((b-a)*Math.random());
            System.out.println(random);
        }
    }
}
