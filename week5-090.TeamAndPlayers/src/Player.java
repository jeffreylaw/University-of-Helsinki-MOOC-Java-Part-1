/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey
 */
public class Player {
    private String name;
    private int numOfGoals;
    
    public Player(String name) {
        this(name, 0);
    }
    
    public Player(String name, int numOfGoals) {
        this.name = name;
        this.numOfGoals = numOfGoals;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int goals() {
        return this.numOfGoals;
    }
    
    public String toString() {
        return "Player: " + this.name + ", goals " + this.numOfGoals;
    }
}
