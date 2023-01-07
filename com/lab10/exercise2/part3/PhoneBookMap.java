package com.lab10.exercise2.part3;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;
    int position = 0;

    public PhoneBookMap() {
        this.phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(String.valueOf(position++), p);
    }

    @Override
    public Student searchByName(String name) {
        for (int i = 0; i < position; i++) {
            if (phoneBook.get(String.valueOf(i)) != null && phoneBook.get(String.valueOf(i)).name.equals(name)) {
                return phoneBook.get(String.valueOf(i));
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (int i = 0; i < position; i++) {
            if (phoneBook.get(String.valueOf(i)) != null && phoneBook.get(String.valueOf(i)).lastname.equals(lastname)) {
                return phoneBook.get(String.valueOf(i));
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (int i = 0; i < position; i++) {
            if (phoneBook.get(String.valueOf(i)) != null && phoneBook.get(String.valueOf(i)).phone.equals(phone)) {
                return phoneBook.get(String.valueOf(i));
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (int i = 0; i < position; i++) {
            if (phoneBook.get(String.valueOf(i)).phone.equals(phone)) {
                phoneBook.remove(String.valueOf(i));
            }
        }
    }
}
