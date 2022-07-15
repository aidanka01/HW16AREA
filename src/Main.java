import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle circle1 = new Circle(radius);
        System.out.println("Area of circle " + circle1.getRadius());
        System.out.println("Circumference of circle " + circle1.getCircumference());

    }
}