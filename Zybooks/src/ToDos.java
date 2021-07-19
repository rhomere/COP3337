
import java.util.LinkedList;
import java.util.Deque;

public class ToDos {
   public static void main (String[] args) {
      Deque<String> toDo = new LinkedList<String>();

      toDo.addFirst("gardening");
      toDo.removeFirst();
      toDo.addFirst("laundry");
      toDo.addFirst("homework");

      System.out.println("1. " + toDo.removeFirst());
   }
}