 import java.util.Random;
 import java.util.*;
 class Game{
     int Number;
     int Input_Number;
     int No_of_Guesses;

     Game(){
        Random r=new Random();
        Number=r.nextInt(100);

     }
     public int getNoOfGuesses(){
      return No_of_Guesses;
     }
     public void setNoOFGuesses(int No_of_Guesses){
         this.No_of_Guesses=No_of_Guesses;
     }
      
     void Taking_UserInput(){
          System.out.print("Guess the Number:");
          Scanner sc=new Scanner(System.in);
          Input_Number=sc.nextInt();
          
     }
     boolean Is_The_InputCorrect(){
        No_of_Guesses++;
           if(Input_Number==Number){
            System.out.println("Yes,You Guessed it Right in "+No_of_Guesses+" attempts");
            return true;
           } 
           else if(Input_Number>Number){
            System.out.println("Too High");
           }
           else{
            System.out.println("Too Low");
           }
           return false;
     }



 }
 public class Number_Game{
    public static void main(String args[]){
       Game g=new Game();
       boolean b=false;
        while(!b){

        
       g.Taking_UserInput();
       b=g.Is_The_InputCorrect();
       System.out.println(b);
        }

    }
 }


