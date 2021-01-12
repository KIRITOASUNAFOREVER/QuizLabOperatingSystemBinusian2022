
public class Sword extends SwordType{

	public Sword() {
		super();
	}

	@Override
	int getTotalPrice() {
		return (getSwordDamage() * 100) + SwordMaterial.get(getSwordMaterial());
	}
	
	void displaySwordSpecification(){
		super.displaySwordSpecification();
		System.out.println("Name   : "+getSwordName());
		System.out.println("Ore    : "+getSwordMaterial());
		System.out.println("Damage : "+getSwordDamage());
		System.out.println("Price  : "+getTotalPrice());
	}
}
