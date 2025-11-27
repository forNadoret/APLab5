package service;

public class SaveDataCommand implements Command {
    private final CreditService service;

    public SaveDataCommand(CreditService service) {
        this.service = service;
    }

    @Override
    public String getDesc() {
        return "SaveDataCommand";
    }

    @Override
    public void execute(String params) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}