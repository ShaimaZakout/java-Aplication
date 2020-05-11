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
public class GraduateStudents extends Students {

    private String graduationDate;
    private int certificateNumber;

   

    
    /**
     * @return the graduationDate
     */
    public String getGraduationDate() {
        return graduationDate;
    }

    /**
     * @param graduationDate the graduationDate to set
     */
    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    /**
     * @return the certificateNumber
     */
    public int getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * @param certificateNumber the certificateNumber to set
     */
    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    @Override
    public String getReport() {
        return super.getReport() + " , graduation date : " + graduationDate + " , certificate number : " + certificateNumber+"}";

    }
}
