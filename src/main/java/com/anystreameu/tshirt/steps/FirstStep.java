/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.steps;

import com.anystreameu.tshirt.algorithmous.BubbleSort;
import com.anystreameu.tshirt.custom.Basket;
import com.anystreameu.tshirt.custom.Custom;
import com.anystreameu.tshirt.data.DammyData;
import com.anystreameu.tshirt.models.TShirt;
import com.anystreameu.tshirt.sorts.TShirtChainComparator;
import com.anystreameu.tshirt.sorts.TShirtColorComparator;
import com.anystreameu.tshirt.sorts.TShirtFabricComparator;
import com.anystreameu.tshirt.sorts.TShirtSizeComparator;
import com.anystreameu.tshirt.utilities.Validation;
import java.util.List;

/**
 *
 * @author Chris
 */
public class FirstStep {

    
    
    public static void firstWindow() {
  
    
        System.out.println("|===================|");
        System.out.println("Choose Sort Algorithm");
        System.out.println("|===================|");
        System.out.println("1) Quick Sort");
        System.out.println("2) Bubble Sort");
        System.out.println("3) Bucket Sort");
        switch (Validation.onlyNumbers(1, 3)) {
            case 1:
                QuickStep qs = new QuickStep();
                qs.firstQuickWindow();
            case 2:
                BubbleSteps fs =  new BubbleSteps();
                fs.firstBubbleWindow();
            case 3:
                BucketStep bs = new BucketStep();
                bs.firstBucketWindow();     
        }
    }
}
