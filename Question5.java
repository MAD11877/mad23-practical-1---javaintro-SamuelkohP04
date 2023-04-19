import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    ArrayList <Integer> data = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    if (num > 0) {
      for (int i = 0; i < num; i++) {
        int n = in.nextInt();
        data.add(n);
      }
    }
    in.close();
    System.out.println(Collections.max(data));

  }
}
