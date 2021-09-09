
package com.anystreameu.tshirt.models;


public class TShirt implements Comparable<TShirt> {
    private Color color;
    private Size size;
    private Fabric fabric;
    private double price;

    public TShirt() {
    }




   
    public TShirt(Color color, Size size, Fabric fabric) {
        double starterPrice = 20;
        this.color = color;
        this.size = size;
        this.fabric = fabric;  
        this.price = starterPrice + getColor().getPrice()
                                  + getSize().getPrice()
                                  + getFabric().getPrice(); 
    }



    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        
                return String.format(
                "%s\t%s\t%s\t", size,color,fabric);

    }

    @Override
    public int compareTo(TShirt o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


    
    
    
}
