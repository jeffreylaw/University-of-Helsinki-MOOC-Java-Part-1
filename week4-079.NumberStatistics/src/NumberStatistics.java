
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }
    
    public void addNumber(int number) {
        amountOfNumbers++;
        this.sum += number;
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        }
        return (double)this.sum / this.amountOfNumbers;
    }
}
