package service;

public class SearchOffersCommand implements Command {
    private final CreditService service;

    public SearchOffersCommand(CreditService service) {
        this.service = service;
    }

    @Override
    public String getDesc() {
        return "SearchOffersCommand";
    }

    @Override
    public void execute(String params) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}