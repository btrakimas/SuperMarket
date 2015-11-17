
public class Item {
	private int _quantity;
	private String _description;
	private double _price;
	private int _barcode;
	
	
	public Item(int quantity, String description, double price, int barcode)
	{
		set_quantity(quantity);
		set_description(description);
		set_price(price);
		_barcode = barcode;
	}
	
	public  Item(int quantity, String description)
	{
		this(quantity, description, 0.0, 0);
		
	}
	public int get_quantity() {
		return _quantity;
	}
	public void set_quantity(int _quantity) {
		this._quantity = _quantity;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		this._description = _description;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double _price) {
		this._price = _price;
	}
	public int get_barcode() {
		return _barcode;
	}
	public void set_barcode(int _barcode) {
		this._barcode = _barcode;
	}
}
