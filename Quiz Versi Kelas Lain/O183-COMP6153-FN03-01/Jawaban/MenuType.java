import java.util.Scanner;

abstract class MenuType {
	String menuName;
	int menuRating;
	int menuQuantity;
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getMenuRating() {
		return menuRating;
	}
	public void setMenuRating(int menuRating) {
		this.menuRating = menuRating;
	}
	public int getMenuQuantity() {
		return menuQuantity;
	}
	public void setMenuQuantity(int menuQuantity) {
		this.menuQuantity = menuQuantity;
	}
	
   public boolean validString(String str) {
      str = str.toLowerCase();
      char[] charArray = str.toCharArray();
      for (int i = 0; i < charArray.length; i++) {
         char ch = charArray[i];
         if (!(ch >= 'a' && ch <= 'z')) {
            return false;
         }
      }
      return true;
   }
   
	private boolean validateName(String name){
        if (name.length() >= 5 && name.length() <= 20){
            return true;
        }
        return false;
    }
	
	void inputMenuName(Scanner scanner){
		do{
			System.out.print("Input order name [5..20 characters]: ");
			menuName = scanner.nextLine();
		}while(!validString(menuName) || !validateName(menuName));
	}
	
    private boolean validateRating(int rating) {
        return (rating > 4 || rating < 1);
    }
	
	void inputMenuRating(Scanner scanner){
		do{
			System.out.print("Input order rating [1..4]: ");
			menuRating = scanner.nextInt(); scanner.nextLine();
		}while(validateRating(menuRating));
	}
	
	private boolean validateQuantity(int quantity){
		return (quantity > 0);
	}
	
	void inputMenuQuantity(Scanner scanner){
		do{
			System.out.print("Input order quantity: ");
			menuQuantity = scanner.nextInt(); scanner.nextLine();
		}while(!validateQuantity(menuQuantity));
	}
	
	int getBasePrice(){
		return getMenuRating() * 10000;
	}

	abstract int getTotalPrice();
	
	void displayCoffeeOrder(){
		System.out.println("Fnbucks Coffee Shop");
		System.out.println("===================");
		System.out.println();
		System.out.println(" Coffee Order");
		System.out.println("==========================================================================");
		System.out.printf("| %-20s | %-6s | %-4s | %-8s | %-6s | %-11s |\n","Name","Size","Type","Quantity","Rating","Total Price");
		System.out.println("==========================================================================");
	}
	
	void displayCheeseCakeOrder(){
		System.out.println("Fnbucks Coffee Shop");
		System.out.println("===================");
		System.out.println();
		System.out.println(" Cheese Cake Order");
		System.out.println("==========================================================");
		System.out.printf("| %-20s | %-8s | %-6s | %-11s |\n","Name","Quantity","Rating","Total Price");
		System.out.println("==========================================================");
	}
}
