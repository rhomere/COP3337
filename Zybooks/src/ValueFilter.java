
import java.util.ArrayList;

public class ValueFilter {
   public static void main(String[] args) {
      ArrayList<Integer> userValues  = new ArrayList<Integer>();

      userValues.add(-6);
      userValues.add(0);
      userValues.add(-2);

      System.out.print("Valid:");

      for (Integer currVal : userValues) {
         if (currVal <= -1) {
            System.out.print(" " + currVal);
         }
      }

      System.out.println();
   }
}