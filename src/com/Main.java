package com;

import service.*;
import storage.BankStorage;
import storage.FileBankStorage;
import ui.Menu;

public class Main {
    public static void main(String[] args) {
        BankStorage storage = new FileBankStorage("storage.txt");
        CreditService service = new CreditService(storage);
        Menu menu = new Menu(service);

        menu.run();
    }
}