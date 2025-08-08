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
        
        BankingClass bApp[] = new BankingClass[10];
        
        System.out.print("Select option: ");
        int choice = sc.nextInt();
        int resp;
        int index = 0;
        
        switch(choice){
            case 1:
                do {
                    System.out.println("1. Register Account");
                    System.out.println("2. Login Account");
                    System.out.println("3. View All Accounts");
                    System.out.println("Enter Selection: ");
                    int action = sc.nextInt();
                    
                    switch (action) {
                        case 1:
                            bApp[index] = new BankingClass();
                            System.out.print("Enter Account No.: ");
                            bApp[index].setAccountNo(sc.nextInt());
                            System.out.print("Enter Account Pin: ");
                            bApp[index].setPass(sc.nextInt());
                            index += 1;
                            break;
                        case 2:
                            int attempts = 3;
                            boolean loggedIn = false;

                            do{
                              if(attempts == 1){
                                System.out.println("ATTEMPT LIMIT REACHED!");
                                System.exit(0);
                              }
                              
                                System.out.print("Enter your Account No: ");
                                int accountNo = sc.nextInt();
                                System.out.print("Enter your Pin: ");
                                int pin = sc.nextInt();
                                
                              
                                for (int i = 0; i < index; i++){
                                    if (bApp[i].accountConfirmation(accountNo, pin)){
                                        loggedIn = true;
                                        break;
                                    }
                                }
                                if (loggedIn == true){
                                    System.out.println("You sucessfully logged in");
                                    break;
                                }
                                    System.out.println("Invalid Account!");
                                
                                    attempts--;
                                System.out.println("Attempt Left: "+attempts);
                            }while (attempts > 0);
   
                               
                        break;
                        case 3:
                                System.out.println("ID      Account Numbber");           
                                System.out.println("-----------------------");
                            for (int i = 0; i < index; i++){
                                System.out.printf("%d       %d\n", i+1 , bApp[i].getAccountNo() );
                                
                            } 
                            break;
                    }
                    
                    System.out.print("Do you want to continue? (1/0):");
                    resp = sc.nextInt();
                } while (resp == 1);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid Selection");
                         
        }
        
    }
}