package model;

public class MortgageLoan extends CreditOffer {
    private String propertyType;

    public MortgageLoan(String id, double interestRate, double minAmount, double maxAmount, int minTermMonths, int maxTermMonths, boolean allowsEarlyRepayment, boolean allowsLineIncrease, String propertyType) {
        super(id, interestRate, minAmount, maxAmount, minTermMonths, maxTermMonths, allowsEarlyRepayment, allowsLineIncrease);
        this.propertyType = propertyType;
    }

    @Override
    public double calculatePayment(double amount, int term) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String getPropertyType() { return propertyType; }
}