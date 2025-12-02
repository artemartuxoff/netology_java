import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        PasswordChecker passwordChecker = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите мин. длину пароля: ");
            int minLength = scanner.nextInt();
            passwordChecker.setMinLength(minLength);

            System.out.print("Введите макс. допустимое количество повторений символа подряд: ");
            int maxRepeats = scanner.nextInt();
            passwordChecker.setMaxRepeats(maxRepeats);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
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
        }}
        catch (IllegalStateException e){System.out.println(e.getMessage());}
    }
}