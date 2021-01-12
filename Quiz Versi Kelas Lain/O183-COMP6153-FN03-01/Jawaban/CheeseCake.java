
public class CheeseCake extends MenuType{

	public CheeseCake() {
		super();
	}
	
	int getQuantity(){
		return getMenuQuantity();
	}
	
	@Override
	int getTotalPrice() {
		return getBasePrice() * getQuantity();
	}
	
	void displayCheeseCakeOrder(){
		super.displayCheeseCakeOrder();
		System.out.printf("| %-20s | %-8d | %-6d | %-11d |\n",getMenuName(),getMenuQuantity(),getMenuRating(),getTotalPrice());
		System.out.println("==========================================================");
	}
}
