/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.custom;

import com.anystreameu.tshirt.models.TShirt;
import java.util.List;

/**
 *
 * @author Chris
 */
public class Custom {
    private static List<TShirt> custom;

    public void addTshirt(List<TShirt> tshirts){
        this.custom = tshirts;
    }
    
    public static  List<TShirt> getCustom() {
        return custom;
    }

    public  void setCustom(List<TShirt> custom) {
        this.custom = custom;
    }
    

}
