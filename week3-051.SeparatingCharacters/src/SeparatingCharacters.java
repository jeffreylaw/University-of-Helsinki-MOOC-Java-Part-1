
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String input = reader.nextLine();
        int counter = 0;
        while (counter < input.length()) {
            System.out.println((counter+1) + ". character: " + input.charAt(counter));
            counter++;
        }
            
    }   
}
