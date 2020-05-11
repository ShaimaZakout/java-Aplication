/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopaplication.BankcountSimpleApplication;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class bank {

    public bank() {
    }

    private String name;
    private String phonNum;
    private String id;
    private double amount;
    ArrayList<bank> acount = new ArrayList();

    public bank(String name, String phonNum, String id, double amount) {
        this.name = name;
        this.phonNum = phonNum;
        this.id = id;
        this.amount = amount;
    }

    Scanner s = new Scanner(System.in);

    @Override
    public String toString() {
        return " { " + "name=" + name + ", phonNum=" + phonNum + ", id=" + id + ", amount=" + amount + " }";
    }

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phonNum
     */
    public String getPhonNum() {
        return phonNum;
    }

    /**
     * @param phonNum the phonNum to set
     */
    public void setPhonNum(String phonNum) {
        this.phonNum = phonNum;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void Menu(){
        while (true) {
            System.out.println("1- Creat a new accunt");
            System.out.println("2- Deposit an amount in the account");
            System.out.println("3- withdraw an amount from the account");
            System.out.println("4– Delete a bank account");
            System.out.println("5- Search for a bank account");
            System.out.println("6- View all bank accounts");
            System.out.println("7- Exit");
            System.out.println("Pleas, Enter the type of operation");
            int operation = s.nextInt();
            switch (operation) {
                case 1:
                    CreatAcoount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdrow();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    sersh();
                    break;
                case 6:
                    view();
                    break;
                    case 7:exit();
                        break;
                default:
                    System.out.println("Invailed operator :(");
            }
        }

    }

    public void CreatAcoount() {
        s.nextLine();
        System.out.println("*$* Creat a new accunt *$* ");
        System.out.println("Enter the custamers name ");
        String nam = s.nextLine();
        System.out.println("Enter the custamers phon Number ");
        String phonNumber = s.nextLine();
        System.out.println("Enter the custamers amount ");
        double amoun = s.nextDouble();
        System.out.println("Enter id ");
         String id = s.next();
        
        acount.add(new bank(name, phonNum, id, amount));
    }

    public void deposit() {s.nextLine();
        System.out.println("*$* Deposit an amount in the account *$*");
        System.out.println("Enter the custamer id you want to deposit money in his account");
        String id1 = s.next();
        System.out.println("Enter the amount you want to deposit :");
        double amount1 = s.nextDouble();
        for (bank b : acount) {
            if (id1.equals(b.getId())) {
                if (b.getAmount() <= 0) {
                    System.out.println("$$$ Deposit amount is Invalid $$$ ");
                } else {
                    System.out.println("Balance before deposit:" + b.getAmount());
                    b.setAmount(b.getAmount() + amount1);
                    System.out.println("Balance after deposit: " + b.getAmount());
                }

            } else {
                System.out.println("Id is not exist ");
            }
        }

    }

    public void withdrow() {s.nextLine();
        System.out.println("*$* withdraw an amount from the account *$*");
        System.out.println("Enter the custamer id you want to withdraw money in his account");
        String indextW = s.nextLine();
        System.out.println("Enter the amount you want to withdraw");
        double amount2 = s.nextDouble();
        for (bank b : acount) {
            if (b.getId().equals(indextW)) {
                if (amount2 <= 0) {
                    System.out.println("$$$ Withdraw amount is Invalid $$$");
                } else {
                    if (b.getAmount() >= amount2) {
                        System.out.println("Balance before withdraw : " + b.getAmount());
                        b.setAmount(b.getAmount() - amount2);
                        System.out.println("Balance after withdraw :  " + b.getAmount());
                    } else {
                        System.out.println("you can not withdraw amount :( ");
                    }
                }
            } else {
                System.out.println("Id is not exist ");
            }

        }
    }

    public void delete() {s.nextLine();
        System.out.println("*$* Delete a bank account *$*");
        System.out.println("Enter the custamer id you want to delete money in his account");
        String indextDe = s.nextLine();
        for (bank b : acount) {
            if (indextDe.equals(b.getId())) {
                acount.remove(b);
                break;
            } else {
                System.out.println("Id is not exist ");
            }

        }
    }

    public void sersh() {s.nextLine();
        boolean isexist = false;

        System.out.println("*$* Search for a bank account *$*");
        System.out.println("Enter the custamer name you want to search of ");
        System.out.println("Enter the custamer id ");
        String iD = s.nextLine();
        for (bank b : acount) {
            if (iD.equals(b.getId())) {
                isexist = true;
                break;
            } else {
                isexist = false;
            }
        }
        if (isexist) {
            System.out.println("bank account exist :)");
        } else {
            System.out.println("bank account not exist :(");
        }
    }

    public void view() {
        for (bank b : acount) {
            System.out.println(b.toString());
        }
    }

    public void exit() {s.nextLine();
        System.out.println("if you want to continue Enter,(ok).or Enter(done)to exit . ");
        String again = s.next();

        if (again.equalsIgnoreCase("ok")) {
            return;
        } else {
            System.exit(0);
        }
    }
}
