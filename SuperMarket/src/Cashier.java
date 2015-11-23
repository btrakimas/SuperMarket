import java.util.Enumeration;
import java.util.Vector;

public class Cashier {

	public String checkOut(Cart cart) {
		double totalPrice = 0.0;
		double price = 0.0;
		String receipt = "";
		Vector<Item> cartItems = cart.getCartItemsVector();
		Enumeration<Item> list = cartItems.elements();
		while (list.hasMoreElements())
		{
			Item listItem = list.nextElement();
			price = listItem.get_quantity() * listItem.get_price();
			receipt += String.format("%20s(%2s).....%6s.....$%5s\n", 
					listItem.get_description(),listItem.get_quantity(),listItem.get_price(),price);
			totalPrice += price;
		}
		receipt += String.format("Total: $%10s\n", totalPrice);
		// TODO Auto-generated method stub
		return receipt;
	}
}
