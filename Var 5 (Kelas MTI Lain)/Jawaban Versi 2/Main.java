import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int action=0;
		while(action!=2) {

			System.out.println("+ Welcome to FeSt Coffee Simulator +");
			System.out.println("====================================");
			System.out.println("1. Input Coffee Information");
			System.out.println("2. Exit");
			System.out.print(">>");
			while(action!=2&&action!=1) {
				action=scan.nextInt();
				scan.nextLine();
			}
			if(action==1) {
				String type="";
				while(!(type.equals("Coffee Latte")||type.equals("Coffee"))) {
					System.out.print("Coffee Type [Coffee Latte|Coffee][Case Sensitive] : ");
					type=scan.nextLine();
				}
				if(type.equals("Coffee Latte")) {
					CoffeeLatte coffee = new CoffeeLatte();
					String size="";
					do {
						System.out.print("Coffee Size [Small|Medium|Large][Case Sensitive] : ");
						size=scan.nextLine();
					}while(!coffee.setSize(size));
					String ice="";
					do {
						System.out.print("Coffee Ice [No Ice|Regular|Extra][Case Sensitive] : ");
						ice=scan.nextLine();
					}while(!coffee.setIce(ice));
					String sugar="";
					do {
						System.out.print("Coffee Sugar [No Sugar|Regular|Extra][Case Sensitive] : ");
						sugar=scan.nextLine();
					}while(!coffee.setSugar(sugar));
					String milk="";
					do {
						System.out.print("Coffee Milk [Regular|Extra][Case Sensitive] : ");
						milk=scan.nextLine();
					}while(!coffee.setMilk(milk));
					int price=0;
					do {
						System.out.print("Coffee Price [10000-20000]: ");
						price=scan.nextInt();
						scan.nextLine();
					}while(!coffee.setPrice(price));
					int quantity=0;
					do {
						System.out.print("Input Quantity [1-10]: ");
						quantity=scan.nextInt();
						scan.nextLine();
					}while(!coffee.setQuantity(quantity));
					System.out.println("++Your Order++");
					System.out.println("====================================");
					System.out.println("Coffee Type : Coffee Latte");
					System.out.println("Ice : "+coffee.getIce());
					System.out.println("Sugar : "+coffee.getSugar());
					System.out.println("Size : "+coffee.getSize());
					System.out.println("Milk : "+coffee.getMilk());
					System.out.println("====================================");
					System.out.println("Qty : "+coffee.getQuantity());
					System.out.println("Coffee Price : "+coffee.calculatePrice());
					System.out.println("Total Price : "+coffee.calculateTotalPrice());
				}
				else {

					Coffee coffee=new Coffee();
					String size="";
					do {
						System.out.print("Coffee Size [Small|Medium|Large][Case Sensitive] : ");
						size=scan.nextLine();
					}while(!coffee.setSize(size));
					String ice="";
					do {
						System.out.print("Coffee Ice [No Ice|Regular|Extra][Case Sensitive] : ");
						ice=scan.nextLine();
					}while(!coffee.setIce(ice));
					String sugar="";
					do {
						System.out.print("Coffee Sugar [No Sugar|Regular|Extra][Case Sensitive] : ");
						sugar=scan.nextLine();
					}while(!coffee.setSugar(sugar));
					int price=0;
					do {
						System.out.print("Coffee Price [10000-20000]: ");
						price=scan.nextInt();
						scan.nextLine();
					}while(!coffee.setPrice(price));
					int quantity=0;
					do {
						System.out.print("Input Quantity [1-10]: ");
						quantity=scan.nextInt();
						scan.nextLine();
					}while(!coffee.setQuantity(quantity));
					System.out.println("++Your Order++");
					System.out.println("====================================");
					System.out.println("Coffee Type : Coffee Latte");
					System.out.println("Ice : "+coffee.getIce());
					System.out.println("Sugar : "+coffee.getSugar());
					System.out.println("Size : "+coffee.getSize());
					System.out.println("====================================");
					System.out.println("Qty : "+coffee.getQuantity());
					System.out.println("Coffee Price : "+coffee.calculatePrice());
					System.out.println("Total Price : "+coffee.calculateTotalPrice());
				}
				scan.nextLine();
				action=0;
			}
		}
	}

}
