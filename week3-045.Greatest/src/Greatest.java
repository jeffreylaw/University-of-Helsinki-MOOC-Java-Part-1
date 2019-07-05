
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatestNum = number1;
        if (number2 > greatestNum){
            greatestNum = number2;
        }
        if (number3 > greatestNum ) {
            greatestNum = number3;
        }
        return greatestNum;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
