import java.util.Scanner;

public class SwordCraft {
	Scanner scan = new Scanner(System.in);
	
	void menuSword(){
		Sword sword = new Sword();
		System.out.println(); System.out.println();
		System.out.println("Sword Menu");
		System.out.println("==========");
		sword.inputSwordName(scan);
		sword.inputSwordMaterial(scan);
		sword.inputSwordDamage(scan);
		System.out.println(); System.out.println();
		sword.displaySwordSpecification();
		System.out.println("Press enter to continue to main menu..");
		scan.nextLine();
		System.out.println(); System.out.println();
	}
	
	void menuBigSword(){
		BigSword bigSword = new BigSword();
		System.out.println(); System.out.println();
		System.out.println("Big Sword Menu");
		System.out.println("==========");
		bigSword.inputSwordName(scan);
		bigSword.inputSwordMaterial(scan);
		bigSword.inputSwordDamage(scan);
		System.out.println(); System.out.println();
		bigSword.displaySwordSpecification();
		System.out.println("Press enter to continue to main menu..");
		scan.nextLine();
		System.out.println(); System.out.println();
	}
	
	public SwordCraft() {
		int pilihan;
		
		do {
			System.out.println("Sword Craft");
			System.out.println("===========");
			System.out.println("1. Forge a Sword");
			System.out.println("2. Forge a Big Sword");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			pilihan = scan.nextInt(); scan.nextLine();
			switch(pilihan){
			case 1:
				menuSword();
				break;
			case 2:
				menuBigSword();
				break;
			case 3:
				System.out.println("Thank you for using my program!");
				System.out.println("Press enter to exit program..");
				scan.nextLine();
				break;
			}
		} while (pilihan < 1 || pilihan > 3 || pilihan != 3);
	}
	
	public static void main(String[] args){
		new SwordCraft();
	}
}
