package oopprinciples.abstraction;

public class Test {
    public static void main(String[] args) {
        Pig pig = new Pig();  //Tạo đối tượng Pig
        pig.animalSound();  //Code không cần biết tới nội dung việc phương thức hoạt động thế nào
        Cat cat = new Cat();    //Tạo đối tượng Cat
        cat.animalSound();
    }
}
