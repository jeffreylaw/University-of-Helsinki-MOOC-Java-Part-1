import java.util.Collections;
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        int counter = text.length() - 1;
        int i = 0;
        while (i <= counter) {
            if (text.charAt(i) != (text.charAt(counter))) {
                return false;
            }
            i++;
            counter--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
