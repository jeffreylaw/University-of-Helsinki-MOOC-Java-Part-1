import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        
        NumberStatistics sumStats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();

                
        System.out.println("Type numbers: ");
        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                break;
            }
            sumStats.addNumber(input);
            
            if (input % 2 == 0) {
                evenStats.addNumber(input);
            } else {
                oddStats.addNumber(input);
            }
        }
        System.out.println("sum: " + sumStats.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        
//        NumberStatistics stats = new NumberStatistics();
//        stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
//        System.out.println("Amount: " + stats.amountOfNumbers());
//        System.out.println("sum: " + stats.sum());
//        System.out.println("average: " + stats.average());

    }
}
