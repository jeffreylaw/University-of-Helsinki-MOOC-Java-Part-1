
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.print("name: ");
            String name = scan.nextLine();
            if (name.trim().isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = scan.nextLine();
            list.add(new Student(name, studentNumber));
        }
        
        System.out.println("");
        for (Student stud : list) {
            System.out.println(stud);
        }
        
        System.out.println("");

        System.out.print("Give search term: ");
        String searchInput = scan.nextLine();
        System.out.println("Result:");
        for (Student stud : list) {
            if (stud.getName().contains(searchInput)) {
                System.out.println(stud);
            }
        }
        
    }
}
