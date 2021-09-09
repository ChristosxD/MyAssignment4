/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.data;

import com.anystreameu.tshirt.custom.Custom;
import com.anystreameu.tshirt.models.Color;
import com.anystreameu.tshirt.models.Fabric;
import com.anystreameu.tshirt.models.Size;
import com.anystreameu.tshirt.models.TShirt;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;

/**
 *
 * @author Chris
 */
public class DammyData {

    public static List<TShirt> generateStudents(int number) {
        Random rand = new Random();
        Custom custom = new Custom();
        List<TShirt> tshirts = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            tshirts.add(new TShirt(Color.getRandomEnum(), Size.getRandomEnum(), Fabric.getRandomEnum()));

        }
        custom.addTshirt(tshirts);
        return tshirts;
    }

}
