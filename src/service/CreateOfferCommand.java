package service;

public class CreateOfferCommand implements Command {
    private final CreditService service;

    public CreateOfferCommand(CreditService service) {
        this.service = service;
    }

    @Override
    public String getDesc() {
        return "CreateOfferCommand";
    }

    @Override
    public void execute(String params) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}