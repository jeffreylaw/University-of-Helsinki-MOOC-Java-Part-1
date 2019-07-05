import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int inputNum = Integer.parseInt(reader.nextLine());
        
        int num = 1;
        int factorial = 1;
        
        if (inputNum != 0) {
            while (num <= inputNum) {
                factorial *= num;
                num++;
            }            
        }  
        System.out.println("Factorial is " + factorial);
    }
}
