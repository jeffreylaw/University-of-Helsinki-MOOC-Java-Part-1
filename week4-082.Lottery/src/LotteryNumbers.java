import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random rand;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.rand = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int counter = 0;
        while (counter < 7) {
            int randNum = rand.nextInt(39) + 1;
            while (containsNumber(randNum)) {
                randNum = rand.nextInt(39) + 1;
            }
            this.numbers.add(randNum);
            counter++;
        }
        // Write the number drawing here using the method containsNumber()
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
