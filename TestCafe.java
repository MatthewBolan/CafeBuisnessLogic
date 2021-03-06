import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

public class TestCafe {

	public static void main(String[] args) {

	

        CafeUtil appTest = new CafeUtil();

		System.out.println();


        System.out.println("----- Streak Goal Test -----");

		System.out.println();

        
        System.out.printf("Purchases needed by week 10: %s \n", appTest.getStreakGoal());


		System.out.println();

        
        System.out.println("----- Price Chart Test-----");

            appTest.printPriceChart("Chai Latte Mix ", 4.5, 3);
            
            appTest.printPriceChart("Specialty Coaster ", 2.0, 5);

		System.out.println();


		System.out.println("----- Order Total Test-----");

		System.out.println();

		double[] lineItems = {3.5, 1.5, 4.0, 4.5};

		System.out.printf("Order total: %s \n",appTest.getOrderTotal(lineItems));

		System.out.println();


		System.out.println("----- Display Menu Test-----");

		System.out.println();

		List<String> loadMenu = Arrays.asList( "drip coffee", "cappucino", "latte", "mocha" );

		List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);

		// ArrayList<String> menu = new ArrayList<String>();

		// ArrayList<Double> prices = new ArrayList<Double>();
    
		// Note: Below is a way to add multiple elements to a list in fewer lines.

		// It does require an extra import at the top of the file.

		// menu.addAll(loadMenu);

		// prices.addAll(loadPrices);
		
		appTest.displayMenu(loadMenu, loadPrices);

		System.out.println();

	


		System.out.println("----- Add Customer Test-----");

		System.out.println();

        ArrayList<String> customers = new ArrayList<String>();

         // --- Test 4 times ---

        for (int i = 0; i < 4; i++) {

            appTest.addCustomer(customers);

            System.out.println("\n");
		
        }



	}
}
