package com.lab12.pattern.factorymethod.exercise1;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
