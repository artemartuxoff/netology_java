package taxes;

public class TaxSystemDebet extends TaxSystem {

    public static final int TAX_D = 6;

    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit * TAX_D / 100;
    }
}
