package com.lab14.pattern.command.exercise1;

public class TestCommand {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        Switch switcher = new Switch();

        Command command1 = new ShutDownCommand(computer1);
        Command command2 = new RestartCommand(computer2);

        switcher.storeAndExecute(command1);
        switcher.storeAndExecute(command2);

        System.out.println();
        switcher.reexecuteCommand();
    }
}
