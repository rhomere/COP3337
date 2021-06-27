import java.util.Scanner;

/*
 * 20.2.4
 * Question 1: Binary search first checks the value 25 at index 4 (0+9/2 = 4). As 77 is greater than 25, binary search then searches the right sublist.
 * 
 * Question 2: Binary search first checks the value 25 at index 4 ((0+9)/2 = 4), then searches the left sublist at index 1 ((0+3)/2 = 1), and then searches the right sublist at index 2 ((2+3)/2 = 2), finding the value 17. 
 */
public class Chapter_20_Binary_Search {
	public static int binarySearch(int [] numbers, int key) {
	      int mid;
	      int low;
	      int high;
	      
	      low = 0;
	      high = numbers.length - 1;

	      while (high >= low) {
	         mid = (high + low) / 2;
	         if (numbers[mid] < key) {
	            low = mid + 1;
	         } 
	         else if (numbers[mid] > key) {
	            high = mid - 1;
	         } 
	         else {
	            return mid;
	         }
	      }

	      return -1; // not found
	   }

	   public static void main(String [] args) {
	      Scanner scnr = new Scanner(System.in);
	      int [] numbers = {2, 4, 7, 10, 11, 32, 45, 87};
	      int i;
	      int key;
	      int keyIndex;

	      System.out.print("NUMBERS: ");
	      for (i = 0; i < numbers.length; ++i) {
	         System.out.print(numbers[i] + " ");
	      }
	      System.out.println();

	      System.out.print("Enter a value: ");
	      key = scnr.nextInt();

	      keyIndex = binarySearch(numbers, key);

	      if (keyIndex == -1) {
	         System.out.println(key + " was not found.");
	      } 
	      else {
	         System.out.println("Found " + key + " at index " + keyIndex + ".");
	      }
	   }
}
