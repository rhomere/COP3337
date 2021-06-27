
/*
 * Section 20.7.3
 * Question 1
 * In the worst case, assuming each comparison takes 1 µs, how long will insertion sort algorithm take to sort a list of 10 elements?
 * Answer
 * (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) * 1 µs = 45 µs
 */

/*
 * For each outer loop execution, if the element is already in sorted position, only a single comparison is made. Each element not in sorted position requires at most N comparisons. If there are a constant number, C, of unsorted elements, sorting the N - C sorted elements requires one comparison each, and sorting the C unsorted elements requires at most N comparisons each.
 * The runtime for nearly sorted inputs is O((N - C) * 1 + C * N) = O(N).
 */

/*
 * Section 20.6.3
 * Question 3
 * How many times longer will sorting a list of 500 elements take compared to a list of 50 elements?
 * Answer
 * 500^2 / 50^2 = 250000 / 2500 = ?
 */
public class Chapter_20_Insertion_Sort {
	public static void insertionSort(int [] numbers) {
	      int i;
	      int j;
	      int temp;      // Temporary variable for swap

	      for (i = 1; i < numbers.length; ++i) {
	         j = i;
	         // Insert numbers[i] into sorted part 
	         // stopping once numbers[i] in correct position
	         while (j > 0 && numbers[j] < numbers[j - 1]) {

	            // Swap numbers[j] and numbers[j - 1]
	            temp = numbers[j];
	            numbers[j] = numbers[j - 1];
	            numbers[j - 1] = temp;
	            --j;
	         }
	      }
	   }

	   public static void main(String [] args) {
	      int [] numbers = {10, 2, 78, 4, 45, 32, 7, 11};
	      int i;

	      System.out.print("UNSORTED: ");
	      for (i = 0; i < numbers.length; ++i) {
	         System.out.print(numbers[i] + " ");
	      }
	      System.out.println();

	      insertionSort(numbers);

	      System.out.print("SORTED: ");
	      for (i = 0; i < numbers.length; ++i) {
	         System.out.print(numbers[i] + " ");
	      }
	      System.out.println();
	   }
}
