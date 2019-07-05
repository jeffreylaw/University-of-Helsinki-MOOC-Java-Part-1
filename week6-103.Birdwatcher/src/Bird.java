/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey
 */
public class Bird {
    private String name;
    private String latinName;
    private int numOfObservedTimes;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.numOfObservedTimes = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getNumOfObservedTimes() {
        return this.numOfObservedTimes;
    }
    
    public void observed() {
        this.numOfObservedTimes++;
    }
    
    public String toString() {
        return this.name + " (" + this.latinName + "): " 
                + this.numOfObservedTimes + " observations";
    }
    
}
