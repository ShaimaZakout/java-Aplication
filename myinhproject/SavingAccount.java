/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopaplication.myinhproject;

/**
 *
 * @author hp
 */
public class SavingAccount extends Acount {

    private double intesRate;
   private int withdrawLimt=10;

    public SavingAccount(double intesRate, int accounntNumber, double totaleBalance, String holderName, int branchId) {
        super(accounntNumber, totaleBalance, holderName, branchId);
        this.intesRate = intesRate;
    }
   
   

    /**
     * @return the intesRate
     */
    public double getIntesRate() {
        return intesRate;
    }

    /**
     * @param intesRate the intesRate to set
     */
    public void setIntesRate(double intesRate) {
        this.intesRate = intesRate;
    }

    /**
     * @return the withdrawLimt
     */
    public int getWithdrawLimt() {
        return withdrawLimt;
    }

    /**
     * @param withdrawLimt the withdrawLimt to set
     */
    public void setWithdrawLimt(int withdrawLimt) {
        this.withdrawLimt = withdrawLimt;
    }
   
    @Override
    public String getReport(){
   return super.getReport()+" , IntesRate : "+intesRate+" , withdrawLimt :  "+withdrawLimt;
}
    
   
}