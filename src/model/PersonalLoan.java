package model;

public class PersonalLoan extends CreditOffer {
    private String purpose;

    public PersonalLoan(String id, double interestRate, double minAmount, double maxAmount, int minTermMonths, int maxTermMonths, boolean allowsEarlyRepayment, boolean allowsLineIncrease, String purpose) {
        super(id, interestRate, minAmount, maxAmount, minTermMonths, maxTermMonths, allowsEarlyRepayment, allowsLineIncrease);
        this.purpose = purpose;
    }

    @Override
    public double calculatePayment(double amount, int term) {
        throw new UnsupportedOperationException("Логіка розрахунку споживчого кредиту ще не реалізована");
    }

    public String getPurpose() { return purpose; }
}