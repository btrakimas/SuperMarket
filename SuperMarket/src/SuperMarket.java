import java.util.Enumeration;
import java.util.Vector;

public class SuperMarket {
	
	private Vector<Item> stockVector;
	private Cashier cashier;
	
	SuperMarket()
	{
		stockVector = new Vector<Item>(10, 5);
		cashier = new Cashier();
	}

	public void addToStock(Item item) {
		// validation should check that price and barcode are not 0!
		stockVector.addElement(item);
	}
	
	public void subFromStock(Item item, int count)
	{
		// find item with matching barcode and subtract 1 from quantity
		
	}

	public Vector<Item> SearchForStockItem(Item item)
	{
		Enumeration<Item> values = stockVector.elements();
		Vector<Item> foundItems = new Vector<Item>(10,5);
		while(values.hasMoreElements()) 
		{
			Item stockItem = values.nextElement();
			if (stockItem.get_description().contains(item.get_description()))
			{
				foundItems.add(stockItem);
			}
		}
		return foundItems;
	}
	
	public Cashier getCashier() 
	{
		return cashier;
	}
	
	
}
