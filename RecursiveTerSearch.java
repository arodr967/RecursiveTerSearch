/*
File name: RecursiveTerSearch.java
Recursively search an array by dividing it in 3 parts.
 */
//*********PROPERTY OF ALICIA RODRIGUEZ**********
import java.util.Scanner;

public class RecursiveTerSearch
{
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    public static int terSearch(int array[], int low, int high, int x)
    {
        return recursiveTerSearch(array, low, high-1, x);
    }
    
    private static int recursiveTerSearch(int array[], int low, int high, int x)
    {
        //formulas:
        int d1 = low + ((high-low)/3) ;
        int d2 = d1 + ((high-low)/3) ;
      //*********PROPERTY OF ALICIA RODRIGUEZ**********  
        //trivial cases:
        if (low > high) //number not found
            return -1;       
        if(array[d1] == x) //x is d1
            return d1;
        else if(array[d2] == x) //x is d2
            return d2;
        
        else if(array[d1] < x) //from 0 to d1
            return recursiveTerSearch(array, d1+1, high, x);
        else if(array[d1] > x && array[d2] < x) //in between d1 and d2
            return recursiveTerSearch(array, d1+1, d2-1, x);
        else //array[d2] > x, from d2 to high
            return recursiveTerSearch(array, low, d2-1, x);
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
    
    public static void main(String[] args) 
    {//*********PROPERTY OF ALICIA RODRIGUEZ**********
        System.out.println("--Search for a number in an array--");
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat number would you like to search? ");
        int number = input.nextInt();
        
        int array[] = {1, 3, 4, 5, 7, 8, 9, 10, 23, 45, 54, 56, 67, 68, 69};
        int answer = terSearch(array, 0, array.length, number);
        
        if(answer >=0)
            System.out.println(number + " is in position " + answer);
        else //*********PROPERTY OF ALICIA RODRIGUEZ**********
            System.out.println(number + " is not found in the array");
    }
  //*********PROPERTY OF ALICIA RODRIGUEZ**********  
} //end of RecursiveTerSearch class definition
