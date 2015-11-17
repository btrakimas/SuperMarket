
import java.util.Enumeration;
import java.util.Vector;

public class SuperMarket {
	
	Vector<Item> stockVector = new Vector<Item>(10, 5);
	
	SuperMarket()
	{
		
	}

	public void addToStock(Item item) {
		stockVector.addElement(item);
	}

	public Vector<Item> SearchForStockItem(String description)
	{
		Enumeration<Item> values = stockVector.elements();
		Vector<Item> instockItems = new Vector<Item>(10,5);
		while(values.hasMoreElements()) 
		{
			Item stockItem = values.nextElement();
			if (stockItem.get_description().contains(description))
				instockItems.add(stockItem);
		}
		return instockItems;
	}
	
	public Cashier getCashier() 
	{
		return null;
	}
	
	
}
