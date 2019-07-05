
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int numInput = Integer.parseInt(reader.nextLine());
        int counter = 0;
        int sum = 0;
        while (counter <= numInput) {
            sum += (int)Math.pow(2, counter);
            counter++;
        }
        System.out.println("The result is " + sum);
    }
}
