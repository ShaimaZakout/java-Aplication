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
public class BuyNItemsGetOneFree implements DiscountPolicy {

    private int numberOfItems;

    public BuyNItemsGetOneFree(int n) {
        numberOfItems = n;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        double discount = 0;
        if (count > numberOfItems) {
            discount = (count / numberOfItems) * itemCost;             //10/9*20
        }
        return discount;
    }
}
