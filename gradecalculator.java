import java.util.*;
class Calculator{
     int m1,m2,m3;
     Calculator(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of Physics,Chemistry and Mathematics:");
        this.m1=sc.nextInt();
        this.m2=sc.nextInt();
        this.m3=sc.nextInt();
         
     }
     public void CalculateTotalMarks(){
        int totalmarks=m1+m2+m3;
        System.out.println("Total Marks is:"+totalmarks);
     }
     public void CalculateAveragePercentage(){
        float averagepercentage=(m1+m2+m3)/3;
        System.out.println("Average percentage="+averagepercentage);
     }
     public void CalculateGrade(){
        if(m1>=90&&m2>=90&&m3>=90){
            System.out.println("Grade is:A");
        }
        else if(m1>=80&&m2>=80&&m3>=80){
            System.out.println("Grade is:B");
        }
        else if(m1>=70&&m2>=70&&m3>=70){
            System.out.println("Grade is:C");
        }
        else{
            System.out.println("Grade is:D");
        }
     }
};


public class gradecalculator {
    public static void main(String args[]){
        Calculator c1=new Calculator();
        c1.CalculateTotalMarks();
        c1.CalculateAveragePercentage();
        c1.CalculateGrade();

    }
    
}
