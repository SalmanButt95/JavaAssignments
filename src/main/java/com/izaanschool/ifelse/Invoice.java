package com.izaanschool.ifelse;

public class Invoice {
    private String invoiceNumber;
    private String customer;
    private int items;

    public Invoice(String invoiceNumber, String customer, int items) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.items = items;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("123", "Salman Butt", 5);
        System.out.println("Invoice Number : " + invoice.getInvoiceNumber());
        System.out.println("Customer : " + invoice.getCustomer());
        System.out.println("Items : " + invoice.getItems());

        if (invoice.getItems() == 5) {
            System.out.println("You are right");
        } else {
            System.out.println("Enter correct amount");
        }
    }
}
