/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author hp
 */
public class BulkDiscount  implements DiscountPolicy{

   private double percent;
   private double minimum;

    public BulkDiscount(double percent, double minimum) {
        this.percent = percent;
        this.minimum = minimum;
    }
   
    
        @Override
    public double computeDiscount(int count, double itemCost){
        
       double discount = 1;             // 9   10  20   20 
         if (count > minimum)
         {
             discount = percent;
         }
         return percent*itemCost;
    }
}
