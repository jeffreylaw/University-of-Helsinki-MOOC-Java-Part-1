// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
import java.util.ArrayList;
public class Application {

    public static void main(String[] args) {
        
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(4);
    numbers.add(8);

        System.out.println(numbers);
    // tries to remove the number from the index 4, does not work as expected!
    numbers.remove(1);
        System.out.println("");
        System.out.println(numbers);
    // this removes the number 4 from the list
//    numbers.remove(Integer.valueOf(4));
    }
}
