package oopprinciples.polymorphism;

//Lớp NamelessCar kế thừa từ lớp cha là Car bằng việc sử dụng từ khóa extends
public class NamelessCar extends Car{
    //Lớp con kế thừa các phương thức từ lớp cha và có thể viết đè lên chúng
    @Override
    public void brand() {
        super.brand();  //Sử dụng từ khóa super có thể gọi các phương thức từ lớp cha
    }
}
