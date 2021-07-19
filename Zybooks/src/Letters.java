
import java.util.LinkedList;

public class Letters {
   public static void main(String[] args) {
      LinkedList<Character> letters = new LinkedList<Character>();
      Character letter;
      int i;

      letters.add('C');
      letters.add('D');
      letters.add('E');
      letters.add('F');

      letters.add(1, 'G');
      letters.set(2, 'H');
      letters.remove(4);

      for (i = 0; i < letters.size(); ++i) {
         letter = letters.get(i);
         System.out.print(letter);
      }
      System.out.println();
   }
}