package oopprinciples.polymorphism;

//Lớp BMW kế thừa từ lớp cha là Car bằng việc sử dụng từ khóa extends
public class BMW extends Car {
    public void brand() {
        System.out.println("BMW");
    }
}
