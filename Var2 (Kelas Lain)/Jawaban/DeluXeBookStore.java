import java.util.Scanner;

public class DeluXeBookStore {
	Scanner scan = new Scanner(System.in);
	
	public DeluXeBookStore() {
		int pilihan;
		do {
			System.out.println("DeluXe Book Store");
			System.out.println("=================");
			System.out.println("Choose one of these items to buy");
			System.out.println("1. Regular Book");
			System.out.println("2. Premium Book");
			System.out.print(">> ");
			pilihan = scan.nextInt(); scan.nextLine();
			switch(pilihan){
			case 1:
				menuRegularBook();
				break;
			case 2:
				menuPremiumBook();
				break;
			}
		} while (pilihan < 1 || pilihan > 2);
	}

	private void menuRegularBook() {
		RegularBook regularBook = new RegularBook();
		regularBook.inputBookCategory(scan);
		regularBook.inputBookName(scan);
		regularBook.inputBookPages(scan);
		System.out.println(); System.out.println();
		regularBook.displayRegularBookOrder();
	}
	
	private void menuPremiumBook() {
		PremiumBook premiumBook = new PremiumBook();
		premiumBook.inputBookCategory(scan);
		premiumBook.inputBookName(scan);
		premiumBook.inputBookPages(scan);
		premiumBook.inputBookCover(scan);
		System.out.println(); System.out.println();
		premiumBook.displayPremiumBookOrder();
	}
	
	public static void main(String[] args) {
		new DeluXeBookStore();
	}

}