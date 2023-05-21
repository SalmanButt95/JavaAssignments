package com.izaanschool.objects;

import java.util.Date;

public class Coupon {
    private String code;
    private double discountAmount;
    private Date expirationDate;

    public Coupon(String code, double discountAmount, Date expirationDate) {
        this.code = code;
        this.discountAmount = discountAmount;
        this.expirationDate = expirationDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static void main(String[] args) {
        Coupon coupon = new Coupon("SALMANJAVA", 25.0, new Date(2023-12-31));

        String code = coupon.getCode();
        double discountAmount = coupon.getDiscountAmount();
        Date expirationDate = coupon.getExpirationDate();

        System.out.println("Code: " + code);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Expiration Date: " + expirationDate);
    }
}
