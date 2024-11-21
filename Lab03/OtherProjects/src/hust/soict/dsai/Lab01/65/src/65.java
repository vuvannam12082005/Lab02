import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();

        int[] myArray = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Mang ban dau: " + Arrays.toString(myArray));

        Arrays.sort(myArray);

        System.out.println("Mang sau khi sap xep: " + Arrays.toString(myArray));

        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }

        double average = (double) sum / n;
        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("Gia tri trung binh: " + average);
    }
}
