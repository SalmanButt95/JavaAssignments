package com.izaanschool.objects;

public class Invoice {
    private int invoiceNumber;
    private String customer;
    private String[] items;

    public Invoice(int invoiceNumber, String customer, String[] items) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.items = items;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public static void main(String[] args) {
        String[] invoiceItems = {"Book", "Pencil", "Cards"};
        Invoice invoice = new Invoice(123456, "Salman Butt", invoiceItems);

        int invoiceNumber = invoice.getInvoiceNumber();
        String customer = invoice.getCustomer();
        String[] items = invoice.getItems();

        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer: " + customer);
        System.out.println("Items: ");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
