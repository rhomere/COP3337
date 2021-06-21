import java.util.Scanner;

import javax.swing.JFileChooser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**   
  Renel Homere
  COP3337 RVCC 1215
  2075540
  Assignment 5
*/

public class BalanceTransactions {

	public static void main(String[] args) throws FileNotFoundException {
		
		Double totalReceived = 0.00;
		Double totalPaid = 0.00;
		String filePath = "C:\\Users\\User\\OneDrive\\Desktop\\Assignment 5 files\\";
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter amount of cash at the beginning of the day: ");
		double startAmount = Double.parseDouble(scnr.next());
		System.out.print("Enter amount of cash at the end of the day: ");
		double endAmount = Double.parseDouble(scnr.next());
		
		try {
			System.out.print("Enter the name of the ledger text file: ");
			String fileName = scnr.next();
			
			filePath += fileName;
			FileInputStream fileByteStream = new FileInputStream(filePath);
			
		}
		catch (FileNotFoundException exception) {
			System.out.println("File not found, try selecting the file");
			JFileChooser chooser = new JFileChooser();
			int returnVal = chooser.showOpenDialog(chooser);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				filePath = chooser.getSelectedFile().getAbsolutePath();	
			}
		}
		finally {
			FileInputStream fileByteStream = new FileInputStream(filePath);
			Scanner infs = new Scanner(fileByteStream);
			
			while (infs.hasNextLine()) {
				String line = infs.nextLine();
				Scanner sn = new Scanner(line);
				Integer invoiceNum = sn.nextInt();
				Double amount = sn.nextDouble();
				Character type = sn.next().charAt(0);
				if (type == 'R') {
					totalReceived += amount;
				}
				else if (type == 'P') {
					totalPaid += amount;
				}
				amount = 0.00;
			}
			
			double currentAmount = startAmount; 
			currentAmount -= totalPaid;
			currentAmount += totalReceived;	
			
			System.out.printf("Actual amount of cash at the end of the day: %f\n", currentAmount);
		}
		
	}

}
