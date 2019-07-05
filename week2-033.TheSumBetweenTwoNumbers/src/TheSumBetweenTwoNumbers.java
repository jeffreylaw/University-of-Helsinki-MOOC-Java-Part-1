
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int lowerNum = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int higherNum = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while (lowerNum <= higherNum) {
            sum += lowerNum;
            lowerNum++;
        }
        
        System.out.println("The sum " + sum);
    }
}
