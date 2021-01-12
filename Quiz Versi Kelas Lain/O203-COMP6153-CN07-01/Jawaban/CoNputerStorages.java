import java.util.Scanner;

public class CoNputerStorages {
	Scanner scan = new Scanner(System.in);

	public CoNputerStorages() {
		String product;
		
		System.out.println("CoNputer Storages");
		System.out.println("=================");
		System.out.println();
		do {
			System.out.print("Choose the product you want to buy [HDD | SSD]: ");
			product = scan.nextLine();
		} while (!product.equals("HDD") && !product.equals("SSD"));
		
		if(product.equals("HDD")){
			HDD hdd = new HDD();
			hdd.inputBrandType(scan);
			hdd.inputBrandLabel(scan);
			hdd.inputBrandCapacity(scan);
			hdd.inputBrandQuantity(scan);
			System.out.println();
			System.out.println("Order HDD success");
			System.out.println();
			hdd.displayHDDOrder();
		}else{
			SSD ssd = new SSD();
			ssd.inputBrandType(scan);
			ssd.inputBrandLabel(scan);
			ssd.inputBrandCapacity(scan);
			ssd.inputBrandQuantity(scan);
			ssd.inputBrandConnection(scan);
			ssd.displaySSDOrder();
		}
	}

	public static void main(String[] args) {
		new CoNputerStorages();
	}

}
