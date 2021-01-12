
public class CoffeeLatte extends Coffee {

	private String milk;
	
	public CoffeeLatte() {
		// TODO Auto-generated constructor stub
	}

	public String getMilk() {
		return milk;
	}

	public boolean setMilk(String milk) {
		if(!(milk.equals("Regular")||milk.equals("Extra")))
			return false;
		this.milk = milk;
		return true;
	}

	public int getMilkPrice() {
		if(this.milk.equals("Regular"))
			return 5000;
		return 7000;
	}
	
	public int calculatePrice() {
		return this.getPrice()+this.getSizePrice()+this.getIcePrice()+this.getSugarPrice()+this.getMilkPrice();
	}
	
	public int calculateTotalPrice() {
		return this.calculatePrice()*this.getQuantity();
	}

}
