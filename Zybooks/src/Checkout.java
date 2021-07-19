
import java.util.ArrayList;

public class Checkout {
   public static void main(String[] args) {
      ArrayList<Integer> cartItems = new ArrayList<Integer>();
      int cartTotal;

      cartTotal = 0;

      cartItems.add(6);
      cartItems.add(10);
      cartItems.add(2);
      cartItems.add(5);

      for (Integer currItem : cartItems) {
         cartTotal = cartTotal + currItem;
      }

      System.out.println("Total: " + cartTotal);
   }
}