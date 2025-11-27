package service;

public class SelectOfferCommand implements Command {
    private final CreditService service;

    public SelectOfferCommand(CreditService service) {
        this.service = service;
    }

    @Override
    public String getDesc() {
        return "SelectOfferCommand";
    }

    @Override
    public void execute(String params) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}