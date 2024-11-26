import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap so thu hai: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;

        if (num2 != 0) {
            quotient = num1 / num2;
            System.out.println("Thuong cua hai so: " + quotient);
        } else {
            System.out.println("Khong the chia cho 0.");
        }

        System.out.println("Tong cua hai so: " + sum);
        System.out.println("Hieu cua hai so: " + difference);
        System.out.println("Tich cua hai so: " + product);
    }
}
