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
public class Students {

    private String name;
    private String college;
    private double gpa;
    private String id;

    
    

    /**
     * @return the name
     */
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
     * @return the collage
     */
    public String getCollage() {
        return college;
    }

    /**
     * @param collage the collage to set
     */
    public void setCollage(String collage) {
        this.college = collage;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
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

    public String getReport() {
        return "{" + " Name : " + name + " , ID : " + id + " , College : " + college + " , GPA : " + gpa;

    }

}
