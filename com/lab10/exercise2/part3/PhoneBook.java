package com.lab10.exercise2.part3;

public interface PhoneBook {
    void addPerson(Student p);
    Student searchByName(String name);
    Student searchByLastname(String lastname);
    Student searchByNumber(String phone);
    void deleteByNumber(String phone);
}
