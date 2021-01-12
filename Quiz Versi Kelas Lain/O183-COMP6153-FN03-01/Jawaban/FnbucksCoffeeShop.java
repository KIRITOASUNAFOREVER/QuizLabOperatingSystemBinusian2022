import java.util.Scanner;

public class FnbucksCoffeeShop {
	Scanner scan = new Scanner(System.in);

	
	public FnbucksCoffeeShop() {
		String pilihan;
		
		System.out.println("Fnbucks Coffee Shop");
		System.out.println("===================");
		System.out.println();
		do {
			System.out.print("Choose menu you want to order [Coffee | Cheese Cake]: ");
			pilihan = scan.nextLine();
		} while (!pilihan.equals("Coffee") && !pilihan.equals("Cheese Cake"));
		
		if(pilihan.equals("Coffee")){
			Coffee coffee = new Coffee();
			
			System.out.println(); System.out.println();
			System.out.println("Fnbucks Coffee Shop");
			System.out.println("===================");
			System.out.println();
			
			System.out.println("Order Coffee:");
			coffee.inputMenuName(scan);
			coffee.inputMenuSize(scan);
			coffee.inputMenuType(scan);
			coffee.inputMenuRating(scan);
			coffee.inputMenuQuantity(scan);
			
			System.out.println();
			System.out.println("Order Coffee Success!");
			System.out.println(); System.out.println();
			
			coffee.displayCoffeeOrder();
		}else{
			CheeseCake cheeseCake = new CheeseCake();
			
			System.out.println(); System.out.println();
			System.out.println("Fnbucks Coffee Shop");
			System.out.println("===================");
			System.out.println();
			
			System.out.println("Order Cake:");
			cheeseCake.inputMenuName(scan);
			cheeseCake.inputMenuRating(scan);
			cheeseCake.inputMenuQuantity(scan);
			
			System.out.println();
			System.out.println("Order Cake Success!");
			System.out.println(); System.out.println();
			
			cheeseCake.displayCheeseCakeOrder();
		}
	}

	public static void main(String[] args) {
		new FnbucksCoffeeShop();
	}

}
