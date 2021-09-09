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
public class BankTransferPayment implements PaymentMethod{

    private String firstName;
    private String lastName;

    public BankTransferPayment() {
    }
    
    

    public BankTransferPayment(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankTransferPayment{firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append('}');
        return sb.toString();
    }
    
    
    @Override
    public void pay(double totalAmount) {
        System.out.println(firstName + " " 
                           + lastName 
                           + " Your bank account was charged with the amount " 
                           + totalAmount+"€");
    }
    
}
