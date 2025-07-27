
import java.util.Scanner;

public class java2nd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int numba;
        
        System.out.println("Enter a number: ");
        numba = sc.nextInt();
        
        if (numba == 0){
            System.out.println("Inputted number is Zero");
        }else if (numba < 0){
            System.out.println("Inputted number is Negative");
        }else if (numba > 0){
            System.out.println("Inputted number is Positive");
        }
    }
}

