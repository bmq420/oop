package oopprinciples.abstraction;

//Lớp con kế thừa từ lớp cha là Animal
public class Cat extends Animal {
    //Phương thức animalSound() kế thừa từ lớp cha được lớp con override lại
    @Override
    public void animalSound() {
        System.out.println("GRRR GRRR");
    }
}
