import java.util.HashMap;
import java.util.Scanner;

abstract class CoffeeType{
    HashMap<String,Integer> sizePrices = new HashMap<String, Integer>();
    HashMap<String, Integer> icePrices = new HashMap<String, Integer>();
    HashMap<String, Integer> sugarPrices = new HashMap<String, Integer>();

    String[] coffeeSizes = {"Small", "Medium", "Large"};
    String[] coffeeIces = {"No Ice", "Regular", "Extra"};
    String[] coffeeSugars = {"No Sugar", "Regular", "Extra"};


    String coffeeType;
    String coffeeSize;
    String coffeeIce;
    String coffeeSugar;
    int coffeeBasePrice;
    int coffeeQuantity;

    public CoffeeType() {
        initSizePrices();
        initIcePrices();
        initSugarPrices();
    }

    private void initSizePrices() {
        sizePrices.put("Small", 0);
        sizePrices.put("Medium", 4000);
        sizePrices.put("Large", 8000);
    }

    private void initSugarPrices() {
        sugarPrices.put("No Sugar", 0);
        sugarPrices.put("Regular", 2000);
        sugarPrices.put("Extra", 4000);
    }

    private void initIcePrices() {
        icePrices.put("No Ice", 0);
        icePrices.put("Regular", 4000);
        icePrices.put("Extra", 6000);
    }

    private boolean validateSize(String size){
        if (sizePrices.containsKey(size)){
            return true;
        }
        return false;
    }

    private boolean validateIce(String ice){
        if (icePrices.containsKey(ice)){
            return true;
        }
        return false;
    }

    private boolean validateSugar(String sugar){
        if (sugarPrices.containsKey(sugar)){
            return true;
        }
        return false;
    }

    private boolean validateBasePrice(int coffeeBasePrice) {
        return (coffeeBasePrice >= 10000 && coffeeBasePrice <= 20000);
    }

    private boolean validateQuantity(int quantity) {
        return (quantity >= 1 && quantity <= 10);
    }

    void inputCoffeeSize(Scanner scanner){
        do{
            System.out.print("Coffee Size [");
            for (int i = 0; i < coffeeSizes.length; i++) {
                System.out.print(coffeeSizes[i]);
                if(i == coffeeSizes.length-1){
                    System.out.print("]");
                }else{
                    System.out.print("|");
                }
            }
            System.out.print("[Case Sensitive] : ");
            coffeeSize = scanner.nextLine();
        }
        while (!validateSize(coffeeSize));

    }

    void inputCoffeeIce(Scanner scanner){
        do{
            System.out.print("Coffee Ice [");
            for (int i = 0; i < coffeeIces.length; i++) {
                System.out.print(coffeeIces[i]);
                if(i == coffeeIces.length-1){
                    System.out.print("]");
                }else{
                    System.out.print("|");
                }
            }
            System.out.print("[Case Sensitive] : ");
            coffeeIce = scanner.nextLine();
        }
        while (!validateIce(coffeeIce));

    }

    void inputCoffeeSugar(Scanner scanner){
        do{
            System.out.print("Coffee Sugar [");
            for (int i = 0; i < coffeeSugars.length; i++) {
                System.out.print(coffeeSugars[i]);
                if(i == coffeeSugars.length-1){
                    System.out.print("]");
                }else{
                    System.out.print("|");
                }
            }
            System.out.print("[Case Sensitive] : ");
            coffeeSugar = scanner.nextLine();
        }
        while (!validateSugar(coffeeSugar));
    }

    void inputCoffeeBasePrice(Scanner scanner){
        do{
            System.out.print("Coffee Price [10000-20000] : ");
            coffeeBasePrice = scanner.nextInt();scanner.nextLine();
        }
        while (!validateBasePrice(coffeeBasePrice));
    }

    void inputCoffeeQuantity(Scanner scanner){
        do{
            System.out.print("Input Quantity [1-10]: ");
            coffeeQuantity = scanner.nextInt();scanner.nextLine();
        }
        while (!validateQuantity(coffeeQuantity));
    }



    public String getCoffeeSize() {
        return coffeeSize;
    }

    public String getCoffeeIce() {
        return coffeeIce;
    }

    public String getCoffeeSugar() {
        return coffeeSugar;
    }

    public int getCoffeeBasePrice() {
        return coffeeBasePrice;
    }

    public int getCoffeeQuantity() {
        return coffeeQuantity;
    }

    int getCoffeePrice(){
        int sizePrice = sizePrices.get(coffeeSize);
        int icePrice = icePrices.get(coffeeIce);
        int sugarPrice = sugarPrices.get(coffeeSugar);

        return (coffeeBasePrice + sizePrice + icePrice + sugarPrice);
    }

    abstract int getTotalPrice();

    void displayOrder(){
        System.out.println("++ Your Order ++");
        System.out.println("===========================");
        System.out.println();
        System.out.println("Coffee Type : " + coffeeType);
        System.out.println("Ice : " + coffeeIce);
        System.out.println("Sugar : " + coffeeSugar);
        System.out.println("Size : " + coffeeSize);
    }
}