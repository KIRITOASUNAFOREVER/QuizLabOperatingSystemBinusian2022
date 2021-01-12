class Coffee extends CoffeeType{
    public Coffee() {
        super();
        this.coffeeType = "Coffee";
    }

    @Override
    int getTotalPrice() {
        return coffeeQuantity * getCoffeePrice();
    }

    @Override
    void displayOrder(){
        super.displayOrder();
        System.out.println("=============================");
        System.out.println("Qty : " + coffeeQuantity);
        System.out.println("Coffee Price : " + getCoffeePrice());
        System.out.println("Total Price : " + getTotalPrice());
    }
}
