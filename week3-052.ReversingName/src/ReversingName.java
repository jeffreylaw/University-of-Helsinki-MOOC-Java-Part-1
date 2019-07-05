import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String input = reader.nextLine();
        int counter = input.length() - 1;
        System.out.print("In reverse order: ");
        while (counter >= 0) {
            System.out.print(input.charAt(counter));
            counter--;
        }
        System.out.println();
    }
}
