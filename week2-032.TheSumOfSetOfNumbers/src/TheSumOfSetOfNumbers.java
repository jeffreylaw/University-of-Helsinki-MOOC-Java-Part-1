
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int input = Integer.parseInt(reader.nextLine());
        int num = 1;
        int sum = 0;
        while (num <= input) {
            sum += num;
            num++;
        }
        System.out.println("Sum is " + sum);
    }
}
