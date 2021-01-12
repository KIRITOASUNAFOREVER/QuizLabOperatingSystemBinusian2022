import java.util.HashMap;
import java.util.Scanner;

public class Coffee extends MenuType{
	HashMap<String,Integer> menuSize = new HashMap<String, Integer>();
	
	String[] menuSizes = {"Small","Medium","Large"};
	String[] menuTypes = {"Cold","Hot"};
	
	public Coffee() {
		super();
		initmenuSize();
	}
	
	private void initmenuSize() {
		menuSize.put("Small", 1);
		menuSize.put("Medium", 2);
		menuSize.put("Large", 3);
	}
	
	String MenuSize;
	String MenuType;
	
	public String getMenuSize() {
		return MenuSize;
	}

	public void setMenuSize(String menuSize) {
		MenuSize = menuSize;
	}

	public String getMenuType() {
		return MenuType;
	}

	public void setMenuType(String menuType) {
		MenuType = menuType;
	}

	private boolean validateSize(String size){
        if (menuSize.containsKey(size)){
            return true;
        }
        return false;
    }
	
    void inputMenuSize(Scanner scanner){
        do{
            System.out.print("Input order size [");
            for (int i = 0; i < menuSizes.length; i++) {
                System.out.print(menuSizes[i]);
                if(i == menuSizes.length-1){
                    System.out.print("]");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print(": ");
            MenuSize = scanner.nextLine();
        }
        while (!validateSize(MenuSize));
    }
    
    private boolean validateType(String type){
    	if(type.equals("Cold") || type.equals("Hot")){
    		return true;
    	}
    	return false;
    }
    
    void inputMenuType(Scanner scanner){
        do{
            System.out.print("Input order type [");
            for (int i = 0; i < menuTypes.length; i++) {
                System.out.print(menuTypes[i]);
                if(i == menuTypes.length-1){
                    System.out.print("]");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print(": ");
            MenuType = scanner.nextLine();
        }
        while (!validateType(MenuType));
    }
    
    int getSizePrice(){
    	return menuSize.get(MenuSize) * 5000;
    }
    
	@Override
	int getTotalPrice() {
		return (getBasePrice() + getSizePrice()) * getMenuQuantity();
	}
	
	void displayCoffeeOrder(){
		super.displayCoffeeOrder();
		System.out.printf("| %-20s | %-6s | %-4s | %-8d | %-6d | %-11d |\n",getMenuName(),getMenuSize(),getMenuType(),getMenuQuantity(),getMenuRating(),getTotalPrice());
		System.out.println("==========================================================================");
	}

}
