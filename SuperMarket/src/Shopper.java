import java.util.Vector;

public class Shopper {

	private int _id;
	private ShopperType _type;
	Vector<Item> shoppingListVector = new Vector<Item>(10, 5);
	Vector<Item> cartItemsVector = new Vector<Item>(10,5);

	public Shopper(int id, ShopperType type) {
		// TODO Auto-generated constructor stub
		_id = id;
		_type = type;
	}

	public Cart fillCart(SuperMarket hannaford) {
		
	}

	public void addToShoppingList(Item item) {
		shoppingListVector.add(item);
	}

}
