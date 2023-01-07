package com.lab14.pattern.command.exercise2;

public class Editor {
    protected String text;

    public Editor(String text) {
        this.text = text;
    }

    public String getSelection() {
        return text;
    }

    public void deleteSelection() {
        text = null;
    }

    public void replaceSelection(String text) {
        this.text = text;
    }
}
