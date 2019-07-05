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
public class BirdwatcherDatabase {
    private ArrayList<Bird> birds;
    
    public BirdwatcherDatabase() {
        this.birds = new ArrayList<Bird>();
    }
    
    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }
    
    public boolean isBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                return true;
            }            
        }
        return false;
    }
    
    public void observation(String name) {
        if (isBird(name)) {
            for (Bird bird : birds) {
               if (bird.getName().contains(name)) {
                   bird.observed();
               }
           }           
        }
    }
    
    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void show(String name) {
        if (isBird(name)) {
            for (Bird bird : birds) {
                if (bird.getName().contains(name)) {
                    System.out.println(bird);
                }
            }
        }
    }
}
