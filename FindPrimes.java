
// Amine Benelbar

// Class: CS 3345

// Section: .004

// Semester: Spring 2017

// Project #1
// Program Description: Write a java program to compute all prime numbers less than or equal to a given integer N

//       Pseudocode
// 
// Input: an integer n > 1
//  
// Let A be an array of Boolean values, indexed by integers 2 to n,
// initially all set to true.
//  
// for i = 2, 3, 4, ..., not exceeding n^.5:
// if A[i] is true:
// for j = i^2, i^2+i, i^2+2i, i^2+3i, ..., not exceeding n:
// A[j] := false
//  
// Output: all i such that A[i] is true.

import java.util.Scanner;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.Error;
import java.util.InputMismatchException;

public class FindPrimes 
{

   public static void main (String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      int j; // Contain subscript in array A that is not prime
      int N = 0;  
      int Integer = 0;
      boolean repeat = false; // Sentinel of do-while loop made to get and validate user input 
        
     try 
     {   
      System.out.println("Enter the given integer. Please input an integer that is greater than 1 ");
      Integer = input.nextInt();
     }
     
     
 //i    repeat = false; 
     
      catch(InputMismatchException e)
      {
          System.out.println("ERROR.Invalid input. Program will end.");
         System.exit(0);
      }
      
//       System.out.println("Hey Dummy");
      N = Integer;
      
//      repeat = false;
     
     // N is the given integer where all prime numbers less than or equal to it will be found and displayed in the program
   
    
       while(N < 2)
       {
         
         try 
         {     
            System.out.println("Invalid entry. Please input an integer that is greater than 1 ");
            Integer = input.nextInt();     
         }
         
    //     repeat = false; 
         
         catch(InputMismatchException e)
         {
            System.out.println("ERROR.Invalid input. Program will end.");
             System.exit(0);
         }
         
         N = Integer;
 //        repeat = false; 
          
       }
    
    N += 1; 
    
    boolean[] A = new boolean[N]; // All values initially set to false
    
    for(int i = 0; i < N; i++)
    {
      A[i] = true; // Set all values of array A to true
    }
    
    int numOfIterations = (int)Math.sqrt(N);
    
   for(int i = 2; i <= numOfIterations; i++)
   {
      if(A[i])
      {
      
      for(int n = 0; n < N; n++)
      {
           j = (i * i) + (n * i);
           if(j < N)
           {
               A[j] = false;
              System.out.println(j);
           }
      }
//           
//           j = (i * i)+ i;
//           if(j < N)
//           {
//             A[j] = false;
//             System.out.println(j);
//           }
//           
//           j = (i * i) + (2 * i);
//           if(j < N)
//           {
//             A[j] = false;
//             System.out.println(j);
//           }
//           
//           j = (i * i)+ (3 * i);
//           if(j < N)
//           {
//             A[j] = false;
//             System.out.println(j);
//           }
      }
   }   
      
      // Display prime numbers
         for(int i = 2; i < N; i++)
         {
            if(A[i])
            {
               System.out.print(i + " ");
            }  
      }
   }
}
