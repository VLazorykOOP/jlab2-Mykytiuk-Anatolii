import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Java Lab 2 ");
        System.out.println("Choise task number: (1-3)");
        int choice = s.nextInt();
        if (s != null) {
            switch (choice) {
                case 1: {
                    First();
                    break;
                }

                case 2: {
                    Second();
                    break;
                }
                case 3: {
                    Third();
                    break;
                }

                default: {
                    System.out.print("There is no number with this task number");
                    break;
                }
            }
        }
        s.close();
    }

    public static void First() {
        Goods good1 = new Goods();
        good1.inputFromConsole();
        System.out.println("info about good 1: ");
        System.out.println("Name: " + good1.name);
        System.out.println("Date: " + good1.date);
        System.out.println("Price: " + good1.price);
        System.out.println("Quantity: " + good1.quantity);
        System.out.println("Number: " + good1.number);

        /*
         * good1.Switch_price(200);
         * good1.Switch_quantity(150);
         */
        good1.Value();
    }

    public static void Second() {
        Cone cone = new Cone();

        cone.InputFromConsole();
        System.out.println("Height of the cone: " + cone.height);
        System.out.println("Radius of the cone: " + cone.radius);
        cone.SideSerfaceArea();
        cone.Volume();
    }

    public static void Third() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an arithmetic expression:");
        String expression = s.nextLine();
        int result = Aryfm.evaluateExpression(expression);
        System.out.println("Result: " + result);
        s.close();
    }
}
