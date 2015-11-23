
import java.util.Vector;

public class Cart {
    Vector<Item> cartItemsVector = new Vector<Item>(10,5);

	Cart()
	{
		
	}
	
	public void addToCart(Item item)
	{
		cartItemsVector.add(item);
	}

}
