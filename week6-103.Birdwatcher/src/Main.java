import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    Scanner scan = new Scanner(System.in);
    menu(scan);
            
    }

    public static void menu(Scanner scan) {
        BirdwatcherDatabase db = new BirdwatcherDatabase();
        while (true) {
        System.out.print("? ");
        String command = scan.nextLine();    
        if (command.toLowerCase().equals("quit")) {
            break;
        }
        
        if (command.toLowerCase().equals("add")) {
            System.out.print("Name: ");
            String birdName = scan.nextLine();
            System.out.print("Latin Name: ");
            String latinName = scan.nextLine();
            db.addBird(birdName, latinName);
        }
        
        if (command.toLowerCase().equals("observation")) {
            System.out.print("What was observed:? ");
            String observedBird = scan.nextLine();
            if (db.isBird(observedBird)) {
            db.observation(observedBird);                
            } else {
                System.out.println("Is not a bird!");
            }
        }
        
        if (command.toLowerCase().equals("statistics")) {
            db.statistics();
        }
        
        if (command.toLowerCase().equals("show")) {
            System.out.print("What? ");
            String inputBird = scan.nextLine();
            db.show(inputBird);
        }
        }
    }
}
