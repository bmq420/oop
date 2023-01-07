package com.lab14.pattern.command.exercise2;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history;

    public CommandHistory() {
        history = new Stack<>();
    }

    public void push(Command command) {
        history.push(command);
    }

    public Command pop() {
        return history.pop();
    }
}
