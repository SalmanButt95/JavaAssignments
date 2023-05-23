package com.izaanschool.methodcreation;
import javax.jws.soap.SOAPBinding;
import java.util.Date;
public class Auction {


private String Item;
private String StartTime;
private String EndTime;

public String getItem () { return Item; }
public void setItem (String Item) {this.Item = Item;}

public String getStartTime () { return StartTime; }
public void setStartTime (String StartTime) {this.StartTime = StartTime;}

public String getEndTime () { return  EndTime; }
public void setEndTime (String EndTime) {this.EndTime = EndTime;}


    public static void main(String[] args) {

        Auction auc = new Auction();
        auc.setItem("Dodge Challenger");
        auc.setStartTime("12:00 PM");
        auc.setEndTime("1:30 PM");

        System.out.println("Auction Details");
        System.out.println("Item : " + auc.getItem());
        System.out.println("Start Time : " + auc.getStartTime());
        System.out.println("End Time : " + auc.getEndTime());


    }


}
