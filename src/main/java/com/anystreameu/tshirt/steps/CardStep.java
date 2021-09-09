/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.steps;

import com.anystreameu.tshirt.custom.Basket;
import com.anystreameu.tshirt.models.TShirt;
import com.anystreameu.tshirt.strategy.CardPayment;
import com.anystreameu.tshirt.utilities.Validation;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class CardStep {
    /*
    fill the user informations for card mathod
    */
    public void insertCardDetails(List<TShirt> tshirt,int x) {

        Scanner input = new Scanner(System.in);

        Basket b = new Basket();
        CardPayment cp = new CardPayment();
        System.out.println("Please write your Card Name :");
        cp.setCardHoldName(Validation.onlyString());
        System.out.println("Please write your  Card Number :  (Only 16 numbers)");
        cp.setCardNumber(Validation.cardValidation());
        System.out.println("Please write the card expiration date :  (xx/xx)");
        cp.setExpDate(input.next());
        System.out.println("Please write card cvv number : (Only 3 numbers)");
        cp.setCvv(Validation.onlyNumbers());
        double itemsCost = b.totalOrderCost(tshirt);
        cp.pay(itemsCost);
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
                break;
        }

    }
}
