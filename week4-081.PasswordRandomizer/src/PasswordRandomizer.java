import java.util.Random;

public class PasswordRandomizer {
    private Random rand = new Random();
    private int length;
    
    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int counter = 0;
        String returnString = "";
        while (counter < length) {
            returnString += "abcdefghijklmnopqrstuvwxyz".charAt(rand.nextInt(26));
            counter++;
        }
        return returnString;
    }
}
