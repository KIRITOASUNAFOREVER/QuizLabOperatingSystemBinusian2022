import java.util.Scanner;

public class TV extends ProductType{
	public TV() {
        super();
    }
	
	int totalChannel;
	
	private boolean validateChannel(int channel) {
        return (channel > 10);
    }
	
	void inputChannel(Scanner scanner){
        do{
            System.out.print("Set Number of Channel [More than 10] : ");
          
            totalChannel = scanner.nextInt();scanner.nextLine();
        }
        while (!validateChannel(totalChannel));
    }

	public int getTotalChannel() {
		return totalChannel;
	}
}
