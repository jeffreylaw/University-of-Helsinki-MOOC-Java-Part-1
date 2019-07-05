import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String input = reader.nextLine();
        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + input.substring(input.length() - length));
    }
}
