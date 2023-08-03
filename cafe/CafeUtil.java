import java.util.ArrayList;

public class CafeUtil {

    int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    double getOrderTotal(double[] prices){
        double sum = 0;
        for (int i = 0; i < prices.length; i++){
        sum += prices[i];
        }
        return sum;
    }

    void displayMenu(ArrayList<MenuItem> menuItems) {
        for (MenuItem item : menuItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("\n");
    }

    void printPriceChart(String product, double price, int maxQuantity){
        System.out.println("-----Price Chart-----");
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i ++){
            System.out.println(i + " - $" + (price - (i - 1) * .5));
        }
    }


    void addCustomer(ArrayList<String> customers) {
    String username = "";
    while (!username.equals("q")) {
        username = System.console().readLine();
        if (!username.equals("q")) {
            System.out.println("Hello " + username + ", there are currently " + customers.size() + " customers in front of you");
            customers.add(username);
        }
    }
    for (String name : customers) {
        System.out.println(name);
    }
}


}
