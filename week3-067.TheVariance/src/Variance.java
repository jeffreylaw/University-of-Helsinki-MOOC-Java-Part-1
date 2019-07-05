import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double)sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double numerator = 0;
        double average = average(list);
        for (int num : list) {
            numerator += Math.pow(num - average, 2);
            System.out.println("old" + (num - average(list)));
            
            System.out.println("new" + (num - average));
            
            System.out.println("\n\n");
        }
        return numerator / (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(3);
//        list.add(2);
//        list.add(7);
//        list.add(2);
list.add(1);
list.add(3);
        
        System.out.println("The variance is: " + variance(list));
    }

}
