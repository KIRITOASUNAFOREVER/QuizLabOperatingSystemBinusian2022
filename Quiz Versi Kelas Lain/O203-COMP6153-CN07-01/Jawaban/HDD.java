
public class HDD extends StoragesType{

	public HDD() {
		super();
		this.brandType = "HDD";
	}

	@Override
	int getTotalPrice() {
		return getBrandPrice() * getBrandCapacity() * getBrandQuantity();
	}
	
	@Override
	void displayHDDOrder(){
		super.displayHDDOrder();
		System.out.printf("| %-15s | %-8s | %-8s | %-8s | %-10s |\n", getBrandLabel(),this.brandType,getBrandCapacity(),getBrandQuantity(),getTotalPrice());
		System.out.println("+=================+==========+==========+==========+============+");
	}
}
