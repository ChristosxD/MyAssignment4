/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.steps;

import com.anystreameu.tshirt.custom.Basket;
import com.anystreameu.tshirt.models.TShirt;
import com.anystreameu.tshirt.strategy.CashPayment;
import com.anystreameu.tshirt.utilities.Validation;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class CashStep {

    Scanner input = new Scanner(System.in);

    
    /*
    fill the user informations for cash mathod
    */
    public void homeDetails(List<TShirt> tshirt,int asc) {
        Basket b = new Basket();
        CashPayment cp = new CashPayment();
        System.out.println("Please write your  house address :");
        cp.setAddress(input.next());
        System.out.println("Please write your first name :");
        cp.setFirstName(Validation.onlyString());
        System.out.println("Please write your last name :");
        cp.setLastName(Validation.onlyString());
        double itemsCost = b.totalOrderCost(tshirt);
        cp.pay(itemsCost + 3);
        System.out.println("===================");
        System.out.println("Would you like continue your shopping?");
        System.out.println("Press 1) for yes, Press 2 for GoodBye)");
        switch (Validation.onlyNumbers(1, 2)) {
           // here the user becoming redirect in my shop.
            case 1:
                FirstStep fs = new FirstStep();
                fs.firstWindow();
                //Finish the programma.
            case 2: 
                System.out.println("===================");
                System.out.println("Thank you  I hope you see you soon again!!!");
                
        }


    }
}
