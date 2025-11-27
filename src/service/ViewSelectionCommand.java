package service;

public class ViewSelectionCommand implements Command {
    private final CreditService service;

    public ViewSelectionCommand(CreditService service) {
        this.service = service;
    }

    @Override
    public String getDesc() {
        return "ViewSelectionCommand";
    }

    @Override
    public void execute(String params) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}