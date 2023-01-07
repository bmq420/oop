package com.lab11.pattern.singleton.exercise1;

public class Database {
    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Database";
    }
}
