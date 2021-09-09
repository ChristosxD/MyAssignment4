/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.strategy;

/**
 *
 * @author Chris
 */
public class CardPayment implements PaymentMethod{

    private long cardNumber;
    private String cardHoldName;
    private String expDate;
    private int cvv;

    public CardPayment() {
    }

    
    public CardPayment(long cardNumber, String cardHoldName, String expDate, int cvv) {
        this.cardNumber = cardNumber;
        this.cardHoldName = cardHoldName;
        this.expDate = expDate;
        this.cvv = cvv;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHoldName() {
        return cardHoldName;
    }

    public void setCardHoldName(String cardHoldName) {
        this.cardHoldName = cardHoldName;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardPayment{cardNumber=").append(cardNumber);
        sb.append(", cardHoldName=").append(cardHoldName);
        sb.append(", expDate=").append(expDate);
        sb.append(", cvv=").append(cvv);
        sb.append('}');
        return sb.toString();
    }


    
    @Override
    public void pay(double amount) {
        System.out.println(cardHoldName + "  your Card with Card Number:"
                          + cardNumber
                          + " was charged with the amount  "
                          + amount);
    }
    
}
