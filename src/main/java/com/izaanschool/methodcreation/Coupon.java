package com.izaanschool.methodcreation;

import java.util.Date;

public class Coupon {
    private String code;
    private double discountAmount;
    private Date expirationDate;


    public String getCode() {
        return code;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static void main(String[] args) {
        Coupon coupon = new Coupon();

        coupon.setCode("CODE4JAVA");
        coupon.setDiscountAmount(25.0);
        coupon.setExpirationDate(new Date());

        System.out.println("Coupon Details");
        System.out.println("Code: " + coupon.getCode());
        System.out.println("Discount Amount: " + coupon.getDiscountAmount());
        System.out.println("Expiration Date: " + coupon.getExpirationDate());
    }
}
