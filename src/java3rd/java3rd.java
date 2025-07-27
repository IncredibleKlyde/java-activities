package java3rd;

import java.util.Scanner;

public class java3rd {
    
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner (System.in);
        
        String name;
        int science, history, math, soc, arts, total;
        double percentage;
        
        System.out.print("Enter name: ");
        name = sc.nextLine();
        
        System.out.print("Enter marks in Science: ");
        science = sc.nextInt();
        System.out.print("Enter marks in History: ");
        history = sc.nextInt();
        System.out.print("Enter marks in Mathematics: ");
        math = sc.nextInt();
        System.out.print("Enter marks in Soc: ");
        soc = sc.nextInt();
        System.out.print("Enter marks in Arts: ");
        arts = sc.nextInt();
        
        total = (science + history + math + soc + arts);
        
        System.out.println("Total Marks: " + total);
        
        percentage = ((double)total / 5);
        
        System.out.printf("Total Average: %.2f\n" , percentage);
        
        if (percentage > 71 && percentage < 76){
            System.out.println("Remarks: Poor  ");
        }else if (percentage >= 76 && percentage < 81){
            System.out.println("Remarks: Fair");
        }else if (percentage >= 81 && percentage < 86){
            System.out.println("Remarks: Good");
        }else if (percentage >= 86 && percentage < 91){
            System.out.println("Remarks: Very Good");
        }else if (percentage >= 91 && percentage <= 100){
            System.out.println("Remarks: Excellent");
        }else{
            System.out.println("Remarks: Fail");
        }    
    }
}