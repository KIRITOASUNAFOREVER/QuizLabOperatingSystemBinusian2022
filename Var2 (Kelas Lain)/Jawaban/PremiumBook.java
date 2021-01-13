import java.util.HashMap;
import java.util.Scanner;

public class PremiumBook extends BookType{
	HashMap<String,Integer> BookCover = new HashMap<String, Integer>();
	
	String[] variationTypes = {"Soft","Hard"};
	
	public PremiumBook() {
		super();
		initBookCover();
	}
	
	private void initBookCover() {
		BookCover.put("Soft", 15000);
		BookCover.put("Hard", 10000);
	}
	
	String bookCover;
	
	public String getBookCover() {
		return bookCover;
	}

	public void setBookCover(String bookCover) {
		this.bookCover = bookCover;
	}
	
	private boolean validateCover(String cover){
        if (BookCover.containsKey(cover)){
            return true;
        }
        return false;
    }

	void inputBookCover(Scanner scanner){
        do{
            System.out.print("Input book's cover[");
            for (int i = 0; i < variationTypes.length; i++) {
                System.out.print(variationTypes[i]);
                if(i == variationTypes.length-1){
                    System.out.print("]");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print(": ");
            bookCover = scanner.nextLine();
        }
        while (!validateCover(bookCover));
	}
	
	@Override
	int getTotalPrice() {
		return getBasePrice() + getAdditionalPrice() + BookCover.get(bookCover);
	}
	
	void displayPremiumBookOrder(){
		super.displayPremiumBookOrder();
		System.out.printf("| %-15s | %-10s | %-11s | %-7s | %-11s |\n",getBookName(),getBookCategory(),getBookPages(),getBookCover(),getTotalPrice());
		System.out.println("*====================================================================*");
	}
}