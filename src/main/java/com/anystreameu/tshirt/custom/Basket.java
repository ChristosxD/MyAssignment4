/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.custom;

import com.anystreameu.tshirt.models.TShirt;
import com.anystreameu.tshirt.strategy.PaymentMethod;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chris
 */
public class Basket {
    private List<TShirt> tshirts;

    public Basket() {
        this.tshirts = new ArrayList<TShirt>();
    }
    
    public void addTShirt(TShirt tshirt){
        this.tshirts.add(tshirt);
    }
    
    public  void removeTShirt(TShirt tshirt){
        tshirts.remove(tshirt);
    }
    public double totalOrderCost(List<TShirt> tshirts){
        double sum = 0.0;
        for (TShirt item : tshirts) {
            sum += item.getPrice();
        }
        return sum;
    }
    
    public void executePayment(PaymentMethod paymentMethod){
    
        double total = totalOrderCost(this.tshirts);
        paymentMethod.pay(total);
    }

    public List<TShirt> getTshirts() {
        return tshirts;
    }

    public void setTshirts(List<TShirt> tshirts) {
        this.tshirts = tshirts;
    }
    
}
