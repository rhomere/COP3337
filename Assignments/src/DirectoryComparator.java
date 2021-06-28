/**   
  Renel Homere
  COP3337 RVCC 1215
  2075540
*/

import java.util.Comparator;

public class DirectoryComparator  implements Comparator<String> {
	
	@Override
	public int compare(String a, String b) {
		
		String numPart1 = "";
		String numPart2 = "";
		for (int i = 0; i < a.length(); i++) {
			Character c = a.charAt(i);
			if (Character.isDigit(c)) {
				numPart1 = numPart1 + String.valueOf(c);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			Character c = b.charAt(i);
			if (Character.isDigit(c)) {
				numPart2 = numPart2 + String.valueOf(c);
			}
		}
		
		Boolean numRes = Integer.parseInt(numPart1) == Integer.parseInt(numPart2);
		
		
		String stringPart1 = "";
		String stringPart2 = "";
		for (int i = 0; i < a.length(); i++) {
			Character c = a.charAt(i);
			if (!Character.isDigit(c)) {
				stringPart1 = stringPart1 + String.valueOf(c);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			Character c = b.charAt(i);
			if (!Character.isDigit(c)) {
				stringPart2 = stringPart2 + String.valueOf(c);
			}
		}
		
		int stringRes = stringPart1.compareTo(stringPart2);
		
		if (stringRes == 0) {
			if (Integer.parseInt(numPart1) > Integer.parseInt(numPart2))
				return 1;
			else if (Integer.parseInt(numPart1) == Integer.parseInt(numPart2))
				return 0;
			else 
				return -1;
		}
		else {
			return a.compareToIgnoreCase(b);
		}
	}
}
