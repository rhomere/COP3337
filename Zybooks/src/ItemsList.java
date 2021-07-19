
import java.util.Queue;
import java.util.LinkedList;

public class ItemsList {
   public static void main(String[] args) {
      Queue<String> fruits = new LinkedList<String>();

      fruits.add("grape");
      fruits.add("apple");
      fruits.remove();
      fruits.add("pear");
      fruits.remove();

      System.out.println(fruits.remove());
   }
}