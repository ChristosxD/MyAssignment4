/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.steps;

import com.anystreameu.tshirt.custom.Basket;
import com.anystreameu.tshirt.models.TShirt;
import com.anystreameu.tshirt.strategy.BankTransferPayment;
import com.anystreameu.tshirt.utilities.Validation;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class BankTransferSetp {

    /*
    fill the user informations for Bank transfer mathod
     */
    public void insertBankDetails(List<TShirt> tshirt,int x) {

        Scanner input = new Scanner(System.in);

        Basket b = new Basket();
        System.out.println("===================");
        System.out.println("Our IBAN IS : ");
        System.out.println("GR16 0110 1250 0000 0001 2300 695");
        System.out.println("===================");
        BankTransferPayment bp = new BankTransferPayment();
        System.out.println("Please write your First Name :");
        bp.setFirstName(Validation.onlyString());
        System.out.println("Please write your Last Name :");
        bp.setLastName(Validation.onlyString());
        System.out.println("===================");
        System.out.println("Are you sure for this Transfer?");
        System.out.println("===================");
        System.out.println("Press 1. if you are");
        System.out.println("Press 2. if you want stop this payment.");
        System.out.println("===================");
        switch (Validation.onlyNumbers(1, 2)) {
            case 1:

                double itemsCost = b.totalOrderCost(tshirt);
                bp.pay(itemsCost);
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
                        System.out.println("===================");
                        break;
                }
            case 2 :
                break;
        }
        
            
    }
}
