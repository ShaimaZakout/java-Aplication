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
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiscountPolicy bulk = new BulkDiscount(20, 9);
        DiscountPolicy dp = new BuyNItemsGetOneFree(9);
        DiscountPolicy cd = new CombinedDiscount(dp, bulk);
         System.out.println(cd.computeDiscount(10, 20));

    }

}
