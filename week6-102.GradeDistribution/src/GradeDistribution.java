/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Jeffrey
 */
public class GradeDistribution {
    int[] scoresArray;
    private int numOfGrades;
    private int numOfPasses;

    public GradeDistribution() {
        this.scoresArray = new int[6];
        for (int i = 0; i < this.scoresArray.length; i++) {
            this.scoresArray[i] = 0;
        }
    }
    
    public void inputScores(Scanner scan) {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int input = Integer.parseInt(scan.nextLine());
            if (input == -1) {
                break;
            }
            
            if (input >= 0 && input <= 60) {
                int grade = Grade.returnGrade(input);
//                System.out.println(grade);
                this.scoresArray[grade] += 1;
                this.numOfGrades++;
                if (Grade.isPassed(grade)) {
                    this.numOfPasses += 1;
                }
            }
        }
    }
    
    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int i = this.scoresArray.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < this.scoresArray[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void printPercentage() {
        System.out.print("Acceptance percentage: ");
//        System.out.println(this.numOfPasses);
//        System.out.println(this.numOfGrades);
        System.out.println((100.0 * this.numOfPasses) / this.numOfGrades);
    }
}
