import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        HashMap<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(new Address("Россия", "Москва"), 100);
        costPerAddress.put(new Address("Россия", "Санкт-Петербург"), 80);
        costPerAddress.put(new Address("Россия", "Ростов"), 50);
        costPerAddress.put(new Address("Япония", "Токио"), 1000);
        costPerAddress.put(new Address("Германия", "Берлин"), 900);

        HashSet<String> setCountry = new HashSet<>();

        int sumCostPer = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Заполнение нового заказа: ");

            System.out.print("Введите страну: ");
            String inputCountry = scanner.nextLine();

            if("end".equals(inputCountry)){
                break;}

            System.out.print("Введите город: ");
            String inputCity = scanner.nextLine();

            System.out.print("Введите вес (кг): ");
            int inputWeight = Integer.parseInt(scanner.nextLine());

            Address inputAddress = new Address(inputCountry,inputCity);

            if (costPerAddress.containsKey(inputAddress)) {

                setCountry.add(inputCountry);

                int price = costPerAddress.get(inputAddress);

                int cost = inputWeight*price;

                sumCostPer=sumCostPer+cost;

                System.out.printf("Стоимость доставки составит: %d руб.%n",cost);
                System.out.printf("Общая стоимость всех доставок: %d руб.%n",sumCostPer);
                System.out.printf("Количество стран: %d.%n",setCountry.size());
                System.out.println();
            }
            else{
                System.out.println("Доставки по этому адресу нет");
                System.out.println();
            }
        }
    }
}