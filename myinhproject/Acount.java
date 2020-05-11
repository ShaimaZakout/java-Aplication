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
public class Acount {

    private int accounntNumber;
    private double totaleBalance;
    private String holderName;
    private int branchId;

    public Acount(int accounntNumber, double totaleBalance, String holderName, int branchId) {
        this.accounntNumber = accounntNumber;
        this.totaleBalance = totaleBalance;
        this.holderName = holderName;
        this.branchId = branchId;
    }
    
    
    
    public double deposet(double amount) {
        if (amount >0) {
            return totaleBalance += amount;
        } else {
            return getTotaleBalance();
        }
    }

    public double draw(double amount) {
        if (amount <= getTotaleBalance()) {
            return totaleBalance -= amount;
        } else {
            return getTotaleBalance();
        }}
    
        public double getBalance(){
        return getTotaleBalance();}

    /**
     * @return the accounntnumber
     */
    public int getAccounntnumber() {
        return accounntNumber;
    }

    /**
     * @param accounntnumber the accounntnumber to set
     */
    public void setAccounntnumber(int accounntnumber) {
        this.accounntNumber = accounntnumber;
    }

    /**
     * @param totaleBalance the totaleBalance to set
     */
    public void setTotaleBalance(double totaleBalance) {
        this.totaleBalance = totaleBalance;
    }

   

    /**
     * @return the accounntNumber
     */
    public int getAccounntNumber() {
        return accounntNumber;
    }

    /**
     * @param accounntNumber the accounntNumber to set
     */
    public void setAccounntNumber(int accounntNumber) {
        this.accounntNumber = accounntNumber;
    }

    /**
     * @return the totaleBalance
     */
    public double getTotaleBalance() {
        return totaleBalance;
    }

    /**
     * @return the holderName
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * @param holderName the holderName to set
     */
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * @return the branchId
     */
    public int getBranchId() {
        return branchId;
    }

    /**
     * @param branchId the branchId to set
     */
    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
    public String getReport(){
        return "Holder Name : "+holderName+" , Account Number : "+ this.holderName+" , Balance : "+totaleBalance+" , Branch Id : "+branchId;
        
}    
        
}
 
