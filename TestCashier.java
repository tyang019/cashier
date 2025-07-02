import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TestCashier {

		public static void main(String[] args) 
		{
			Date d = new Date();
			DateFormat df = DateFormat.getDateInstance();
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			Cashier c = new Cashier();
		
		String name = GetData.getWord("Enter name of item");
		double price = GetData.getDouble("Enter price of item");
		c.add(name, price);
				
		name = GetData.getWord("Enter name of item");
		price = GetData.getDouble("Enter price of item");
		c.add(name, price);

		name = GetData.getWord("Enter name of item");
		price = GetData.getDouble("Enter price of item");
		c.add(name, price);

		c.getAverage();
		
		double amount = GetData.getDouble("Enter amount of money for payment");
		c.tenderedAmount(20.00);
		c.makeChange();
		double change = amount%c.getTotal()*100;
	
			String s = c.getItemList() + "__________________________\n";
			s = s + "\nTotal: " + nf.format(c.getTotal());
			s = s + ("\n\nNumber of items purchased is "+ (int) + (c.getNumberOfQuantities())+ " items.");
			s = s + "\nThe average price per item is " + nf.format(c.getAverage());
			s = s + "\n\nAmount tendered is " + nf.format(amount);
			s = s + "\nThe change is " + nf.format((change/100));
			
			int dollars = Math.round((int)change/100);
			change = change%100; 
			int quarters = Math.round((int)change/25);
			change = change%25; 
			int dimes = Math.round((int)change/10);
			change = change%10;
			int nickles = Math.round((int)change/5);
			change = change%5;
			int cents = (int) change;
			
			s = s + "\n\nThe change includes\n" + dollars + " dollars";
			s = s + "\n" + quarters + " quarters";
			s = s + "\n" + dimes + " dimes";
			s = s + "\n" + nickles + " nickles";
			s = s + "\n" + cents + " cents";
			s = "JOEY'S QUICK-E-MART\n" + "\nWelcome-Thanks for stopping by.\n" + df.format(d)+ "\n" + s;
			
			JTextArea text = new JTextArea (s,20,20);
			JScrollPane pane = new JScrollPane(text);
			JOptionPane.showMessageDialog(null, pane, "Reciept",JOptionPane.INFORMATION_MESSAGE);
		}
	}

