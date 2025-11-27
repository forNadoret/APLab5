package model;

public class CarLoan extends CreditOffer {
    private boolean requiresKASKO;

    public CarLoan(String id, double interestRate, double minAmount, double maxAmount, int minTermMonths, int maxTermMonths, boolean allowsEarlyRepayment, boolean allowsLineIncrease, boolean requiresKASKO) {
        super(id, interestRate, minAmount, maxAmount, minTermMonths, maxTermMonths, allowsEarlyRepayment, allowsLineIncrease);
        this.requiresKASKO = requiresKASKO;
    }

    @Override
    public double calculatePayment(double amount, int term) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean isRequiresKASKO() { return requiresKASKO; }
}