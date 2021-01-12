import java.util.Scanner;


public class FeStCoffeeSimulator {
    static String coffeeType;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
        	System.out.println("+ Welcome to FeSt Coffee Simulator +");
            System.out.println("=====================================");
            System.out.println("1. Input Coffee Information");
            System.out.println("2. Exit");
            System.out.print(">> ");
            choice = scanner.nextInt();scanner.nextLine();
            switch(choice){
            case 1:
            	do{
            		System.out.print("Coffee Type [Coffee Latte|Coffee]");
                    System.out.print("[Case Sensitive] : ");
                    coffeeType = scanner.nextLine();
            	}while(coffeeType.equals("Coffee") && coffeeType.equals("Coffee Latte"));
                    
                    if(coffeeType.equals("Coffee")){
                        Coffee coffee = new Coffee();
                        coffee.inputCoffeeSize(scanner);
                        coffee.inputCoffeeIce(scanner);
                        coffee.inputCoffeeSugar(scanner);
                        coffee.inputCoffeeBasePrice(scanner);
                        coffee.inputCoffeeQuantity(scanner);
                        System.out.println();
                        coffee.displayOrder();
                        System.out.println();
                    }else{
                        CoffeeLatte coffeeLatte = new CoffeeLatte();
                        coffeeLatte.inputCoffeeSize(scanner);
                        coffeeLatte.inputCoffeeIce(scanner);
                        coffeeLatte.inputCoffeeSugar(scanner);
                        coffeeLatte.inputCoffeeBasePrice(scanner);
                        coffeeLatte.inputCoffeeQuantity(scanner);
                        coffeeLatte.inputCoffeeMilk(scanner);
                        System.out.println();
                        coffeeLatte.displayOrder();
                        System.out.println();
                    }

                }
            }while (choice > 2 || choice < 1 || choice !=2);
    	}
}