/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopaplication.BankcountSimpleApplication;

/**
 *
 * @author hp
 */
public class BankAcountProject2 {

    public static void main(String[] args) {
        try {
            bank b = new bank();
            b.Menu();
        } catch (Exception e) {
            System.out.println(e + " / " + e.getMessage());
        }

    }

}
