import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] products = {"Хлеб", "Яблоки", "Молоко" };
        int[] prices = {100, 200, 300};
        //
        System.out.println("Список возможных товаров для покупки:");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + prices[i] + " руб/шт");
        }

        int[] box = new int[products.length];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите товар и количество или введите end");

            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }
            ;

            String[] parts = input.split(" ");

            int productNumber = Integer.parseInt(parts[0]);
            int productCount = Integer.parseInt(parts[1]);

            box[productNumber - 1] += productCount;
        }

        int sum = 0;
        System.out.println("Ваша корзина:");
        for (int i = 0; i < box.length; i++) {
            if (box[i] > 0) {
                sum += box[i] * prices[i];
                System.out.println(products[i] + " " + box[i] + " шт " + prices[i] + " руб/шт " + box[i] * prices[i] + " руб в сумме");
            }
        }
        System.out.println("Итого:" + sum);


    }
}


