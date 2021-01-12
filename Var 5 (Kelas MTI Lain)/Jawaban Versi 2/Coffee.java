
public class Coffee {
	private String size;
	private String ice;
	private String sugar;
	private int price;
	private int quantity;
	public Coffee() {
		// TODO Auto-generated constructor stub
	}
	public String getSize() {
		return size;
	}
	public boolean setSize(String size) {
		if(!(size.equals("Small")||size.equals("Medium")||size.equals("Large"))) 
			return false;
		this.size = size;
		return true;
	}
	public String getIce() {
		return ice;
	}
	public boolean setIce(String ice) {
		if(!(ice.equals("No Ice")||ice.equals("Regular")||ice.equals("Extra")))
			return false;
		this.ice = ice;
		return true;
	}
	public String getSugar() {
		return sugar;
	}
	public boolean setSugar(String sugar) {
		if(!(sugar.equals("No Sugar")||sugar.equals("Regular")||sugar.equals("Extra")))
			return false;
		this.sugar = sugar;
		return true;
	}
	public int getPrice() {
		return price;
	}
	public boolean setPrice(int price) {
		if(price<10000 || price>20000)
			return false;
		this.price = price;
		return true;
	}
	public int getQuantity() {
		return quantity;
	}
	public boolean setQuantity(int quantity) {
		if(quantity<1 || quantity>10)
			return false;
		this.quantity = quantity;
		return true;
	}
	
	public int getSizePrice() {
		if(this.size.equals("Medium"))
			return 4000;
		else if(this.size.equals("Large"))
			return 8000;
		return 0;
	}

	public int getIcePrice() {
		if(this.ice.equals("Regular"))
			return 4000;
		else if(this.ice.equals("Extra"))
			return 6000;
		return 0;
	}

	public int getSugarPrice() {
		if(this.sugar.equals("Regular"))
			return 2000;
		else if(this.sugar.equals("Extra"))
			return 4000;
		return 0;
	}
	
	public int calculatePrice() {
		return this.price+this.getSizePrice()+this.getIcePrice()+this.getSugarPrice();
	}
	
	public int calculateTotalPrice() {
		return this.calculatePrice()*this.quantity;
	}

}
