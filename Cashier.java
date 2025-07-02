public class Cashier {
		
		//Step 1: Instance Variables
		float total, avg, price, change, tenderedAmount;
		String item;
		private static int noOfItems;
		int noOfQuantities;
		int total_coins;
		
		//Step 2: Constructor
		public Cashier ()
		{
			item = "";
		}
		//Step 3: Method
		public void add(String name, double price) 
		{
			item = item + name + " -\t$" + price + "\n"; 
			total += price;
			noOfItems += 1;
			avg = total / noOfItems;
		}
		static int getNumberOfItems()
		{
			return noOfItems;
		}
		String getItemList()
		{
			return item;
		}
		float getAverage()
		{
			return avg;
		}
		float getTotal()
		{
			return total;
		}
		void makeChange() 
		{
			change = tenderedAmount - total;
		}
		int getNumberOfQuantities()
		{
			noOfQuantities = noOfItems;
			return (int) noOfQuantities;
		}
		void tenderedAmount(double d) 
		{
			
		}
		
}
