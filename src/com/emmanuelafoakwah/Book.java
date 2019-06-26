package com.emmanuelafoakwah;

/**
 *	Basic book class with a constructor
 *	@author Emmanuel Afoakwah
 *	@version 23.10.2018
 */

public class Book {

    private String title;
    private int year;
    private String isbn;

    /**
     *	Book Constructor
     *	@param title is the title of the book
     *	@param year is the year of publication
     *	@param isbn is the ISBN of the book
     */
    public Book(String title, int year, String isbn){
        this.title = title;
        this.year = year;
        this.isbn = isbn;
    }

    /** @return the title of the book as a String */
    public String getTitle(){ return title; }

    /** @return the year of publication as an int */
    public int getYear(){ return year; }

    /** @return the isbn of the book as a string */
    public String getIsbn(){ return isbn; }

    /** Sets the title of the book
     *   @param title is the title to change to
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     *   Prints the title, year and ISBN of the book
     *   @return a string summarising the book
     */
    public String toString(){
        return "Title: " + title
                + "Year: " + year
                + "ISBN: " + isbn;
    }

}
