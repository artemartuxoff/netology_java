import java.util.Scanner;

public class Main {

    public static int quantityDays(int year) {

        //
        int quantityDays;

        if (year % 400 == 0) {
            quantityDays = 366;
        } else if (year % 100 == 0) {
            quantityDays = 365;
        } else if (year % 4 == 0) {
            quantityDays = 366;
        } else {
            quantityDays = 365;
        }
        return quantityDays;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {

            System.out.println("Введите год: ");
            int year = scanner.nextInt();

            System.out.println("Введите количество дней: ");
            int day = scanner.nextInt();

            int yearDay = quantityDays(year);

            if (day == yearDay) {
                sum++;
            } else {
                System.out.println("Неправильно! В этом году: " + yearDay + " дней!");
                System.out.println("Набрано очков: " + sum);
                break;
            }
        }
    }
}