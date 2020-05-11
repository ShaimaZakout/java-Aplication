/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopaplication.StudentApplication.pkg2;

/**
 *
 * @author hp
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GraduateStudents gs1 = new GraduateStudents();
        GraduateStudents gs2 = new GraduateStudents();
        UndergraduateStudents us1 = new UndergraduateStudents();
        UndergraduateStudents us2 = new UndergraduateStudents();
        gs1.setCollage("IT");
        gs1.setCertificateNumber(3);
        gs1.setGpa(95);
        gs1.setGraduationDate("23/8");
        gs1.setId("12555");
        gs1.setName("Aya");
        gs2.setCollage("IT");
        gs2.setCertificateNumber(5);
        gs2.setGpa(96);
        gs2.setGraduationDate("23/8");
        gs2.setId("12555");
        gs2.setName("sara");
        us1.setCollage("engineering");
        us1.setGpa(89);
        us1.setName("Shaimaa");
        us1.setId("12325");
        us1.setSemesterAverage(88);
        us1.setSemesterNumber("3");
        us1.setSemesterRegisteredHours(16);
        us1.setSemesterSucceededHours(32);
        us1.setCollage("engineering");
        us2.setGpa(70);
        us2.setName("Ola ");
        us2.setId("12325");
        us2.setSemesterAverage(88);
        us2.setSemesterNumber("4");
        us2.setSemesterRegisteredHours(18);
        us2.setSemesterSucceededHours(85);
        us2.setCollage("engineering");

        //طريقة(لو ما بدنا نعمل  casting)  
        Students[] s = {us1, us2, gs1, gs2};
        for (Students a : s) {
            System.out.println(a.getReport());
            System.out.println("\n*********************************************************************************" + " \n");
        }

        //طريقة ثانية(من خلال عمل casting )     
        for (Students a : s) {
            if (a instanceof GraduateStudents) {
                System.out.println(((GraduateStudents) a).getReport());
            } else if (a instanceof UndergraduateStudents) {
                System.out.println(((UndergraduateStudents) a).getReport());
            }
            System.out.println("\n*********************************************************************************" + " \n");
        }

    }

}
