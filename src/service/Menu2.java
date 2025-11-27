package service;

import ui.Menu;

public class Menu2 extends Menu implements Command {

    public Menu2(CreditService service) {
        super(service);
    }

    @Override
    protected void init(CreditService service)
    {
        registerCommand("create", new CreateOfferCommand(service));
    }

    @Override
    public String getDesc() {
        return "Menu2";
    }

    @Override
    public void execute(String params) {
        run();
    }
}
