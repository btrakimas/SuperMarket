public class App {

	public static void main(String[] args) throws Exception 
	{
		SuperMarket hannaford = new SuperMarket();
		hannaford.addToStock(new Item(100, "organic carrot",  0.99, 121243));
		hannaford.addToStock(new Item(50,  "organic bread",   3.99, 314543));
		hannaford.addToStock(new Item(50,  "bread",           0.99, 316643));
		hannaford.addToStock(new Item(20,  "fish",            7.39, 985443));
		hannaford.addToStock(new Item(30,  "grass fed steak", 9.99, 265943));
		hannaford.addToStock(new Item(50,  "steak",           6.79, 915643));
		hannaford.addToStock(new Item(40,  "organic salad",   1.99, 345743));
		hannaford.addToStock(new Item(400, "pasta",           1.09, 176343));
		hannaford.addToStock(new Item(70,  "apple",           1.09, 176343));
		hannaford.addToStock(new Item(100, "carrot",          0.59, 176343));
		
		Shopper shopper1 = new Shopper(2000, ShopperType.Quality);
		Shopper shopper2 = new Shopper(800, ShopperType.Price);
		
		shopper1.addToShoppingList(new Item(1, "bread"));
		shopper1.addToShoppingList(new Item(2, "carrot"));
		shopper1.addToShoppingList(new Item(1, "salad"));
		shopper1.addToShoppingList(new Item(3, "pasta"));
		shopper1.addToShoppingList(new Item(1, "steak"));
		
		shopper2.addToShoppingList(new Item(1, "fish"));
		shopper2.addToShoppingList(new Item(3, "apple"));
		shopper2.addToShoppingList(new Item(1, "banana"));
		shopper2.addToShoppingList(new Item(1, "steak"));
		
		Cart cart1 = shopper1.fillCart(hannaford);
		Cart cart2 = shopper2.fillCart(hannaford);
		
		Cashier cashier = hannaford.getCashier();
		String receipt1 = cashier.checkOut(cart1);
		String receipt2 = cashier.checkOut(cart2);
		
		System.out.print(receipt1);
		System.out.print(receipt2);
	}

}

