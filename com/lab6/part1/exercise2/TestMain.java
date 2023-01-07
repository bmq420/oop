package com.lab6.part1.exercise2;

public class TestMain {
    public static void main(String[] args) {
        testPerson();
        testStudent();
        testStaff();
    }

    //Test Person class
    public static void testPerson() {
        Person person = new Person("Quan", "Hanoi");
        System.out.println("\nPerson's name: " + person.getName());
        System.out.println("Person's address: " + person.getAddress());
        System.out.println("Info: " + person.toString());
    }

    //Test Student class
    public static void testStudent() {
        Student student = new Student("Quan", "Hanoi", "CS", 2022, 100);
        System.out.println("\nStudent's program: " + student.getProgram());
        System.out.println("Student's year: " + student.getYear());
        System.out.println("Student's fee: " + student.getFee());
        System.out.println("Info: " + student.toString());
    }

    //Test Staff class
    public static void testStaff() {
        Staff staff = new Staff("Quan", "Hanoi", "HUS", 200);
        System.out.println("\nStaff's school: " + staff.getSchool());
        System.out.println("Staff's pay: " + staff.getPay());
        System.out.println("Info: " + staff.toString());
    }
}
