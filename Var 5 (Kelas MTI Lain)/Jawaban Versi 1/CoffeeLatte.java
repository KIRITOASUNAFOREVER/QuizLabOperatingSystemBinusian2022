import java.util.HashMap;
import java.util.Scanner;

class CoffeeLatte extends CoffeeType{
    HashMap<String, Integer> milkPrices = new HashMap<String, Integer>();
    String[] coffeeMilks = {"Regular", "Extra"};

    String coffeeMilk;

    public CoffeeLatte() {
        super();
        this.coffeeType = "Coffee Latte";
        initMilkPrices();
    }

    private void initMilkPrices() {
        milkPrices.put("Regular", 5000);
        milkPrices.put("Extra", 7000);
    }

    private boolean validateMilk(String milk){
        if (milkPrices.containsKey(milk)){
            return true;
        }
        return false;
    }

    void inputCoffeeMilk(Scanner scanner){
        do{
            System.out.print("Coffee Milk [");
            for (int i = 0; i < coffeeMilks.length; i++) {
                System.out.print(coffeeMilks[i]);
                if(i == coffeeMilks.length-1){
                    System.out.print("]");
                }else{
                    System.out.print("|");
                }
            }
            System.out.print("[Case Sensitive] : ");
            coffeeMilk = scanner.nextLine();
        }
        while (!validateMilk(coffeeMilk));
    }

    @Override
    int getCoffeePrice() {
        int milkPrice = milkPrices.get(coffeeMilk);
        return super.getCoffeePrice() + milkPrice;
    }

    @Override
    int getTotalPrice() {
        return coffeeQuantity * getCoffeePrice();
    }

    @Override

    void displayOrder(){
        super.displayOrder();
        System.out.println("Milk : " + coffeeMilk);
        System.out.println("=============================");
        System.out.println("Qty : " + coffeeQuantity);
        System.out.println("Coffee Price : " + getCoffeePrice());
        System.out.println("Total Price : " + getTotalPrice());
    }

    public String getCoffeeMilk() {
        return coffeeMilk;
    }
}