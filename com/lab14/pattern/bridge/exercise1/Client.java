package com.lab14.pattern.bridge.exercise1;

public class Client {
    public static void main(String[] args) {
        OperatingSystem winOS = new WindowsOS();
        OperatingSystem macOS = new MacOS();

        Computer com1 = new Laptop(winOS);
        Computer com2 = new PC(macOS);

        System.out.println("Computer 1: ");
        com1.startup();
        com1.browseInternet("google.com");
        System.out.println(com1.canMoveComputer());

        System.out.println("\nComputer 2: ");
        com2.startup();
        com2.browseInternet("stackoverflow.com");
        System.out.println(com2.canMoveComputer());
    }
}
