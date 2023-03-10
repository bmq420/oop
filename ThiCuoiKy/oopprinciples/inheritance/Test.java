package oopprinciples.inheritance;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();    //Tạo đối tượng Dog
        dog.eat();  //Dog có thể sử dụng phương thức eat() của Mammal do Dog có sự kế thừa từ Mammal
        dog.bark(); //Dog có thể sử dụng phương thức bark() của chính nó
    }
}
