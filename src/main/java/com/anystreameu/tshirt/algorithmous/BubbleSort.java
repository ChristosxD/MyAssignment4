/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.algorithmous;

import com.anystreameu.tshirt.models.TShirt;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Chris
 */
public class BubbleSort {

    public static void bubbleSort(List<TShirt> tshirts,
            Comparator<TShirt> comparator, int asc) {

       
        boolean sorted;

        for (int i = 0; i < tshirts.size(); i++) {
            sorted = true;

            for (int j = 1; j < (tshirts.size() - i); j++) {
                if (asc == 1) {
                    if (comparator.compare(tshirts.get(j - 1), tshirts.get(j)) > 0) {
                        swapStudentArrayList(tshirts, j, j - 1);
                        sorted = false;
                    }
                } else {
                    if (comparator.compare(tshirts.get(j - 1), tshirts.get(j)) < 0) {
                        swapStudentArrayList(tshirts, j, j - 1);

                        sorted = false;
                    }
                }
            }
        }
        
    }
   public static  List<TShirt> swapStudentArrayList(List<TShirt> tshirts,
            int x, int y){
        
        TShirt temp; 
        
        temp = tshirts.get(y);
        tshirts.set(y, tshirts.get(x));
        tshirts.set(x, temp);
        
        return tshirts; 
    } 

}
