/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Jeffrey
 */
public class Team {
    private String name;
    private ArrayList<Player> list;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
        this.list = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player play) {
        if (this.size() < this.maxSize) {
            this.list.add(play);    
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.list.size();
    }
    
    public int goals() {
        int goals = 0;
        for (Player i : this.list) {
            goals += i.goals();
        }
        return goals;
    }
    
    public void printPlayers() {
        for (Player i : this.list) {
            System.out.println(i);
        }
    }
}
