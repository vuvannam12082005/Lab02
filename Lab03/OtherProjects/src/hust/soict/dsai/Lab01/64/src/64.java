import java.util.Scanner;

public class DaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(String month, int year) {
        switch (month.toLowerCase()) {
            case "1":
            case "thang 1":
            case "thang mot":
            case "january":
                return 31;
            case "2":
            case "thang 2":
            case "thang hai":
            case "february":
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case "3":
            case "thang 3":
            case "thang ba":
            case "march":
                return 31;
            case "4":
            case "thang 4":
            case "thang tu":
            case "april":
                return 30;
            case "5":
            case "thang 5":
            case "thang nam":
            case "may":
                return 31;
            case "6":
            case "thang 6":
            case "thang sau":
            case "june":
                return 30;
            case "7":
            case "thang 7":
            case "thang bay":
            case "july":
                return 31;
            case "8":
            case "thang 8":
            case "thang tam":
            case "august":
                return 31;
            case "9":
            case "thang 9":
            case "thang chin":
            case "september":
                return 30;
            case "10":
            case "thang 10":
            case "thang muoi":
            case "october":
                return 31;
            case "11":
            case "thang 11":
            case "thang muoi mot":
            case "november":
                return 30;
            case "12":
            case "thang 12":
            case "thang muoi hai":
            case "december":
                return 31;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thang (ten day du, viet tat hoac so): ");
        String month = scanner.nextLine();

        System.out.println("Nhap nam (day du 4 chu so): ");
        int year = scanner.nextInt();

        int days = getDaysInMonth(month, year);

        if (days == -1) {
            System.out.println("Thang khong hop le. Vui long thu lai.");
        } else {
            System.out.println("Thang " + month + " nam " + year + " co " + days + " ngay.");
        }

        scanner.close();
    }
}
