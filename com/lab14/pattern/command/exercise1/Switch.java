package com.lab14.pattern.command.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Switch {
    private List<Command> list;

    public Switch() {
        list = new ArrayList<>();
    }

    public void storeAndExecute(Command command) {
        list.add(command);
        command.execute();
    }

    public void reexecuteCommand() {
        for (Command i : list) {
            i.execute();
        }
    }
}
