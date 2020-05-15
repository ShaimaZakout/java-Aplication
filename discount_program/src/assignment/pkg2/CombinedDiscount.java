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
public class CombinedDiscount implements DiscountPolicy {

    private DiscountPolicy first, second;

    public CombinedDiscount(DiscountPolicy firstDiscount, DiscountPolicy secondDiscount) {
        first = firstDiscount;
        second = secondDiscount;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        double comp1=first.computeDiscount(count, itemCost) ;
        double comp2=second.computeDiscount(count, itemCost);
         if (comp1<= comp2) {
            System.out.println("Discount for second parmeter is the maximum value:");
            return comp2;

        } else {
         System.out.println("Discount for first parmeter is the maximum value:");

            return comp1;
        }

    }
}
