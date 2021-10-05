package arrayshift;

import java.util.Scanner;

/**
 *
 * @author marvindelgado
 */
public class ArrayShift 
{
    public static void main(String[] args)                    //Main method, i ask user
    {                                                         //for info about array
        int userArray [];
        int arraySize;
        char shift;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of "
                + "slots needed in the array: ");
        arraySize = input.nextInt();                          //I get the number of array slots
        userArray = new int [arraySize];
        
        for(int i = 0; i < userArray.length; i++)             //Makes array with random numbers.
        {
         userArray[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
        }
        printArray(userArray);                                //Prints array with random numbers.
        System.out.print("Which direction "
                + "would you like to shif R/L? ");
        shift = input.next().charAt(0);                       //Ask user which direction they would 
        if(shift == 'R' || shift == 'r')                      //like to shift the array
        {
            shiftRight(shift, userArray);
        }
        else if(shift == 'L' || shift == 'l')                 //If left it goes into left method
        {                                                     //If right it goes into right method.
            shiftLeft(shift, userArray);
        }
    }
    
    public static void printArray(int[] userArray)            //Method to print the array
    {
        
        System.out.print("These are the elements "
                + "in your array: ");
        
        for(int i = 0; i < userArray.length; i++)
        {
            System.out.print(userArray[i] + " ");
        }
        System.out.println();
    }
    
    public static void shiftRight(char shift, int[] userArray)      //Method to shift the array
    {                                                               //to the right.
        int amount = 0;
        int size = userArray.length;
        Scanner input = new Scanner(System.in);
        System.out.print("How many times? ");
        amount = input.nextInt();
        
        for(int j = 0; j < amount; j++)                             //Loops however many times 
        {                                                           //user input
            int last = userArray[size - 1];
            for(int i = 1; i < size; i++)                           //Loops to shift each element in 
            {                                                       //the array.
                userArray[size - i] = userArray[size - (i + 1)];   
            }
            userArray[0] = last;
        }
        printArray(userArray);                                      //Prints array after shift.
        
    }
    
    public static void shiftLeft(char shift, int[] userArray)       //Method to shift the array
    {                                                               //to the left.
        int amount;
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many times? ");
        amount = input.nextInt();
        
        for(int j = 0; j < amount; j++)                             //Loops number of times user input.
        {
            int first = userArray[0];
            for(int i = 0; i < userArray.length - 1; i++)           //Loops each element in the array.
            {
                userArray[i] = userArray[i + 1];
            }
            userArray[userArray.length - 1] = first;
        }
        
        printArray(userArray);                                      //Prints array after shift.
    }
}
