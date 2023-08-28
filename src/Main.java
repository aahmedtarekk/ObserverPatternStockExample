import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Observer Investor1 = new Investor("Mohsen");
        Observer Investor2 = new Investor("Sherif");

        stock.registerObserver(Investor1);
        stock.registerObserver(Investor2);

        stock.setPrice(50);

        stock.unRegisterObserver(Investor2);
        stock.setPrice(47);

    }
}