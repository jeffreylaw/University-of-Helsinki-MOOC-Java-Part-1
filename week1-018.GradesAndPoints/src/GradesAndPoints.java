
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        String grade = "";
       
        if (points > 49 && points <= 60) {
            grade += 5;
        } else if (points > 44) {
            grade += 4;
        } else if (points > 39) {
            grade += 3;
        } else if (points > 34) {
            grade += 2;
        } else if (points > 29) {
            grade += 1;
        } else {
            grade = "failed";
        }
        
        System.out.println("Grade: " + grade);
    }
}
