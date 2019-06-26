package com.emmanuelafoakwah.measurable;

import java.util.ArrayList;

/**
 *	Statistics Class, designed to make use of the Measurable interface
 *	@author Emmanuel Afoakwah
 *	@version 17.11.2018
 */

public class Statistics {

    /**
     * Maximum function, calculates max from arraylist
     * @param elements The arraylist on which to calculate the maximum
     * @return The maximum value of the arraylist
     */
    public static double maximum(ArrayList<Measurable> elements){
        double max = 0;

        /* For loop checking each element in numbers array
         *  Loop Invariant: i>=0 && i<elements.size()
         *  i.e) loop  continues if i is still within range of array (and starts at 0)
         *  Loop Termination: i>=elements.size()
         *  i.e) loop terminates if outside the range of the array
         */
        for(int i = 0; i < elements.size(); i++){
            /*
             * If this is the first element assign it as the maximum
             * If not compare this element to the current maximum
             * If it is larger -> assign (i) as the maximum
             */
            if( i==0 ){
                max = elements.get(i).getValue();
            }else if( elements.get(i).getValue() > max ){
                max = elements.get(i).getValue();
            }
        }
        return max;
    }

    /**
     * Average function, calculates average from arraylist
     * @param elements The arraylist on which to calculate the average
     * @return The average value of the arraylist
     */
    public static double average(ArrayList<Measurable> elements){
        double sum = 0;

        /* For loop checking each element in numbers array
         *  Loop Invariant: i>=0 && i<elements.size()
         *  i.e) loop  continues if i is still within range of array (and starts at 0)
         *  Loop Termination: i>=elements.size()
         *  i.e) loop terminates if outside the range of the array
         */
        for(int i = 0; i < elements.size(); i++){
            sum += elements.get(i).getValue();
        }
        return (sum / (double) elements.size());
    }

    /**
     * Standard Deviation function, calculates standard deviation from arraylist
     * @param elements The arraylist on which to calculate the standard deviation
     * @return The standard deviation value of the arraylist
     */
    public static double standardDeviation(ArrayList<Measurable> elements){
        double average = average(elements);
        double sumOfSquaredDifferences = 0;

        /* For loop checking each element in numbers array
         *  Loop Invariant: i>=0 && i<elements.size()
         *  i.e) loop  continues if i is still within range of array (and starts at 0)
         *  Loop Termination: i>=elements.size()
         *  i.e) loop terminates if outside the range of the array
         */
        for(int i = 0; i < elements.size(); i++){
            sumOfSquaredDifferences += Math.pow((elements.get(i).getValue() - average), 2);
        }
        return Math.sqrt( (sumOfSquaredDifferences) / (elements.size()-1) );
    }

}
