
import java.util.Queue;
import java.util.LinkedList;

public class CustomerQueue {
   public static void main(String[] args) {
      Queue<String> customers = new LinkedList<String>();

      customers.add("Van");
      customers.add("Edd");
      customers.add("Rio");
      customers.add("Noa");
  
      System.out.println(customers.poll());
      System.out.println(customers.peek());
      System.out.println(customers.element());
      customers.remove();
   }
}