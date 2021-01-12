
public class BigSword extends SwordType{

	public BigSword() {
		super();
	}
	
	int getSwordsDamage(){
		return getSwordDamage() + 20;
	}
	
	int getMaterialPrice(){
		return SwordMaterial.get(getSwordMaterial()) + 3000;
	}
	
	@Override
	int getTotalPrice() {
		return (getSwordsDamage() * 100) + getMaterialPrice();
	}
	
	void displaySwordSpecification(){
		super.displaySwordSpecification();
		System.out.println("Name   : "+getSwordName());
		System.out.println("Ore    : "+getSwordMaterial());
		System.out.println("Damage : "+getSwordDamage());
		System.out.println("Price  : "+getTotalPrice());
	}
}