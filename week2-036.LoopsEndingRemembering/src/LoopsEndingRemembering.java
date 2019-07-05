import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        int numInput = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = 0;
        int even = 0;
        while (numInput != -1) {
            sum += numInput;
            counter++;
            if (numInput % 2 == 0) {
                even++;
            }
            numInput = Integer.parseInt(reader.nextLine());
        }
        int odd = counter - even;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        
        double average = (double)sum / counter;
        System.out.println("Average: " + average);
        
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
