public class FindMinSum
{
   public static void main (String[] args)
   {

      int[] A = {24, 4, -7, 4, -134};
      
      int minSum = 0, thisSum = 0;
      
      for(int j = 0; j < A.length; j++)
      {
         thisSum += A[j];
         
         if(thisSum < minSum)
         {
            minSum = thisSum;
         }
         
         else if(thisSum > 0)
         {
            thisSum = 0;
         }
         
         System.out.println(minSum);
      }
   }
}