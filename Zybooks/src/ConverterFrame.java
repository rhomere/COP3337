/**   
  Renel Homere
  COP3337 RVCC 1215
  2075540
*/

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class ConverterFrame extends JFrame implements ActionListener  {
	   private JLabel currencyLabel1;              
	   private JLabel currencyLabel2;            
	   @SuppressWarnings("rawtypes")
	private JComboBox currencyBox1;
	   @SuppressWarnings("rawtypes")
	private JComboBox currencyBox2;
	   private JLabel amountLabel;            
	   private JFormattedTextField amountField;
	   private String[] currencies = {"U.S. Dollars (USD)", "Euros (EUR)", "British pounds (GBP)"};
	   
	   private JButton convertButton;  

	   ConverterFrame() {
		      // Used to specify GUI component layout
		      GridBagConstraints layoutConst = null;
		      
		      // Set frame's title
		      setTitle("Currency Converter");
		      
		      // Create labels
		      currencyLabel1 = new JLabel("Currency 1:");
		      currencyLabel2 = new JLabel("Currency 2:");
		      amountLabel = new JLabel("Amount:");
		      
		      currencyBox1 = new JComboBox(currencies);
		      currencyBox2 = new JComboBox(currencies);
		      
		      convertButton = new JButton("Convert");
		      convertButton.addActionListener(this);
		      
		      amountField =  new JFormattedTextField(NumberFormat.getNumberInstance());
		      amountField.setEditable(true);
		      amountField.setText("0");
		      amountField.setColumns(15); // Initial width of 10 units 
		      
		      setLayout(new GridBagLayout());
		      
		      layoutConst = new GridBagConstraints();
		      layoutConst.insets = new Insets(10, 10, 10, 1);
		      layoutConst.gridx = 0;
		      layoutConst.gridy = 0;
		      add(amountLabel, layoutConst);

		      layoutConst = new GridBagConstraints();
		      layoutConst.insets = new Insets(10, 1, 10, 10);
		      layoutConst.gridx = 1;
		      layoutConst.gridy = 0;
		      add(amountField, layoutConst);	
		      
		      layoutConst = new GridBagConstraints();
		      layoutConst.insets = new Insets(10, 5, 10, 10);
		      layoutConst.gridx = 2;
		      layoutConst.gridy = 0;
		      add(convertButton, layoutConst);
		      
		      layoutConst = new GridBagConstraints();
		      layoutConst.insets = new Insets(10, 0, 1, 10);
		      layoutConst.gridx = 1;
		      layoutConst.gridy = 1;
		      add(currencyLabel1, layoutConst);
		      
		      layoutConst = new GridBagConstraints();
		      layoutConst.insets = new Insets(1, 0, 10, 10);
		      layoutConst.gridx = 1;
		      layoutConst.gridy = 2;
		      add(currencyBox1, layoutConst);
		      
		      layoutConst = new GridBagConstraints();
		      layoutConst.insets = new Insets(10, 0, 1, 10);
		      layoutConst.gridx = 2;
		      layoutConst.gridy = 1;
		      add(currencyLabel2, layoutConst);
		      
		      layoutConst = new GridBagConstraints();
		      layoutConst.insets = new Insets(1, 0, 10, 10);
		      layoutConst.gridx = 2;
		      layoutConst.gridy = 2;
		      add(currencyBox2, layoutConst);
		}

	   @Override
	   public void actionPerformed(ActionEvent event) {
	      double amount;     // Distance to travel

	      // Get value from distance field
	      amount = ((Number) amountField.getValue()).doubleValue();
	      
	      String currency1 = currencyBox1.getSelectedItem().toString();
	      String currency2 = currencyBox2.getSelectedItem().toString();

	      // Check if miles input is positive
	      if (amount >= 0.0) {
	         if (currency1 == "Euros (EUR)" && currency2 == "U.S. Dollars (USD)") {
	        	 amount = amount * 1.42;
	        	 amountField.setText(String.valueOf(amount));
	         }
	         else if (currency1 == "Euros (EUR)" && currency2 == "British pounds (GBP)") {
	        	 amount = amount / 1.13;
	        	 amountField.setText(String.valueOf(amount));
	         }
	         else if (currency1 == "U.S. Dollars (USD)" && currency2 == "Euros (EUR)") {
	        	 amount = amount / 1.42;
	        	 amountField.setText(String.valueOf(amount));
	         }
	         else if (currency1 == "U.S. Dollars (USD)" && currency2 == "British pounds (GBP)") {
	        	 amount = amount / 1.64;
	        	 amountField.setText(String.valueOf(amount));
	         }
	         else if (currency1 == "British pounds (GBP)" && currency2 == "Euros (EUR)") {
	        	 amount = amount * 1.13;
	        	 amountField.setText(String.valueOf(amount));
	         }
	         else {
	        	 // GBP TO USD
	        	 amount = amount * 1.64;
	        	 amountField.setText(String.valueOf(amount));
	         }
	      }
	      else {
	         // Show failure dialog
	         JOptionPane.showMessageDialog(this, "Enter a positive amount!");
	      }
	   }
}
