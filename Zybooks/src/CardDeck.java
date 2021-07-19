
import java.util.LinkedList;
import java.util.Deque;

public class CardDeck {
   public static void main (String[] args) {
      Deque<String> cards = new LinkedList<String>();

      cards.addLast("10_diamonds");
      cards.addFirst("9_spades");
      cards.addLast("queen_clubs");

      System.out.println(cards.peekLast());
      System.out.println(cards.peekFirst());
      System.out.println(cards.getFirst());
      System.out.println(cards.getLast());
  }
}