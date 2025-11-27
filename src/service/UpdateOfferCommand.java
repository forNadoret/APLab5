package service;

public class UpdateOfferCommand implements Command {
    private final CreditService service;

    public UpdateOfferCommand(CreditService service) {
        this.service = service;
    }

    @Override
    public String getDesc() {
        return "UpdateOfferCommand";
    }

    @Override
    public void execute(String params) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}