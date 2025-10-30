import java.util.Scanner;

public class Main {
    public static final int TAX_INCOME = 6;
    public static final int TAX_INCOME_EXPENSES = 15;

    public static int taxIncome(int income) {
        return income * TAX_INCOME / 100;
    }


    public static int taxIncomeMinusExpenses(int income, int expenses) {
        int tax = (income - expenses) * TAX_INCOME_EXPENSES / 100;

        return tax = Math.max(tax, 0);
    }

    static void systemSelection(String taxSystem, int recommendedTax, int alternativeTax) {

        System.out.println();

        if (recommendedTax == alternativeTax) {
            System.out.println(taxSystem);
        } else {

            System.out.println("Мы советуем вам " + taxSystem);
            System.out.println("Ваш налог составит: " + recommendedTax + " рублей");
            System.out.println("Налог на другой системе: " + alternativeTax + " рублей");
            System.out.println("Экономия: " + (alternativeTax - recommendedTax) + " рублей");

        }
        System.out.println();
    }

    static void main(String[] args) {

        int income = 0;
        int expenses = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогооблажения");

            String operation = scanner.nextLine();

            if (operation.equals("end")) {
                break;
            } else {
                int operationInt = Integer.parseInt(operation);
                switch (operationInt) {

                    case 1:
                        System.out.println("Введите сумму дохода:");
                        String moneyIncomeStr = scanner.nextLine();
                        int moneyIncome = Integer.parseInt(moneyIncomeStr);
                        income += moneyIncome;
                        break;

                    case 2:
                        System.out.println("Введите сумму расхода:");
                        String moneyExpensesStr = scanner.nextLine();
                        int moneyExpenses = Integer.parseInt(moneyExpensesStr);
                        expenses += moneyExpenses;
                        break;

                    case 3:
                        int usnIncome = taxIncome(income);
                        int usnIncomeExpenses = taxIncomeMinusExpenses(income, expenses);

                        if (usnIncome < usnIncomeExpenses) {
                            systemSelection("УСН доходы", usnIncome, usnIncomeExpenses);

                        } else if (usnIncomeExpenses < usnIncome) {
                            systemSelection("УСН доходы минус расходы", usnIncomeExpenses, usnIncome);
                        } else {
                            systemSelection("Можете выбрать любую систему налогообложения", usnIncomeExpenses, usnIncome);
                        }

                        break;
                    default:
                        System.out.println("Такой операции нет");
                }
            }
        }
        System.out.println("Программа завершена!");
    }
}