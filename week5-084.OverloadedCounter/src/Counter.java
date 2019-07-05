/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey
 */
public class Counter {
    private boolean check;
    private int counter;
    
    public Counter() {
        this.counter = 0;
        this.check = false;
    }
    
    public Counter(boolean check) {
        this.counter = 0;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this.counter = startingValue;
        this.check = false;
    }
    
    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }
    
    public int value() {
        return this.counter;
    }
    
    public void increase() {
        this.counter++;
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
          this.counter += increaseAmount;            
        }
    }
    
    public void decrease() {
        this.counter--;
        if (check && this.counter < 0) {
            this.counter = 0;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
        this.counter -= decreaseAmount;
            if (check && this.counter < 0) {
                this.counter = 0;
            }   
        }
    }
}
