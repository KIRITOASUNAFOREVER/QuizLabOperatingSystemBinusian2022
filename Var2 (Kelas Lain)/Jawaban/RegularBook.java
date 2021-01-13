
public class RegularBook extends BookType{

	public RegularBook() {
		super();
	}

	@Override
	int getTotalPrice() {
		return getBasePrice() + getAdditionalPrice();
	}
	
	void displayRegularBookOrder(){
		super.displayRegularBookOrder();
		System.out.printf("| %-15s | %-10s | %-11s | %-11s |\n",getBookName(),getBookCategory(),getBookPages(),getTotalPrice());
		System.out.println("*==========================================================*");
	}

}
