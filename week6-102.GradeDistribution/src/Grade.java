/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey
 */
public class Grade {
 
    public static int returnGrade(int grade) {
        int score = 0;
        if (grade < 30) {
            score = 0;
        } else if (grade < 35) {
            score = 1;
        } else if (grade < 40) {
            score = 2;
        } else if (grade < 45) {
            score = 3;
        } else if (grade < 50) {
            score = 4;
        } else {
            score = 5;
        }
        return score;
    }
    
    public static boolean isPassed(int grade) {
        return grade >= 1;
    }
}
