package OOPLesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        HotDrink coffee = new HotDrink("cofee", 50.00, 1, 89);
        HotDrink milk = new HotDrink("milk", 65.00, 2, 60);
        HotDrink tea = new HotDrink("tea", 11.20, 1, 90);
        List<HotDrink> hotDrinksList  = new ArrayList<>(Arrays.asList(coffee, milk, tea));

        HotDrinkVendingMachine vmHotDrinks = new HotDrinkVendingMachine(hotDrinksList);

        System.out.println(vmHotDrinks.getProduct("milk"));
    }
}
