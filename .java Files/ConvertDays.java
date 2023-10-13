import java.util.Scanner;

public class ConvertDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days = sc.nextInt();

        int years = days / 365;
        int months = (days % 365) / 30;
        int remainingDays = (days % 365) % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + remainingDays);
    }
}