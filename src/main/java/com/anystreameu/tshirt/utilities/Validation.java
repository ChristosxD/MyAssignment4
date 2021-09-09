/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.utilities;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Chris
 */
public class Validation {
   static Scanner input = new Scanner(System.in);
    public static int onlyNumbers() {
        int onlyNumber;

        while (true) {
            try {
                onlyNumber = Integer.parseInt(input.next());
                break;
            } catch (NumberFormatException xxx) {
                System.out.println("PLEASE GIVE THE RIGHT NUMBER ");
            }
        }
        return onlyNumber;
    }
        public static long cardValidation() {
        long onlyNumber;

        while (true) {
            try {
                String cardNumber = input.next();
                if(cardNumber.length() == 16){
                    onlyNumber = Long.parseLong(cardNumber);
                    break;
                }
                else{
                    System.out.println("The Card Number must contain 16 numbers");
                }
                
            } catch (NumberFormatException xxx) {
                System.out.println("PLEASE GIVE THE RIGHT NUMBER ");
            }
        }
        return onlyNumber;
    }
    
        public static int onlyNumbers(int minimum, int maximum) {
        boolean isntvalid = true;
        int i = 0;
        while (isntvalid) {
            i = onlyNumbers();
            if (i < minimum || i > maximum) {
                System.out.println("PLEASE GIVE ME THE RIGHT NUMBER");
            } else {
                isntvalid = false;
            }
        }

        return i;
    }
        public static String onlyString() {

        boolean exit = false;
        String string = " ";
        while (!exit) {
            string = input.next();
            input.nextLine();
            if (Pattern.matches("^[a-zA-Z]+$", string) == true) {
                exit = true;

            } else {
                System.out.println("PLEASE GIVE ME A RIGHT NAME: ");
            }

        }
        return string;
    }
}
