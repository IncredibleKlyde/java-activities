package first.java;

import java.util.Scanner;


public class FirstJava {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        System.out.println("");
        
        if(num == 0){
            System.out.println("Inputted number is Zero");
        }else if(num % 2 == 0){
            System.out.println("Inputted number is Even");
        }else if(num <= 0){
            System.out.println("Inputted number is Negative");
        }else{
            System.out.println("Inputted number is Odd");
        }
        
    }
    
}
