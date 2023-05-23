package com.izaanschool.methodcreation;

import java.util.Date;

public class Invoice {
    private String invoiceNumber;
    private String customer;
    private String[] items;
    private Date invoiceDate;


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

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setInvoiceNumber("Invoice 123");
        invoice.setCustomer("Salman Butt");
        invoice.setItems(new String[]{"Item1", "Item2", "Item3"});


        Date invoiceDate = new Date();
        invoice.setInvoiceDate(invoiceDate);

        System.out.println("Invoice Number: " + invoice.getInvoiceNumber());
        System.out.println("Customer: " + invoice.getCustomer());
        System.out.println("Items: " + String.join(", ", invoice.getItems()));
        System.out.println("Invoice Date: " + invoice.getInvoiceDate());
    }
}
