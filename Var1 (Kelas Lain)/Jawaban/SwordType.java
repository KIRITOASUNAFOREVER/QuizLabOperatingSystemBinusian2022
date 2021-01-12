import java.util.HashMap;
import java.util.Scanner;

abstract class SwordType {
	HashMap<String,Integer> SwordMaterial = new HashMap<String, Integer>();
	
	String[] materialTypes = {"Cobalt","Palladium","Mythril"};
	
	public SwordType() {
		initSwordMaterial();
	}

	private void initSwordMaterial() {
		SwordMaterial.put("Cobalt", 5000);
		SwordMaterial.put("Palladium", 6000);
		SwordMaterial.put("Mythril", 7000);
	}
	
	String swordName;
	String swordMaterial;
	int swordDamage;

	public String getSwordName() {
		return swordName;
	}

	public void setSwordName(String swordName) {
		this.swordName = swordName;
	}

	public String getSwordMaterial() {
		return swordMaterial;
	}

	public void setSwordMaterial(String swordMaterial) {
		this.swordMaterial = swordMaterial;
	}

	public int getSwordDamage() {
		return swordDamage;
	}

	public void setSwordDamage(int swordDamage) {
		this.swordDamage = swordDamage;
	}
	
	private boolean validateName(String name){
        if (name.length() >= 5){
            return true;
        }
        return false;
    }
	
	void inputSwordName(Scanner scanner){
		do{
			System.out.print("Input sword's name[minimal 5 characters] : ");
			swordName = scanner.nextLine();
		}while(!validateName(swordName));
	}
	
	private boolean validateMaterial(String material){
        if (SwordMaterial.containsKey(material)){
            return true;
        }
        return false;
    }
	
	void inputSwordMaterial(Scanner scanner){
        do{
            System.out.print("Input material [");
            for (int i = 0; i < materialTypes.length; i++) {
                System.out.print(materialTypes[i]);
                if(i == materialTypes.length-1){
                    System.out.print("]");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print(": ");
            swordMaterial = scanner.nextLine();
        }
        while (!validateMaterial(swordMaterial));
	}
	
    private boolean validateDamage(int damage) {
        return (damage > 100 || damage < 1);
    }
	
	void inputSwordDamage(Scanner scanner){
		do{
			System.out.print("Input damage [1-100]: ");
			swordDamage = scanner.nextInt(); scanner.nextLine();
		}while(validateDamage(swordDamage));
	}
	
    abstract int getTotalPrice();
    
    void displaySwordSpecification(){
    	System.out.println("Sword Specification");
    	System.out.println("===================");
    }
}
