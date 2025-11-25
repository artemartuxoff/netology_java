import taxes.TaxSystem;

public class Company {

    String title;
    int debit;
    int credit;
    TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {

        this.title = title;
        this.debit = 0;
        this.credit = 0;
        this.taxSystem = taxSystem;

    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {

        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void payTaxes() {

        int taxes = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %S уплатила налог в размере: %d руб.", title, taxes);
        debit = 0;
        credit = 0;
        System.out.println();
    }


}
