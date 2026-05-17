package polymorphism;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        GoldCustomer gc = new GoldCustomer(1, "김인하");
        System.out.println(gc); // toString()
        System.out.println(gc.calcPrice(10000));
        System.out.println(gc);//toString()

    }
}
