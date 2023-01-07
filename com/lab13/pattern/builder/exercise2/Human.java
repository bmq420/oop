package com.lab13.pattern.builder.exercise2;

public class Human {
    private final String name;
    private final int age;
    private final int height;
    private final int weight;

    public Human(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public static class HumanBuilder {
        private String name;
        private int age;
        private int height;
        private int weight;

        public HumanBuilder(String name, int age, int height, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public HumanBuilder() {}

        public HumanBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public HumanBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public HumanBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Human build() {
            Human human = new Human(this.name, this.age, this.height, this.weight);
            return human;
        }
    }
}
