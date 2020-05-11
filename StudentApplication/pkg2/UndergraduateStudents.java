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
public class UndergraduateStudents extends Students{
 private String  semesterNumber;   
  private int semesterRegisteredHours;
  private int semesterSucceededHours; 
   private double semesterAverage;

 

    /**
     * @return the semesterNumber
     */
    public String getSemesterNumber() {
        return semesterNumber;
    }

    /**
     * @param semesterNumber the semesterNumber to set
     */
    public void setSemesterNumber(String semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    /**
     * @return the semesterRegisteredHours
     */
    public int getSemesterRegisteredHours() {
        return semesterRegisteredHours;
    }

    /**
     * @param semesterRegisteredHours the semesterRegisteredHours to set
     */
    public void setSemesterRegisteredHours(int semesterRegisteredHours) {
        this.semesterRegisteredHours = semesterRegisteredHours;
    }

    /**
     * @return the semesterSucceededHours
     */
    public int getSemesterSucceededHours() {
        return semesterSucceededHours;
    }

    /**
     * @param semesterSucceededHours the semesterSucceededHours to set
     */
    public void setSemesterSucceededHours(int semesterSucceededHours) {
        this.semesterSucceededHours = semesterSucceededHours;
    }

    /**
     * @return the semesterAverage
     */
    public double getSemesterAverage() {
        return semesterAverage;
    }

    /**
     * @param semesterAverage the semesterAverage to set
     */
    public void setSemesterAverage(double semesterAverage) {
        this.semesterAverage = semesterAverage;
    }
   
 @Override
   public String getReport() {
   return super.getReport()+" , Semester Number : "+semesterNumber+" , semester registered hours : "+semesterRegisteredHours+" , semester succeeded hours : "+semesterSucceededHours+" , semester average : "+semesterAverage+"}";
   } 
   
}
