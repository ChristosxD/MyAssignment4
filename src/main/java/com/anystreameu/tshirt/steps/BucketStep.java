/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.steps;

import com.anystreameu.tshirt.algorithmous.BucketSort;
import com.anystreameu.tshirt.custom.Basket;
import com.anystreameu.tshirt.custom.Custom;
import com.anystreameu.tshirt.data.DammyData;
import com.anystreameu.tshirt.models.TShirt;
import com.anystreameu.tshirt.utilities.Validation;
import java.util.List;

/**
 *
 * @author Chris
 */
public class BucketStep {

    public void firstBucketWindow() {
        System.out.println("|===================|");
        System.out.println("Whould you like Sort by :");
        System.out.println("|===================|");
        System.out.println("1) Size in ascending");
        System.out.println("2) Size in descending");
        System.out.println("3) Color in ascending");
        System.out.println("4) Color in descending");
        System.out.println("5) Fabric in ascending");
        System.out.println("6) Fabric in descending");
        System.out.println("7) Size and Color and Fabric in ascending");
        System.out.println("8) Size and Color and Fabric in ascending");
        System.out.println("9) BACK");

        switch (Validation.onlyNumbers(1, 9)) {
            case 1:
                secondQuickWindow(1, 1);
                break;
            case 2:
                secondQuickWindow(0, 1);
                break;
            case 3:
                secondQuickWindow(1, 2);
            case 4:
                secondQuickWindow(0, 2);
            case 5:
                secondQuickWindow(1, 3);
            case 6:
                secondQuickWindow(0, 4);
            case 7:
                secondQuickWindow(1, 4);
                break;
            case 8:
                secondQuickWindow(0, 4);
                break;
            case 9:
                FirstStep.firstWindow();
                break;
        }

    }

    public void secondQuickWindow(int asc, int sortStyle) {
        System.out.println("|===================|");
        System.out.println("|Welcome In My Shop |");
        System.out.println("|===================|");
        System.out.println("");

        DammyData.generateStudents(40);

        printTShirtsBySizeColorFabric(asc, sortStyle);

        System.out.println("===================");
        System.out.println("Would you like sort with different sequence ?");
        System.out.println("Yes Press 1)");
        System.out.println("No Press 2)");
        System.out.println("===================");
        switch (Validation.onlyNumbers(1, 2)) {
            case 1:
                firstBucketWindow();
                break;
            case 2:
                printTShirtsBySizeColorFabric(asc, sortStyle);

                System.out.println("");
                System.out.println("===================");
                System.out.println("Add Item/s In Your Basket");
                System.out.println("===================");

                itemsInBasket(asc, sortStyle);
                break;
        }
    }

    public void printTShirtsBySizeColorFabric(int asc, int sortStyle) {

        switch (sortStyle) {
            case 1:
                BucketSort.sortBySize(Custom.getCustom(), asc);
                printAList(Custom.getCustom());
                break;
            case 2:
                BucketSort.sortByColor(Custom.getCustom(), asc);
                printAList(Custom.getCustom());
                break;
            case 3:
                BucketSort.sortByFabric(Custom.getCustom(), asc);
                printAList(Custom.getCustom());
                break;
            case 4:
                BucketSort.sortBySizeColorFabric(Custom.getCustom(), asc);
                printAList(Custom.getCustom());
                break;
        }
    }

    private void printAList(List<TShirt> tshirts) {
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(i + 1 + ") T-Shirt \n" + tshirts.get(i));
            System.out.println("");

        }

    }


    /* 
    In this method, the user with input choose from my dammy data,
    and fill the basket list
     */
    public void itemsInBasket(int asc, int sortStyle) {
        Basket basket = new Basket();
        boolean exit = false;
        while (!exit) {
            List<TShirt> copyList = Custom.getCustom();
            int addTshirt = Validation.onlyNumbers(1, Custom.getCustom().size());
            System.out.println("===================");
            TShirt ckeckedTshirt = Custom.getCustom().get(addTshirt - 1);

            System.out.println("===================");
            TShirt completedTshirt = new TShirt(ckeckedTshirt.getColor(), ckeckedTshirt.getSize(), ckeckedTshirt.getFabric());
            basket.addTShirt(completedTshirt);

            double totalBasketPrice = 0.0;
            System.out.println("YOUR BASKET :");
            System.out.println("");
            for (int i = 0; i < basket.getTshirts().size(); i++) {
                totalBasketPrice += basket.getTshirts().get(i).getPrice();
                System.out.println(i + 1 + ")" + basket.getTshirts().get(i));
            }
            System.out.println(" Total price : " + "\n" + totalBasketPrice + "€");
            System.out.println("");
            System.out.println("===================");
            System.out.println("Would you like add  any other T-Shirt in your Basket?");
            System.out.println("Press 1) for add, Press 2) for payment.");
            switch (Validation.onlyNumbers(1, 2)) {
                case 1:
                    printTShirtsBySizeColorFabric(asc, sortStyle);
                    System.out.println("");
                    System.out.println("===============");
                    System.out.println("Choose Another One T-Shirt");
                    continue;
                case 2:
                    // here i send the user with filled basket for pay payment.
                    SecondStep ss = new SecondStep();
                    ss.secondWindow(basket.getTshirts(), asc, sortStyle);
                    exit = true;
                    break;
            }
        }
    }
}
