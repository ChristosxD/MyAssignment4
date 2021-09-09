/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.sorts;

import com.anystreameu.tshirt.models.TShirt;
import java.util.Comparator;

/**
 *
 * @author Chris
 */
public class TShirtFabricComparator implements Comparator<TShirt>{

    @Override
    public int compare(TShirt t1, TShirt t2) {
       return t1.getFabric().compareTo(t2.getFabric());
    } 
}
