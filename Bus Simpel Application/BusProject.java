/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopaplication.BusSimpelApplication;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class BusProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[28];
        Scanner s = new Scanner(System.in);
        boolean iscont = true;
        while (true) {
            System.out.println("1. Display number of available seats. \n"
                    + "2. Display seat status for all seats\n"
                    + "3. Reserve seat(s).\n"
                    + "4. Delete reservation(s). \n" + "5. Exit. ");
            System.out.print("Please select your choice[1,2,3,4, or 5] : ");
            int input = s.nextInt();
            switch (input) {
                case 1:
                    int total = 0;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] == 0) {
                            total++;
                        }
                    }
                    System.out.print("Number of available seats = " + total + "\n");
                    System.out.println("Press Enter key to continue ...");
                    break;
                case 2:

                    for (int i = 0; i < a.length; i++) {
                        if (i % 4 == 0) {
                            System.out.println("");
                        }

                        if (a[i] == 0) {
                            System.out.printf("%s %3d %3s", "[", i + 1, "]");
                        } else {
                            System.out.print("Reserved");
                        }
                    }
                    System.out.println("");

                    System.out.println("Press Enter key to continue . . .");
                    s.nextLine();
                    s.nextLine();
                    break;
                case 3:
                    System.out.println("");
                    int total2 = 0;

                    for (int i = 0; i < a.length; i++) {
                        if (i % 4 == 0) {
                            System.out.println("");
                        }

                        if (a[i] == 0) {
                            System.out.printf("%s %3d %3s", "[", i + 1, "]");
                            total2++;
                        } else {
                            System.out.print(" Reserved");
                        }
                    }
                    System.out.println("");
                    if (total2 == 0) {
                        System.out.println("Sorry, there are no available seats.");
                    } else {
                        System.out.print("there are " + total2 + "seat avaliple please enter number requrd of seat :");
                        int reqSeat = s.nextInt();
                        if (reqSeat > total2) {
                            System.out.println("Error: Insufficient available seats.");
                        } else if (reqSeat <= 0) {
                            System.out.println("Error: Invalid number of seats.");
                        } else {
                            boolean iscorrect = false;
                            for (int i = 0; i < reqSeat; i++) {
                                System.out.print("Enter seat number of requrment ");

                                int requrmentNum = s.nextInt();
                                if (0 <= requrmentNum && requrmentNum < 28) {
                                    if (a[requrmentNum] == 1) {
                                        iscorrect = true;
                                    } else {
                                        a[requrmentNum] = 1;
                                    }
                                }
                            }
                            if (iscorrect) {
                                System.out.println("Error: One or more requiredseats is already reserved");
                            } else {
                                System.out.println("Required seats successfully reserved");

                            }
                        }
                    }

                    System.out.println("Press Enter key to continue . . .");

                    break;

                case 4:

                    int total3 = 0;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] == 1) {
                            System.out.print("Reserved\n");
                            total3++;
                        } else {
                            System.out.print("[" + i + "]\n");
                        }
                    }
                    System.out.println("pleas enter re number of delet");
                    int seatDeleat = s.nextInt();
                    if (seatDeleat > total3) {
                        System.out.println("erorr");
                    } else {
                        boolean iscorrect2 = false;

                        for (int i = 0; i < seatDeleat; i++) {
                            System.out.print("Enter seat number of requrment ");
                            int requrmentNum = s.nextInt();
                            if (a[requrmentNum] == 0) {
                                iscorrect2 = true;
                            } else {
                                a[requrmentNum] = 0;
                            }
                        }
                        if (iscorrect2) {
                            System.out.println("Error: One or more requiredseats is already reserved");
                        } else {
                            System.out.println("Required seats successfully reserved");

                        }
                    }

                    System.out.println("Press Enter key to continue . . .");

                    break;

                case 5:
                    break;

                default:
                    System.out.println(" invalid choice is entered");

            }
        }

    }
}
