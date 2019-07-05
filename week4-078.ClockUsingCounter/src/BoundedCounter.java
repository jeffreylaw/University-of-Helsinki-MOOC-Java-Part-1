/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    
    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        if (value >= 0 && value <= this.upperLimit) {
            this.value = value;
        }
    }
    
    public String toString() {
        return this.value < 10 ? "0" + this.value : "" + this.value;
    }
    
}
