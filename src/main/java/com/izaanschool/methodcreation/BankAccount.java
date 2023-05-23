package com.izaanschool.methodcreation;

public class BankAccount {

private String Number;
private String Balance;
private String Owner;

public String getNumber () { return Number;}
public void setNumber(String Number) {this.Number = Number;}

public String getBalance () { return Balance; }
public void setBalance (String Balance) {this.Balance = Balance;}

public String getOwner () { return Owner; }
public void setOwner (String Owner) {this.Owner = Owner;}


    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.setNumber("1234-5678-9023");
        ba.setBalance("$100,000");
        ba.setOwner("Salman Butt");

        System.out.println("Bank Account Details");
        System.out.println("Number : " + ba.getNumber());
        System.out.println("Balance : " + ba.getBalance());
        System.out.println("Owner : " + ba.getOwner());

    }
}
