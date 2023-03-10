package oopprinciples.polymorphism;

public class Test {
    public static void main(String[] args) {
        Car car = new NamelessCar();    //Có thể tạo đối tượng NamelessCar bằng Car bởi có kế thừa từ lớp cha
        Car bmw = new BMW();    //Có thể tạo đối tượng BMW bằng Car bởi có kế thừa từ lớp cha
        car.brand();
        bmw.brand();
        //Phương thức brand() sự khác nhau và phụ thuộc vào đối tượng mà nó gọi
    }
}
