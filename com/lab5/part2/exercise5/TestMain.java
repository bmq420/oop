package com.lab5.part2.exercise5;

//Exercise 5 main class
public class TestMain {
    public static void main(String[] args) {
        Customer customer = new Customer(123, "Quan", 'm');
        System.out.println(customer);
        Account account = new Account(1, customer, 1000);
        System.out.println(account);

        System.out.println("id is: " + account.getId());
        System.out.println("customer is: " + account.getCustomer());
        System.out.println("customer's name is: " + account.getCustomerName());
        System.out.println("balance is: " + account.getBalance());

        account.setBalance(2000);
        System.out.println(account);

        account.deposit(222);
        System.out.println(account);

        account.withdraw(300);
        System.out.println(account);
    }
}
