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
public class CheckingAccount extends Acount {

    private double overdraft;

    public CheckingAccount(double overdraft, int accounntNumber, double totaleBalance, String holderName, int branchId) {
        super(accounntNumber, totaleBalance, holderName, branchId);
        this.overdraft = overdraft;
    }

    /**
     * @return the overdraft
     */
    public double getOverdraft() {
        return overdraft;
    }

    /**
     * @param overdraft the overdraft to set
     */
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     *
     * @return
     */
    @Override
    public String getReport() {
        return super.getReport() + " , overdraft : " + overdraft;
    }

}
