/*
 * To change this license header, choose License Headers in Project Prascerties.
 * To change this template file, choose Tools | Templates
 * and ascen the template in the editor.
 */
package com.anystreameu.tshirt.algorithmous;

import com.anystreameu.tshirt.models.Color;
import com.anystreameu.tshirt.models.Fabric;
import com.anystreameu.tshirt.models.Size;
import com.anystreameu.tshirt.models.TShirt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chris
 */
public class BucketSort {

    public static void sortBySize(List<TShirt> tshirts,int asc) {
        
        List<List> buckets = new ArrayList<>();
        
        if ( !tshirts.isEmpty()) {
            
                for (int i = 0; i < Size.values().length; i++) {
                    buckets.add(new ArrayList<TShirt>());            
                }

                for (int i =0; i < tshirts.size(); i++) {
                    int bucketNo = tshirts.get(i).getSize().ordinal();
                    buckets.get(bucketNo).add(tshirts.get(i));
                }
                
            if(asc == 1){
                tshirts.clear();
                for (int i = 0; i < buckets.size(); i++) {
                    tshirts.addAll(buckets.get(i));
                }
            }
            else{
                tshirts.clear();
                for (int i = (buckets.size()-1); i >= 0; i--) {
                    tshirts.addAll(buckets.get(i));
                }
            }
        }
        
    }
    
    
    public static void sortByColor(List<TShirt> tshirts,int asc) {
        
        List<List> buckets = new ArrayList<>();
        
        if ( !tshirts.isEmpty()) {
            
                for (int i = 0; i < Color.values().length; i++) {
                    buckets.add(new ArrayList<TShirt>());            
                }

                for (int i =0; i < tshirts.size(); i++) {
                    int bucketNo = tshirts.get(i).getColor().ordinal();
                    buckets.get(bucketNo).add(tshirts.get(i));
                }
                
            if(asc == 1){
                tshirts.clear();
                for (int i = 0; i < buckets.size(); i++) {
                    tshirts.addAll(buckets.get(i));
                }
            }
            else{
                tshirts.clear();
                for (int i = (buckets.size()-1); i >= 0; i--) {
                    tshirts.addAll(buckets.get(i));
                }
            }
        }
    }
    
    
    public static void sortByFabric(List<TShirt> tshirts,int asc) {
        
        List<List> buckets = new ArrayList<>();
        
        if ( !tshirts.isEmpty()) {
            
                for (int i = 0; i < Fabric.values().length; i++) {
                    buckets.add(new ArrayList<TShirt>());            
                }

                for (int i =0; i < tshirts.size(); i++) {
                    int bucketNo = tshirts.get(i).getFabric().ordinal();
                    buckets.get(bucketNo).add(tshirts.get(i));
                }
                
            if(asc == 1){
                tshirts.clear();
                for (int i = 0; i < buckets.size(); i++) {
                    tshirts.addAll(buckets.get(i));
                }
            }
            else{
                tshirts.clear();
                for (int i = (buckets.size()-1); i >= 0; i--) {
                    tshirts.addAll(buckets.get(i));
                }
            }
        }
    }
    
    
    public static void sortBySizeColorFabric(List<TShirt> tshirts,int asc) {
        if ( !tshirts.isEmpty()) {
            
            BucketSort.sortByFabric(tshirts,asc);
            BucketSort.sortByColor(tshirts,asc);
            BucketSort.sortBySize(tshirts, asc);
            
        }
    }
}
