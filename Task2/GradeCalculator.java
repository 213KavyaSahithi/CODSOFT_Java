// TASK 2 - STUDENT GRADE CALCULATOR

/*Input                      : Take marks obtained (out of 100) in each subject.
Calculate Total Marks        : Sum up the marks obtained in all subjects.
Calculate Average Percentage : Divide the total marks by the total number of subjects to get the average percentage.
Grade Calculation            : Assign grades based on the average percentage achieved.
Display Results              : Show the total marks, average percentage, and the corresponding grade to the user */

import java.util.*;
public class GradeCalculator{
    static int totalmarks(int a[]){
        int total = 0;
        for(int i=0;i<a.length;i++){
            total+=a[i];
        }
        return total;
    }
    static double avgpercentage(int total,int a[]){
        double avgpercentage = total/a.length;
        return avgpercentage;
    }
    static String grade(double avgpercentage){
        String grade="";
        if(avgpercentage>=90 && avgpercentage<=100){
            grade+='S';
        }
        else if(avgpercentage>=80 && avgpercentage<90){
            grade+='A';
        }
        else if(avgpercentage>=70 && avgpercentage<80){
            grade+='B';
        }
        else if(avgpercentage>=60 && avgpercentage<70){
            grade+='C';
        }
        else if(avgpercentage>=50 && avgpercentage<60){
            grade+='D';
        }
        else if(avgpercentage>=40 && avgpercentage<50){
            grade+='E';
        }
        else if(avgpercentage<=40){
            grade+='F';
        }
        return grade;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String a = input.nextLine();
        System.out.println("Enter number of subjects:");
        int n = input.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the marks in each subject:");
        for(int i=0;i<n;i++){
            marks[i] = input.nextInt();
        }
        int t=totalmarks(marks);
        double avgp = avgpercentage(t, marks);
        String g  = grade(avgp);
        System.out.println("-------------REPORT CARD-------------");
        System.out.println("NAME OF THE STUDENT : "+a);
        for(int i=0;i<marks.length;i++){
            System.out.println("MARKS IN SUBJECT "+(i+1)+"  : "+marks[i]);
        }
        System.out.println("TOTAL MARKS OBTAINED: "+t);
        System.out.println("AVERAGE PERCENTAGE  : "+avgp+"%");
        System.out.println("GRADE OF THE STUDENT: "+g);
        System.out.println("-------------------------------------");
    }
}