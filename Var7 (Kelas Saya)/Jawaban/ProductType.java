import java.util.HashMap;
import java.util.Scanner;

abstract class ProductType{
    HashMap<String,Integer> typePrices = new HashMap<String, Integer>();
    HashMap<String, Integer> resolutionPrices = new HashMap<String, Integer>();

    String[] productTypes = {"LCD", "LED"};
    String[] resolutionTypes = {"720p", "1080p", "4k"};

    String screenName;
    String screenType;
    String screenResolution;
    int screenRefreshRate;
    int prices;

	public ProductType() {
        inittypePrices();
        initresolutionPrices();
    }

    private void inittypePrices() {
        typePrices.put("LCD", 1000000);
        typePrices.put("LED", 3000000);
    }

    private void initresolutionPrices() {
        resolutionPrices.put("720p", 500000);
        resolutionPrices.put("1080p", 1000000);
        resolutionPrices.put("4K", 1500000);
    }

    private boolean validateType(String type){
        if (typePrices.containsKey(type)){
            return true;
        }
        return false;
    }

    private boolean validateScreenRefreshRate(int screenRefreshRate) {
        return (screenRefreshRate%60==0 && screenRefreshRate != 0);
    }

    void inputScreenType(Scanner scanner){
        do{
            System.out.print("Choose Screen Type [");
            for (int i = 0; i < productTypes.length; i++) {
                System.out.print(productTypes[i]);
                if(i == productTypes.length-1){
                    System.out.print("]");
                }else{
                    System.out.print("|");
                }
            }
            System.out.print("(Case-Sensitive) : ");
            screenType = scanner.nextLine();
        }
        while (!validateType(screenType));

    }

    void inputScreenResolution(Scanner scanner){
        do{
            System.out.print("Choose Resolution [");
            for (int i = 0; i < resolutionTypes.length; i++) {
                System.out.print(resolutionTypes[i]);
                if(i == resolutionTypes.length-1){
                    System.out.print("]");
                }else{
                    System.out.print("|");
                }
            }
            System.out.print("[Case-Insensitive] : ");
            screenResolution = scanner.nextLine();
            screenResolution = screenResolution.toLowerCase();
        }
        while (screenResolution.equals("720p")&& screenResolution.equals("1080p") && screenResolution.equals("4k"));

    }

    void inputscreenRefreshRate(Scanner scanner){
        do{
            System.out.print("Set Screen Refresh Rate (Multiple of 60) : ");
            screenRefreshRate = scanner.nextInt();scanner.nextLine();
        }
        while (!validateScreenRefreshRate(screenRefreshRate));
    }

    public String getScreenType() {
		return screenType;
	}

	public String getScreenResolution() {
		return screenResolution;
	}

	public int getScreenRefreshRate() {
		return screenRefreshRate;
	}
}