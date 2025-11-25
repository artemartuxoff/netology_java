package taxes;

public class TaxSystemDebetCredit extends TaxSystem {

    public static final int TAX_DC = 15;

    @Override
    public int calcTaxFor(int debit, int credit) {
        return Math.max(debit - credit, 0) * TAX_DC / 100;
    }
}
