import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.close();

    for (int i = n; i > 0; i--){
      for (int j = 0; j < i; j++){
        System.out.print("*");
      }
        System.out.println();
    }
    //__________________________________________________________
    /*Alternative answer: 
    for (int i = 0; i < n; i++){
      for (int j = 0; j < (n-i); j++){
        System.out.print("*");
      }
        System.out.println();
    }
   */
  }

}
