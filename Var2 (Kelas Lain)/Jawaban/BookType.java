import java.util.HashMap;
import java.util.Scanner;

abstract class BookType {
	HashMap<String,Integer> BookCategory = new HashMap<String, Integer>();
	
	String[] categoryTypes = {"Comedy","Romance","Fiction"};
	
	public BookType() {
		initBookCategory();
	}
	
	private void initBookCategory() {
		BookCategory.put("Comedy", 55000);
		BookCategory.put("Romance", 58000);
		BookCategory.put("Fiction", 60000);
	}
	
	String bookCategory;
	
	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	private boolean validateCategory(String category){
        if (BookCategory.containsKey(category)){
            return true;
        }
        return false;
    }
	
	void inputBookCategory(Scanner scanner){
        do{
            System.out.print("Input book's category[");
            for (int i = 0; i < categoryTypes.length; i++) {
                System.out.print(categoryTypes[i]);
                if(i == categoryTypes.length-1){
                    System.out.print("]");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print(": ");
            bookCategory = scanner.nextLine();
        }
        while (!validateCategory(bookCategory));
	}
	
	String bookName;
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	private boolean validateName(String name){
        if (name.length() >= 5 && name.length() <= 15){
            return true;
        }
        return false;
    }
	
	void inputBookName(Scanner scanner){
		do {
			System.out.print("Input book's name[5 - 15 characters]: ");
			bookName = scanner.nextLine();
		} while (!validateName(bookName));
	}
	
	int bookPages;
	
    public int getBookPages() {
		return bookPages;
	}

	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}

	private boolean validatePages(int pages) {
        return (pages >= 50);
    }
	
	void inputBookPages(Scanner scanner){
		do{
			System.out.print("Input book's pages[more than or equals 50 pages]: ");
			bookPages = scanner.nextInt(); scanner.nextLine();
		}while(!validatePages(bookPages));
	}
	
	int getAdditionalPrice(){
		if(bookPages >= 150){
			return (BookCategory.get(bookCategory) * (30))/100;
		}else if(bookPages >= 100){
			return (BookCategory.get(bookCategory) * (20))/100;
		}else{
			return (BookCategory.get(bookCategory) * (10))/100;
		}
		
	}
	
	int getBasePrice(){
		return BookCategory.get(bookCategory);
	}
	
	abstract int getTotalPrice();
	
	void displayRegularBookOrder(){
		System.out.println("*====================DeluXe Book Store=====================*");
		System.out.println("*==========================================================*");
		System.out.printf("| %-15s | %-10s | %-11s | %-11s |\n","Name","Category","Total Pages","Total Price");
		System.out.println("*==========================================================*");
	}
	
	void displayPremiumBookOrder(){
		System.out.println("*=========================DeluXe Book Store==========================*");
		System.out.println("|====================================================================|");
		System.out.printf("| %-15s | %-10s | %-11s | %-7s | %-11s |\n","Name","Category","Total Pages","Cover","Total Price");
		System.out.println("*====================================================================*");
	}
}