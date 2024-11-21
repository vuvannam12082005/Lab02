import java.util.Scanner;

public class GiaiPhuongTrinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon loai phuong trinh can giai:");
        System.out.println("1. ax + b = 0");
        System.out.println("2. System of two first-degree equations");
        System.out.println("3. ax^2 + bx + c = 0");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveFirstDegree(scanner);
                break;
            case 2:
                solveSystemOfFirstDegree(scanner);
                break;
            case 3:
                solveSecondDegree(scanner);
                break;
            default:
                System.out.println("Invalid.");
        }
    }

    private static void solveFirstDegree(Scanner scanner) {
        System.out.println("Giai ax + b = 0");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("vo so nghiem");
            } else {
                System.out.println("ko co ket qua");
            }
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }

    private static void solveSystemOfFirstDegree(Scanner scanner) {
        System.out.println("Solving system of first-degree equations:");
        System.out.println("a11 * x1 + a12 * x2 = b1");
        System.out.println("a21 * x1 + a22 * x2 = b2");

        System.out.print("a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("b1: ");
        double b1 = scanner.nextDouble();

        System.out.print("a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("b2: ");
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("vo so nghiem");
            } else {
                System.out.println("ko co nghiem");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
    }

    private static void solveSecondDegree(Scanner scanner) {
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("");
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Hai nghiem la: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Nghiem kep: x = " + x);
        } else {
            System.out.println("Vo nghiem.");
        }
    }
}
