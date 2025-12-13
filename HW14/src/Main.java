import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        //список операций
        ArrayList<String> operationList = new ArrayList<>();

        operationList.add("Выход из программы");
        operationList.add("Добавить дело");
        operationList.add("Показать дела");
        operationList.add("Удалить дело по номеру");
        operationList.add("Удалить дело по названию");
        operationList.add("Удалить дело по ключевому слову");

        //список дел
        ArrayList<String> doList = new ArrayList<>();

        //ввод пользователя
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию:");
            showListCase(operationList, 0);
            System.out.print("Ваш выбор:");

            int point = Integer.parseInt(scanner.nextLine());

            if (point == 0) {
                //завершение работы
                break;
            } else {
                switch (point) {
                    case 1:
                        //добавление элемента
                        System.out.print("Введите название задачи:");
                        doList.add(scanner.nextLine());

                        System.out.println("Добавлено!");

                        break;

                    case 2:
                        //вывод списка
                        break;

                    case 3:
                        //удаление по индексу
                        System.out.print("Введите номер для удаления:");
                        int index = Integer.parseInt(scanner.nextLine());

                        try {
                            String strDel = doList.remove(index - 1);
                            System.out.println("Удалено!");
                        } catch (IndexOutOfBoundsException exp) {
                            System.out.println("Не удалено, дела с таким номером нет!");
                        }

                        break;

                    case 4:
                        //удаление по точному тексту
                        System.out.print("Введите задачу для удаления:");

                        boolean resDel = doList.remove(scanner.nextLine());

                        if (resDel) {
                            System.out.println("Удалено!");
                        } else {
                            System.out.println("Не удалено, дела с таким наименование отсутствует!");
                        }

                        break;

                    case 5:
                        //удаление по ключевому слову
                        System.out.print("Введите задачу для удаления:");

                        String input = scanner.nextLine();
                        ArrayList <String> doListDel = findContains(doList, input);

                        if(doListDel.size()>0){
                            doList.removeAll(doListDel);
                            System.out.println("Удалено!");
                        }
                        else{
                            System.out.println("Нет элементов для удаления!");
                        }

                        break;

                }

                //выводится список дел
                System.out.println("Ваш список дел:");
                showListCase(doList, 1);
            }
        }
    }

    public static void showListCase(ArrayList<String> list, int index) {

        for (String strList : list) {
            System.out.println(index + ". " + strList);
            index++;
        }
        System.out.println();
    }

    public static ArrayList<String> findContains(ArrayList<String> doList, String input){

        ArrayList<String> doListDel = new ArrayList<>();

        for (String strDolist : doList){
            if (strDolist.contains(input)){
                doListDel.add(strDolist);
            }

        }

        return doListDel;
    }


}