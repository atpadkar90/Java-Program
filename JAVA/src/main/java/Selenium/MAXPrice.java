package Selenium;

public class MAXPrice {

	public static void main(String[] args) {
		
		        String[] products = {"iPhone 11", "Galaxy", "Pixel 4", "iPhone 8"};
		        int[] price = {700, 650, 899, 284};

		        int maxPriceIndex = 0;
		        for (int i = 1; i < price.length; i++) {
		            if (price[i] > price[maxPriceIndex]) {
		                maxPriceIndex = i;
		            }
		        }

		        String mostExpensiveProduct = products[maxPriceIndex];
		        int mostExpensivePrice = price[maxPriceIndex];

		        System.out.println("The most expensive product is " + mostExpensiveProduct + " with a price of $" + mostExpensivePrice);
		    }
		}


