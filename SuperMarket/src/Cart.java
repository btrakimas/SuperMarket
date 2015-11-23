
import java.util.Vector;

public class Cart {
    private Vector<Item> cartItemsVector = new Vector<Item>(10,5);

    Cart()
	{
		
	}
	
	public void addToCart(Item item)
	{
		cartItemsVector.add(item);
	}
	
	public Vector<Item> getCartItemsVector() {
		return cartItemsVector;
	}

	public void setCartItemsVector(Vector<Item> cartItemsVector) {
		this.cartItemsVector = cartItemsVector;
	}

}
