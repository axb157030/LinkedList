import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

// It takes in a number adds the reverse of the number to it. If their are any duplicate numbers in it, the number will
// double but it will only double once. Example: input 123. It adds reverse of it(321) to get 444. Since there is a duplicate of 4 in it
// this will double

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    String line2 = "";
    int x = 0;
    int copy = 0;
    int backx = 0;
    char a;
    while ((line = in.readLine()) != null) {
      //System.out.println(line);
      x = Integer.parseInt(line);
        for(int i = line.length() - 1; i >= 0 ; i--)
        
            {
                line2 += line.charAt(i);
                
            }
            
           backx = Integer.parseInt(line2);
           x += backx;
            line = String.valueOf(x);
           // System.out.println(x);
            
      for(int j = 0; j < line.length(); j++)
      {
          a = line.charAt(j);
              for(int i = j + 1; i < line.length(); i++)
            {
                //line2 += line. charAt(i);
                
                if(a == line.charAt(i))
                {
                    copy = x *2;
                    //System.out.println(x);
                    break;
                }
                if(copy == (2 * x))
                {
                    break;
                }
                
                
            }
      } 
      
      System.out.println(copy);
    }
  }
}
