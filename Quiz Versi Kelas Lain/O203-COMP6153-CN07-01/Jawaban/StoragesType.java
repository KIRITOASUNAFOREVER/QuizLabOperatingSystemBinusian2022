import java.util.HashMap;
import java.util.Scanner;

abstract class StoragesType {
    HashMap<String,Integer> storageBrand = new HashMap<String, Integer>();
    
    String[] brandTypes = {"Samsong","Sandesk","Toshibo", "Kingstan"};
    
	public StoragesType() {
		initstorageBrand();
	}

	private void initstorageBrand() {
		storageBrand.put("Samsong", 1000);
		storageBrand.put("Sandesk", 2000);
		storageBrand.put("Toshibo", 3000);
		storageBrand.put("Kingstan", 4000);
	}
	
	String brandType;
	String brandLabel;
	int brandCapacity;
	int brandQuantity;
	
    public String getBrandLabel() {
		return brandLabel;
	}

	public void setBrandLabel(String brandLabel) {
		this.brandLabel = brandLabel;
	}

	public int getBrandCapacity() {
		return brandCapacity;
	}

	public void setBrandCapacity(int brandCapacity) {
		this.brandCapacity = brandCapacity;
	}

	public int getBrandQuantity() {
		return brandQuantity;
	}

	public void setBrandQuantity(int brandQuantity) {
		this.brandQuantity = brandQuantity;
	}

	private boolean validateBrand(String brand){
        if (storageBrand.containsKey(brand)){
            return true;
        }
        return false;
    }
    
    private boolean validateCapacity(int capacity) {
        return (capacity > 256 || capacity < 128);
    }
    
    private boolean validateQuantity(int quantity) {
        return (quantity > 20 || quantity < 1);
    }
	
    void inputBrandType(Scanner scanner){
        do{
            System.out.print("Input storage brand [");
            for (int i = 0; i < brandTypes.length; i++) {
                System.out.print(brandTypes[i]);
                if(i == brandTypes.length-1){
                    System.out.print("]");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print(": ");
            brandType = scanner.nextLine();
        }
        while (!validateBrand(brandType));
    }
    
    void inputBrandLabel(Scanner scanner){
    	do {
			System.out.print("Input storage label [5..15 characters]: ");
			brandLabel = scanner.nextLine();
		} while (brandLabel.length() < 5 || brandLabel.length() > 15);
    }
    
    void inputBrandCapacity(Scanner scanner){
    	do {
			System.out.print("Input storage capacity [128..256]: ");
			brandCapacity = scanner.nextInt(); scanner.nextLine();
		} while (validateCapacity(brandCapacity));
    }
    
    void inputBrandQuantity(Scanner scanner){
    	do {
			System.out.print("Input quantity [1..20]: ");
			brandQuantity = scanner.nextInt(); scanner.nextLine();
		} while (validateQuantity(brandQuantity));
    }
    
    int getBrandPrice(){
    	return storageBrand.get(brandType);
    }
    abstract int getTotalPrice();
    
    void displayHDDOrder(){
		System.out.println("CoNputer Storages");
		System.out.println("=================");
        System.out.println();
        System.out.println("+=================+==========+==========+==========+============+");
        System.out.printf("| %-15s | %-8s | %-8s | %-8s | %-10s |\n", "Label","Brand","Capacity","Quantity","Price");
        System.out.println("+=================+==========+==========+==========+============+");
    }
    
    void displaySSDOrder(){
		System.out.println("CoNputer Storages");
		System.out.println("=================");
        System.out.println();
        System.out.println("+=================+==========+==========+==========+============+============+");
        System.out.printf("| %-15s | %-8s | %-8s | %-8s | %-10s | %-10s |\n", "Label","Brand","Capacity","Quantity","Connection","Price");
        System.out.println("+=================+==========+==========+==========+============+============+");
    }
}
