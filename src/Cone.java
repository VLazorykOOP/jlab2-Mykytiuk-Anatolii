import java.util.Scanner;

public class Cone {
    public double height;
    public double radius;

    public Cone() {
        this.height = 1;
        this.radius = 1;
    }

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public void InputFromConsole() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input height of the cone:");
        System.out.print("height = ");
        this.height = s.nextDouble();
        System.out.println("Input radius of the cone:");
        System.out.print("radius = ");
        this.radius = s.nextDouble();
        s.close();
    }

    public void SideSerfaceArea() {
        double l = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        double S = Math.PI * radius * l;
        System.out.println("Side serface area of the cone = " + S);
    }

    public void Volume() {
        double V = (Math.PI * Math.pow(radius, 2) * height) / 3;
        System.out.println("Volume of the cone = " + V);
    }
}
