package com.lab11.pattern.strategy.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FootballSquad squad = new FootballSquad();

        Scanner scan = new Scanner(System.in);
        System.out.print("Set role: ");
        int role = Integer.parseInt(scan.next());

        if (role == 0)
            squad.setRole(new Goalkeeper());
        else if (role == 1)
            squad.setRole(new Defender());
        else if(role == 2)
            squad.setRole(new Midfielder());
        else
            squad.setRole(new Attacker());

        System.out.print("Set position: ");
        int position = Integer.parseInt(scan.next());

        squad.position(position);
    }
}
