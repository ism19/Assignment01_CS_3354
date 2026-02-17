import java.util.Scanner;

public class assignment01 {
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
    }

    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < 10; i++) {
            if(names[i] != null) System.out.println("Item: " + names[i] + ", Price: " + prices[i] + ", Stock: " + stocks[i]);
        }
    }
}
