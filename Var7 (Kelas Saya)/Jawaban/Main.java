import java.util.Scanner;

public class Main {
	static String productType,productName;
	static int harga = 0;
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        	System.out.println("Monetorize");
            System.out.println("==========");
            do{
                System.out.print("Select product [Monitor | TV] (case-insensitive) : ");
                productType = scanner.nextLine();
                productType = productType.toUpperCase();
            }while(productType.equals("MONITOR") && productType.equals("productType"));
                    
                    if(productType.equals("MONITOR")){
                        Monitor monitor = new Monitor();
                        do{
                        	System.out.print("Please Enter the Name [ 5-20 ] : ");
                            productName = scanner.nextLine();
                        }while(productName.length() < 5 || productName.length() > 20);
                        
                        monitor.inputScreenType(scanner);
                        monitor.inputScreenResolution(scanner);
                        monitor.inputscreenRefreshRate(scanner);
                        System.out.println();                     
                            System.out.println("Monetorize");
                            System.out.println("==========");
                            System.out.println("Model Name   : "+productName);
                            System.out.println("Model Type   : " +monitor.getScreenType());
                            System.out.println("Resolution   : " +monitor.getScreenResolution());
                            System.out.println("Refresh Rate : " +monitor.getScreenRefreshRate() +" Hz");
                            if(monitor.getScreenType().equals("LCD")){
                            	harga = harga + 1000000;
                            }else if(monitor.getScreenType().equals("LED")){
                            	harga = harga + 3000000;
                            }
                            if(monitor.getScreenResolution().equals("720p")){
                            	harga = harga + 500000;
                            }else if(monitor.getScreenResolution().equals("1080p")){
                            	harga = harga + 1000000;
                            }else if(monitor.getScreenResolution().equals("4k")){
                            	harga = harga + 1500000;
                            }
                            int hargarefresh = monitor.getScreenRefreshRate()/60;
                            int hargarefresh1 = hargarefresh*250000;
                            harga = harga + hargarefresh1;
                            System.out.println("Price       : IDR "+harga);
                        System.out.println();
                        
                    }else{
                        TV tv = new TV();
                        do{
                        	System.out.print("Please Enter the Name [ 5-20 ] : ");
                            productName = scanner.nextLine();
                        }while(productName.length() < 5 || productName.length() > 20);
                        tv.inputScreenType(scanner);
                        tv.inputScreenResolution(scanner);
                        tv.inputscreenRefreshRate(scanner);
                        tv.inputChannel(scanner);
                        System.out.println();
                        System.out.println("Monetorize");
                        System.out.println("==========");
                        System.out.println("Model Name   : "+productName);
                        System.out.println("Model Type   : " +tv.getScreenType());
                        System.out.println("Resolution   : " +tv.getScreenResolution());
                        System.out.println("Refresh Rate : " +tv.getScreenRefreshRate() +" Hz");
                        if(tv.getScreenType().equals("LCD")){
                        	harga = harga + 1000000;
                        }else if(tv.getScreenType().equals("LED")){
                        	harga = harga + 3000000;
                        }
                        if(tv.getScreenResolution().equals("720p")){
                        	harga = harga + 500000;
                        }else if(tv.getScreenResolution().equals("1080p")){
                        	harga = harga + 1000000;
                        }else if(tv.getScreenResolution().equals("4k")){
                        	harga = harga + 1500000;
                        }
                        int hargarefresh = tv.getScreenRefreshRate()/60;
                        int hargarefresh1 = hargarefresh*250000;
                        harga = harga + hargarefresh1;
                        int hargaChannel;
                        hargaChannel = tv.getTotalChannel() *10000;
                        harga = harga + hargaChannel;
                        System.out.println("Price       : IDR "+harga);
                        System.out.println();
                    }
	}

}
