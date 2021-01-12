import java.util.HashMap;
import java.util.Scanner;

public class SSD extends StoragesType{
	HashMap<String, Integer> connectionPrices = new HashMap<String, Integer>();
	String[] brandConnections = {"PCIe", "SATA"};

	public SSD() {
		super();
		this.brandType = "SSD";
		initConnectionPrices();
	}
    private void initConnectionPrices() {
    	connectionPrices.put("PCIe", 2);
    	connectionPrices.put("SATA", 3);
    }
    
	String brandConnection;
	
    public String getBrandConnection() {
		return brandConnection;
	}
	public void setBrandConnection(String brandConnection) {
		this.brandConnection = brandConnection;
	}
	private boolean validateConnection(String connection){
        if (connectionPrices.containsKey(connection)){
            return true;
        }
        return false;
    }
	
    void inputBrandConnection(Scanner scanner){
        do{
            System.out.print("Input storage connection [");
            for (int i = 0; i < brandConnections.length; i++) {
                System.out.print(brandConnections[i]);
                if(i == brandConnections.length-1){
                    System.out.print("]");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print(": ");
            brandConnection = scanner.nextLine();
        }
        while (!validateConnection(brandConnection));
    }

	@Override
	int getTotalPrice() {
		return getBrandPrice() * getBrandCapacity() * getBrandQuantity() * connectionPrices.get(brandConnection);
	}
	
	void displaySSDOrder(){
		super.displaySSDOrder();
        System.out.printf("| %-15s | %-8s | %-8s | %-8s | %-10s | %-10s |\n", getBrandLabel(),this.brandType,getBrandCapacity(),getBrandQuantity(),getBrandConnection(),getTotalPrice());
        System.out.println("+=================+==========+==========+==========+============+============+");
	}
}
