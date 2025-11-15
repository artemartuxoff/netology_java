import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        System.out.println("Исходная матрица: ");
        printColor(colors);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Введите угол поворота (90, 180, 270): ");

            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            } else {
                int angle = Integer.parseInt(input);

                if (angle == 90 || angle == 180 || angle == 270) {

                    int[][] matrix = rotationMatrix(colors, angle);

                    System.out.println();
                    printColor(matrix);
                }
                else{
                    System.out.println("Введено некорректое значение");
                }
            }
        }
    }

    public static void printColor(int[][] colors) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }

    public static int[][] rotationMatrix(int[][] colors, int angle) {

        int[][] matrix = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                //при повороте на 90
                //номер строки = номер колонки
                //номер колонки = длина матрицы минус номер строки
                if (angle == 90) {
                    matrix[j][(SIZE - 1 - i)] = colors[i][j];
                }

                //при повороте на 180
                //номер строки = длина матрицы -номер строки
                //номер колонки = длина матрицы минут номер колонки
                else if (angle == 180) {
                    matrix[SIZE - 1 - i][SIZE - 1 - j] = colors[i][j];
                }
                //при повороте на 270
                //номер колонки = номер строки
                //номер строки = длина матрицы минус номер колонки
                else {
                    matrix[SIZE - 1 - j][i] = colors[i][j];
                }
            }
        }
        return matrix;
    }

}
