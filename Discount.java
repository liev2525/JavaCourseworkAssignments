
package discount;

public class Discount {

    public static void main(String[] args) {
        //  This program calculates the sale price of an
        //item that is reularly priced at $59, with 
        //a 20 percent dicount subtracted
        
        //Establish a variable to hold the regular price
        //amount of discount, and the sale price
        double regularPrice = 59.0;
        double discount;
        double salePrice;
        //Calculate the amount of a 20% discount
        discount = regularPrice*0.2;
        //Calculate the discount by subtracting the discount from
        //the regular price
        salePrice = regularPrice - discount;
        //Display results
        System.out.println ("The sale price of an item is "+salePrice);
        
        
    }
    
}
