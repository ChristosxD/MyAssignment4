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
public class QuickSort {

    public static void quickSort(List<TShirt> tshirts, int min, int max, Comparator<TShirt> comparator, int asc){ 
         if (min < max) {
            int pi;
            
            pi = partition(tshirts, min, max, comparator, asc);
            quickSort(tshirts, min, pi - 1, comparator, asc);
            quickSort(tshirts, pi + 1, max, comparator, asc);

        }
         
    }

    public static void swap(List<TShirt> tshirts, int x , int y) {
        TShirt temp = tshirts.get(x);
        tshirts.set(x,tshirts.get(y));
        tshirts.set(y,temp);
    }
 
   public static int partition(List<TShirt> tshirts, int min, int max, Comparator<TShirt> comparator, int asc) {
        TShirt pivot = tshirts.get(max);
        int i = min - 1;
        for (int j = min; j < max; j++) {
            if (asc == 1) {
                if (comparator.compare(tshirts.get(j), pivot) < 0) {
                    i++;
                    swap(tshirts, i, j);
                }
            } else {
                if (comparator.compare(tshirts.get(j), pivot) > 0) {
                    i++;
                    swap(tshirts, i, j);
                }
            }
        }
        swap(tshirts, i + 1, max);
        return (i + 1);
    }
}
