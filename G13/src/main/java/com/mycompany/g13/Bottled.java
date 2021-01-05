package com.mycompany.g13;

import static com.mycompany.g13.SystemClass.givenOrder;

public class Bottled extends Products
{

    public Bottled(String product_name, double product_price) 
    {
        super(product_price, product_name);
    }
    
    public void calculate_and_add() {
        if(givenOrder.size() == 0 || (!(givenOrder.get(givenOrder.size() - 1) instanceof Drinks) && !(givenOrder.get(givenOrder.size() - 1).getType().equals("Size"))))
        {
            Products.addSub_price(this.getProduct_price());
            Products.setTotal_price();
            Products.setTaxed_price();
            SystemClass.givenOrder.add(this);
        }
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
        
}
