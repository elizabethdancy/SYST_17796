/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A class that models part-time students
 * Students can have a maximum of 4 classes
 * @author dancye
 */
public class PartTimeStudent 
{
    public final int MAX_CLASSES=4;
    private int numClasses;
    
    /**
     * A method to get the number of classes for a part-time student
     * @return the number of classes
     */
    private int getNumClasses()
    {
        return numClasses;
    }
}
