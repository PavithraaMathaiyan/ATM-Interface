import java.util.*;   
public class Atm 
{    
    public static void main(String args[] )  
    {   
        int balance = 100000;    
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("For Withdrawing press W");  
            System.out.println("For Depositing press D");  
            System.out.println("For Check Balance press C");  
            System.out.println("To EXIT press E");  
            System.out.print("Enter the operation that you want to perform:");   
            String choice = sc.nextLine();  
            switch(choice)  
            {  
                case "W":  
        System.out.print("Enter money to be withdrawn:");    
        int withdraw = sc.nextInt();  
        if(balance >= withdraw)  
        {   
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {    
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case "D":  
                      
        System.out.print("Enter money to be deposited:");   
        int deposit = sc.nextInt();   
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully deposited");  
        System.out.println("");  
        break;  
   
                case "C":   
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case "E":  
        System.exit(0);  
            } 
        }  
    }
}  
