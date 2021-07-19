
import java.util.LinkedList;
import java.util.Deque;

public class Words {
   public static void main (String[] args) {
      Deque<String> fruits = new LinkedList<String>();
      int dequeSize;

      fruits.addLast("pear");
      fruits.addLast("apple");
      fruits.addLast("plum");

      dequeSize = fruits.size();
      for (int i = 0; i < dequeSize; ++i) {
              System.out.println(fruits.removeLast());
      }
   }
}