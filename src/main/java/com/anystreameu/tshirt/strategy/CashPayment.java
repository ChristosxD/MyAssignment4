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
public class CashPayment implements PaymentMethod{

   private String address ;
   private String firstName;
   private String lastName;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    public void pay(double totalAmount) {
        System.out.println("================");
        System.out.println(firstName +" " + lastName
                           +" you should pay the amount of :"
                           + totalAmount
                           + "  upon receipt of order.");
    }
    
}
