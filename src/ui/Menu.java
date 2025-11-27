package ui;

import service.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Map<String, Command> commands;
    private final Scanner scanner;
    private final CreditService service;


    public Menu(CreditService service) {
        this.commands = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.service = service;
        init(service);
    }

    protected void init(CreditService service)
    {
        registerCommand("storage", new SubMenuStorage(service));
        registerCommand("offer", new SubMenuStorage(service));
        registerCommand("basket", new SubMenuBasket(service));
    }

    public void registerCommand(String key, Command command) {
        commands.put(key, command);
    }

    public void run() {
        boolean running = true;

        while (running) {
            System.out.print("> ");
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split(" ", 2);
            String key = parts[0].toLowerCase();
            String params = (parts.length > 1) ? parts[1] : "";

            switch (key) {
                case "exit":
                    running = false;
                    System.out.println("Exiting...");
                    break;
                case "help":
                    handleHelp();
                    break;
                default:
                    Command command = commands.get(key);
                    if (command != null) {
                        command.execute(params);
                    }
                    else {
                        System.out.println("Unknown command. Try 'help' to see the list of available commands.");
                    }
                    break;
            }
        }
        scanner.close();
    }

    private void handleHelp() {
        System.out.println("Available commands:");
        for (Map.Entry<String, Command> entry : commands.entrySet()) {
            System.out.printf("  %-10s - %s\n", entry.getKey(), entry.getValue().getDesc());
        }
        System.out.printf("  %-10s - %s\n", "help", "Show this list");
        System.out.printf("  %-10s - %s\n", "exit", "Exit the program");
    }
}