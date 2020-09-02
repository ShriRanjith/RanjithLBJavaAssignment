package Com.training.lionbridge;

import java.util.Scanner;

public class StudentQualityPoints {
    public int studentAverage(int average) {
        if(average>=90 && average<=100) {
          return 4;
        }else if(average>=80 && average<=89) {
            return 3;    
        }else if(average>=70 && average<=79) {
            return 2;    
        }else if(average>=60 && average<=69) {
          return 1;
        }else if(average<60) {
        return 0;
        }else {
            System.out.println("Average cannot be more than 100,so enter valid average number");  
            return -1;
    } 
    }
    public static void main(String[] args) {
      
       StudentQualityPoints qualityPoints=new StudentQualityPoints();
       System.out.println("Enter the Student Average");
       Scanner input=new Scanner(System.in);
       int averageValue=input.nextInt();
       System.out.printf("The Quality Points for the student based on their average %d",qualityPoints.studentAverage(averageValue));
    }
}