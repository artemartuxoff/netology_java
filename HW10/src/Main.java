import taxes.TaxSystem;
import taxes.TaxSystemDebet;
import taxes.TaxSystemDebetCredit;

public class Main {

    public static final TaxSystem TAX_SYSTEM_D = new TaxSystemDebet();
    public static final TaxSystem TAX_SYSTEM_DC = new TaxSystemDebetCredit();

    public static void main(String[] args) {

        Company company = new Company("WORK", TAX_SYSTEM_D);

        int[] operation = {100, -50, 150, 200, -300};

        for (int i = 0; i < operation.length; i++) {
            company.shiftMoney(operation[i]);
        }

        company.payTaxes();

        // доходы-расходы
        company.setTaxSystem(TAX_SYSTEM_DC);

        for (int i = 0; i < operation.length; i++) {
            company.shiftMoney(operation[i]);
        }
        company.payTaxes();

    }
}
