/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. here
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A class to model Student Objects
 * each student has: a name
 * each student can: say their name (getName)
 * 
 * @author dancye May, 2018
 */
public class Student 
{
    private String name ="test1";

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
    
    
}
