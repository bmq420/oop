package com.lab5.part2.exercise4;

//Excercise 4 main class
public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAFterDiscount() {
        double temp = amount * customer.getDiscount() / 100;
        amount -= temp;
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice[" +
                "id = " + id +
                ", customer = " + customer +
                ", amount = " + amount +
                ']';
    }
}
