import java.util.ArrayList;

public class TestCafe {

    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil();

        int numWeeks = 10;
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(numWeeks));

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");

        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Drip Coffee", 2.50, 4));
        menu.add(new MenuItem("Cappuccino", 4.0, 4));
        menu.add(new MenuItem("Latte", 4.5, 4));
        menu.add(new MenuItem("Mocha", 5.0, 4));
        menu.add(new MenuItem("Chocolate Covered Beans", 15.0, 6));
        menu.add(new MenuItem("Souvenir Mug", 9.99, 12));

        appTest.displayMenu(menu);

				appTest.printPriceChart("Ground Beans", 8.00, 6);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---

        appTest.addCustomer(customers);



				// appTest.printPriceChart(menuItems.getName(), menuItems.getPrice(), menuItems.getMaxQuantity());
    }

    
}
