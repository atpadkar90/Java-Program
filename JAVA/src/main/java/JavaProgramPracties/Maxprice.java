package JavaProgramPracties;

public class Maxprice {

	public static void main(String[] args) {
		
		String[] products = {"iPhone 11", "Galaxy", "Pixel 4", "iPhone 8"};
        int[] price = {700, 650, 899, 284};
        
        int maxPrice=0;
        
        for(int i=0;i<price.length;i++)
        {
        	if(price[i]>price[maxPrice])
        	{
        		maxPrice=i;
        	}
        	
        }
        
        String maxProduct=products[maxPrice];
        int maprice= price[maxPrice];
        
        System.out.println(maxProduct+ " "+ maprice);

		
		
	}

}
