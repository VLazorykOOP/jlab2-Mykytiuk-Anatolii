import java.util.Scanner;

public class Goods {
    public String name;
    public String date;
    public double price;
    public int quantity;
    public int number;

    public Goods() {
        this.name = "noun";
        this.date = "xx.xx.xxxx";
        this.price = 0;
        this.quantity = 0;
        this.number = 1;
    }

    public void inputFromConsole() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input qood name:");
        this.name = s.nextLine();
        System.out.println("Input date:");
        this.date = s.nextLine();
        System.out.println("Input qood price:");
        this.price = s.nextDouble();
        System.out.println("Input qood quantity:");
        this.quantity = s.nextInt();
        System.out.println("Input invoice number:");
        this.number = s.nextInt();
        s.close();
    }

    /*public void Switch_price(double new_price) {
        Scanner s = new Scanner(System.in);
        new_price = s.nextDouble();
        price = new_price;
        System.out.println("New price: " + price);
    }

    public void Switch_quantity(int new_quantity) {
        /*Scanner s = new Scanner(System.in);
        new_quantity = s.nextInt();
        quantity = new_quantity;
        System.out.println("New quantity: " + quantity);
    }*/

    public void Value() {

        double value = price * quantity;
        System.out.println("Value all goods = " + value);
    }
}
