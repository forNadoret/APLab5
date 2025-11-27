package service;

public class DeleteOfferCommand implements Command {
    private final CreditService service;

    public DeleteOfferCommand(CreditService service) {
        this.service = service;
    }

    @Override
    public String getDesc() {
        return "DeleteOfferCommand";
    }

    @Override
    public void execute(String params) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}