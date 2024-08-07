 import java.util.*;

 
 class BankAccount{
      
    double Initial_Balance;
    Scanner sc=new Scanner(System.in);
      
      BankAccount(){
            
            
           System.out.print("Initial Balance:");
           this.Initial_Balance=sc.nextDouble();
           sc.nextLine();

    }
    public void deposit(){
        System.out.print("Amount to be deposit:");
        int amount =sc.nextInt();
        Initial_Balance+=amount;
        System.out.println("Deposit of Rs "+amount+" is successful");
         

    }
    
    public void withdraw(){
        System.out.print("Amount to be withdraw:");
        int amount =sc.nextInt();
        if(amount<=Initial_Balance){
        Initial_Balance-=amount;
        System.out.println("Withdraw of Rs "+amount+" is successful");
        }
        else{
            System.out.println("Withdraw Failed");
        }
    }
    public void CheckBalance(){
        System.out.println("Balance in the account is: Rs "+Initial_Balance);
        
    }
};
public class Atminterface {
    public static void main(String args[]){
        BankAccount b1=new BankAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
        System.out.print("Enter the choice:");
        int choice=sc.nextInt(); 
          while (choice!=4){
            switch (choice) {
                case 1:
                b1.deposit();
                break;
                case 2:
                b1.withdraw();
                break;
                case 3:
                b1.CheckBalance();
                break;
                default:
                System.out.println("Invalid response.Try again");
                break;
                
            }
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
            System.out.print("Enter the choice:");
            choice=sc.nextInt(); 
        }

        
                System.out.println("Exiting program");
    }
    
};
