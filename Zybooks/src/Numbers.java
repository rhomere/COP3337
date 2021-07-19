
import java.util.LinkedList;
import java.util.Deque;

public class Numbers {
   public static void main (String[] args) {
      Deque<Integer> nums = new LinkedList<Integer>();
      int dequeSize;

      nums.addLast(29);
      nums.addLast(86);
      nums.addFirst(62);

      System.out.println(nums.pollFirst());
      System.out.println(nums.pollLast());
      System.out.println(nums.pollLast());
  }
}