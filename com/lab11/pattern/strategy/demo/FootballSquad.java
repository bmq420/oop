package com.lab11.pattern.strategy.demo;

public class FootballSquad {
    private Player role;

    public void setRole(Player role) {
        this.role = role;
    }

    public void position(int id) {
        role.position(id);
    }
}
