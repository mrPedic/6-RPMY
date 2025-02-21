import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину стороны a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите длину стороны b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите угол между сторонами a и b (в градусах): ");
        double gammaDegrees = scanner.nextDouble();

        double gammaRadians = Math.toRadians(gammaDegrees);
        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(gammaRadians));
        double area = 0.5 * a * b * Math.sin(gammaRadians);

        double heightA = (2 * area) / a;
        double heightB = (2 * area) / b;
        double heightC = (2 * area) / c;

        double maxHeight = Math.max(heightA, Math.max(heightB, heightC));

        System.out.println("Высота, опущенная на сторону a: " + heightA);
        System.out.println("Высота, опущенная на сторону b: " + heightB);
        System.out.println("Высота, опущенная на сторону c: " + heightC);
        System.out.println("Наибольшая высота: " + maxHeight);
    }
}`