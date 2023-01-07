package com.lab13.pattern.builder.exercise2;

public class Test {
    public static void main(String[] args) {
        Human human1 = new Human.HumanBuilder()
                .setName("Ronaldo")
                .setAge(38)
                .setHeight(187)
                .setWeight(85)
                .build();
        Human human2 = new Human.HumanBuilder()
                .setName("Messi")
                .setAge(36)
                .setHeight(169)
                .setWeight(72)
                .build();

        System.out.println(human1);
        System.out.println(human2);
    }
}
