//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        qty qty1 = new qty("A01", "Pen Red", 888, 0.08);
        System.out.println(qty1);

        qty1.setQty(999);
        qty1.setUnitPrice(0.99);
        System.out.println(qty1);
        System.out.println("id is: " + qty1.getId());
        System.out.println("desc is: " + qty1.getDesc());
        System.out.println("qty is: " + qty1.getQty());
        System.out.println("unitPrice is: " + qty1.getUnitPrice());

        System.out.println("The total is: " + qty1.getTotal());
    }
}