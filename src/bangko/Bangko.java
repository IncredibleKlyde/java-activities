package bangko;

import java.util.Scanner;


public class Bangko {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to my system!");
        System.out.println("What's on your mind today?");
        System.out.println("1. Banking");
        System.out.println("2. Book Hotel");
        System.out.println("3. Order Food");
        
        System.out.print("Select option: ");
        int choice = sc.nextInt();
       
        switch(choice){
        
            case 1:
                BankingClass bc = new BankingClass();
               
                for(int i = 0; i < 3; i++) {
                    System.out.print("Enter your account number: ");
                    int accno = sc.nextInt();

                    System.out.print("Enter your PIN: ");
                    int pin = sc.nextInt();
            
                if (i == 2) {
                    System.out.println("You have reached the maximum attempts.");
                }else if(bc.accountConfirmation(accno, pin) == false) {
                    System.out.println("Failed, try again.");
                } else {
                    System.out.println("Success");
                break;
            }
        }
                    
                
                    /*if(bc. accountConfirmation(accno, pass)){
                        System.out.println("You have logged in");
                    }else{
                        System.out.println("Invalid Account");
                    }*/
                         
        }
        
    }
    
}
