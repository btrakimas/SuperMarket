import java.util.Vector;
import java.util.Enumeration;

public class Shopper {

	private int Id;
	private ShopperType sType;
	private Vector<Item> shoppingListVector = new Vector<Item>(10, 5);

	public Shopper(int id, ShopperType shopperType) {
		setId(id);
		sType = shopperType;
	}

	public Cart fillCart(SuperMarket market) throws Exception {
		Cart cart = new Cart();
		Enumeration<Item> list = shoppingListVector.elements();
		while(list.hasMoreElements())
		{
			Item listItem = list.nextElement();
			Vector<Item> instockItems = market.SearchForStockItem(listItem);
			// get next item in shopping list if this one is not found
			if (!instockItems.isEmpty()) 
			{
				Item selectedItem = getPreferredItem(instockItems, listItem);
				cart.addToCart(selectedItem);
			}
		}
		return cart;
	}

	private Item getPreferredItem(Vector<Item> instockItems, Item listItem) 
	throws Exception {
		Item preferredItem = instockItems.firstElement();
		Enumeration<Item> iterator = instockItems.elements();
		while (iterator.hasMoreElements())
		{
			double lowestPrice = 0.0;
			Item currentItem = iterator.nextElement(); 
			String description = currentItem.get_description().toLowerCase(); 
			switch (sType) { 
				case Price: 
	 				if (currentItem.get_price() < lowestPrice) { 
						lowestPrice = currentItem.get_price(); 
	 					preferredItem = currentItem; 
					} 
	 				break; 
				case Quality: 
	 				if (description.contains("organic") 
	 						|| description.contains("grass fed")) { 
	 					preferredItem = currentItem; 
						break; 
					} 
	 				break; 
			}
		}
		Item p = preferredItem;
		return new Item(listItem.get_quantity(), p.get_description(), p.get_price(), p.get_barcode()); 
	}

	public void addToShoppingList(Item item) {
		shoppingListVector.add(item);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

}
