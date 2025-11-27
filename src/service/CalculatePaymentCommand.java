package service;

public class CalculatePaymentCommand implements Command {
    private final CreditService service;

    public CalculatePaymentCommand(CreditService service) {
        this.service = service;
    }

    @Override
    public String getDesc() {
        return "CalculatePaymentCommand";
    }

    @Override
    public void execute(String params) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}