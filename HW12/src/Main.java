import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        PasswordChecker passwordChecker = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите мин. длину пароля: ");
        int minLength = scanner.nextInt();
        passwordChecker.setMinLength(minLength);

        System.out.print("Введите макс. допустимое количество повторений символа подряд: ");
        int maxRepeats = scanner.nextInt();
        passwordChecker.setMaxRepeats(maxRepeats);

        while (true) {

            System.out.print("Введите пароль или end: ");
            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            } else {

                if (passwordChecker.verify(input)) {
                    System.out.println("Подходит!");

                } else {
                    System.out.println("Не подходит!");
                }
            }
        }
    }
}