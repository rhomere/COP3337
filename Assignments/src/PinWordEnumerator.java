/**   
  Renel Homere
  COP3337 RVCC 1215
  2075540
*/

import java.util.ArrayList;
import java.util.Scanner;

/**
   Converts a numeric pin to an equivalent word using the digit to 
   letter mapping on a standard telephone keypad.
 */
public class PinWordEnumerator 
{
	public static ArrayList<String> EnumeratedWords = new ArrayList<String>();
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a pin number-> ");
        String num = scan.nextLine();
        System.out.println();
        System.out.printf("The keypad encodings for %s are:%n",num);    
        ArrayList<String> words = GetWords(num);
        for (String word : words) {
        	EnumeratedWords.addAll(enumerateWords(word));	
        }
        PrintWords();
    }
    
    /**
     * Since there are multiple letters for the digits on a keypad
     * The function returns all word combinations that a number combination 
     * can result in.
     */
    public static ArrayList<String> GetWords(String num) {
    	ArrayList<String> result = new ArrayList<String>(); 
    	
    	// at least 3 digits on most letters
    	for (int i = 0; i < 3; i++) {
    		String word = "";
    		for (char c : num.toCharArray()) {
        		char[] chars = GetCharsFromNumber(c); 
        		if (chars != null)
        			word += chars[i];
        	}	
    		result.add(word);
    	}
    	return result;
    }
    
    /**
     * For the keypad numbers that have letters,
     * get a character array of those letters.
     */
    public static char[] GetCharsFromNumber(Character digit){
    	switch (digit) {
    		case '2':
    			return new char[] { 'A', 'B', 'C'};
    		case '3':
    			return new char[] { 'D', 'E', 'F'};
    		case '4':
    			return new char[] { 'G', 'H', 'I'};
    		case '5':
    			return new char[] { 'J', 'K', 'L'};
    		case '6':
    			return new char[] { 'M', 'N', 'O'};
    		case '7':
    			return new char[] { 'P', 'Q', 'R', 'S'};
    		case '8':
    			return new char[] { 'T', 'U', 'V'};
    		case '9':
    			return new char[] { 'W', 'X', 'Y', 'Z'};
			default:
				return null;
    	}
    }
    
    /**
       A wrapper for a recursive method that enumerates all the 
       phone keypad encodings for a number.
       @param n a string representing the number
     */
    public static ArrayList<String> enumerateWords(String n)
    {
         // Implement a recursive method that generates
		 // all possible phone keypad encodings for a 
		 // number. Implement additional auxiliary methods
		 // if necessary.
    	int length = n.length();
    	ArrayList<String> result = new ArrayList<String>();
    	
    	if (length == 0) {
    		result.add(n);
    		return result;
    	} 
    	else {
    		for (int i = 0; i < length; i++) {
    			String res = n.substring(0, i) + n.substring(i + 1);
    			
    			ArrayList<String> enumerateWordsRes = enumerateWords(res);
    			
    			for (String s : enumerateWordsRes) {
    				result.add(n.charAt(i) + s);
    			}
    		}
    	}
    	return result;
    }
    
    /**
     * Display the total # of enumerations
     * Number each enumerations
     */
    public static void PrintWords() {
    	Integer count = 0;
    	Integer size = EnumeratedWords.size();
    	System.out.println();
    	System.out.print(size + " Enumerations\n");
    	System.out.println();
    	for (String word : EnumeratedWords) {
    		count++;
    		System.out.println(count + " of " + size + ": " + word);	
    	}
    }
    
}