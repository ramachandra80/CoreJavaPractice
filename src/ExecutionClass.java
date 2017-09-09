import basic.numbersmanipulation.RandomNumberGeneration;


public class ExecutionClass {
    public static void main(String args[]){
        RandomNumberGeneration randGen = new RandomNumberGeneration();
        
        //Generate 10 Random number from 0 to 10000
        //randGen.generateRandomNumbers();
        
        //Generate given number of Random number from given range
        randGen.generateRandomNumbers(1000, 10000, 20);
    }
}
