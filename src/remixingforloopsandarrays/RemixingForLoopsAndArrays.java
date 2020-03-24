/*
Isaac Collier
March 24 2020
This program uses arrays and for loops to get 20 numbers from the user to add.
 */
package remixingforloopsandarrays;

/**
 *
 * @author Isaac
 * This class is teaching me bout arrays and how to use them to make repeated code quicker.
 */
import java.util.Scanner;
public class RemixingForLoopsAndArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner keyedInput = new Scanner (System.in);
        
      //creates array:
        int [ ] numbers = new int [20];
        
        //declares variables:
        int total = 0;
        
        //asks user for twenty numbers
        System.out.println("Enter twenty integers and they will be added together:");
        
        //creates for loop that runs 20 times, where user declares a number every time:
        for (int i = 0; i <= 19; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        
        //Creates a for loop where the numbers inputted are all added to a total:
        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        //Displays sum to user:
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
        
        
        
        
        
        
        
    }
    
}
