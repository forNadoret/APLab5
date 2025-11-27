package service;

public class LoadDataCommand implements Command {
    private final CreditService service;

    public LoadDataCommand(CreditService service) {
        this.service = service;
    }

    @Override
    public String getDesc() {
        return "LoadDataCommand";
    }

    @Override
    public void execute(String params) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}