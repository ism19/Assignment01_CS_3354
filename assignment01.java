import java.util.Scanner;

public class assignment01 {
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter 1-3 to choose an option:");
            System.out.println("1 for View");
            System.out.println("2 for Restock");
            System.out.println("3 to Exit");
            
            int option = input.nextInt();

            switch (option) {
                case 1:
                    printInventory(itemNames, itemPrices, itemStocks);
                    break;
                case 2:
                    System.out.println("Enter the name of the item to restock: ");
                    String item = input.next();
                    System.out.println("Enter the amount to restock: ");
                    int amount = input.nextInt();
                    restockItem(itemNames, itemStocks, item, amount);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    return;
            }
        }
    }

    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < 10; i++) {
            if(names[i] != null) System.out.println("Item: " + names[i] + ", Price: " + prices[i] + ", Stock: " + stocks[i]);
        }
    }

    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        for (int i = 0; i < 10; i++) {
            if(names[i] == target) {
                stocks[i] += amount;
                return;
            }
        }
        System.out.println("Item not found.");
    }
}
