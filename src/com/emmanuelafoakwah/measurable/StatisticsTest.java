package com.emmanuelafoakwah.measurable;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 *	Statistics Class JUnit Tests
 *	@author Emmanuel Afoakwah
 *	@version 17.11.2018
 */

public class StatisticsTest {

    public static final double TOLERANCE = 0.00001;

    private Measurable invoice1, invoice2, invoice3, invoice4, invoice5;
    private Measurable patient1, patient2, patient3, patient4, patient5;

    @Before
    public void setUp(){
        invoice1 = new Invoice("0123","01-02-03",123.45);
        invoice2 = new Invoice("4567","04-05-06",678.89);
        invoice3 = new Invoice("8912","07-08-09",1234.56);
        invoice4 = new Invoice("3456","10-11-12",7891.23);
        invoice5 = new Invoice("7891","13-14-15",4567.89);

        patient1 = new Patient("Alex",20,75.1);
        patient2 = new Patient("Bryson",30,80.2);
        patient3 = new Patient("Calvin",40,85.3);
        patient4 = new Patient("Debbie",25,60.4);
        patient5 = new Patient("Ellie",35,70.5);
    }

    /** Testing maximum function using list of invoices */
    @Test
    public void test1() {
        ArrayList<Measurable> invoiceList = new ArrayList<>();
        invoiceList.add(invoice1);
        invoiceList.add(invoice2);
        invoiceList.add(invoice3);
        invoiceList.add(invoice4);
        invoiceList.add(invoice5);

        double expectedMax = 7891.23;
        double actualMax = Statistics.maximum(invoiceList);

        assertEquals(expectedMax, actualMax, TOLERANCE);

    }

    /** Testing maximum function using list of patients */
    @Test
    public void test2() {
        ArrayList<Measurable> patientList = new ArrayList<>();
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);

        double expectedMax = 85.3;
        double actualMax = Statistics.maximum(patientList);

        assertEquals(expectedMax, actualMax, TOLERANCE);
    }

    /** Testing average function using list of invoices */
    @Test
    public void test3() {
        ArrayList<Measurable> invoiceList = new ArrayList<>();
        invoiceList.add(invoice1);
        invoiceList.add(invoice2);
        invoiceList.add(invoice3);
        invoiceList.add(invoice4);
        invoiceList.add(invoice5);

        double expectedAvg = 2899.204;
        double actualAvg = Statistics.average(invoiceList);

        assertEquals(expectedAvg, actualAvg, TOLERANCE);
    }

    /** Testing average function using list of patients */
    @Test
    public void test4() {
        ArrayList<Measurable> patientList = new ArrayList<>();
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);

        double expectedAvg = 74.3;
        double actualAvg = Statistics.average(patientList);

        assertEquals(expectedAvg, actualAvg, TOLERANCE);
    }

    /** Testing standard deviation function using list of invoices */
    @Test
    public void test5() {
        ArrayList<Measurable> invoiceList = new ArrayList<>();
        invoiceList.add(invoice1);
        invoiceList.add(invoice2);
        invoiceList.add(invoice3);
        invoiceList.add(invoice4);
        invoiceList.add(invoice5);

        double expectedStd = 3282.92859826101;
        double actualStd = Statistics.standardDeviation(invoiceList);

        assertEquals(expectedStd, actualStd, TOLERANCE);
    }

    /** Testing standard deviation function using list of patients */
    @Test
    public void test6() {
        ArrayList<Measurable> patientList = new ArrayList<>();
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);

        double expectedStd = 9.54070228023074;
        double actualStd = Statistics.standardDeviation(patientList);

        assertEquals(expectedStd, actualStd, TOLERANCE);
    }

    /** Testing statistics functions using list of single invoice */
    @Test
    public void test7() {
        Measurable invoice6 = new Invoice("987654321", "90-80-70", 543.21);
        ArrayList<Measurable> invoiceList = new ArrayList<>();
        invoiceList.add(invoice6);
        double expectedMax = 543.21;
        double actualMax = Statistics.maximum(invoiceList);

        assertEquals(expectedMax, actualMax, TOLERANCE);

        double expectedAvg = 543.21;
        double actualAvg = Statistics.average(invoiceList);
        assertEquals(expectedAvg, actualAvg, TOLERANCE);

        double expectedStd = Double.NaN;
        double actualStd = Statistics.standardDeviation(invoiceList);
        assertEquals(expectedStd, actualStd, TOLERANCE);
    }

    /** Testing statistics functions using list of single patient */
    @Test
    public void test8() {
        Measurable patient6 = new Patient("Frank", 42, 86);
        ArrayList<Measurable> patientList = new ArrayList<>();
        patientList.add(patient6);

        double expectedMax = 86;
        double actualMax = Statistics.maximum(patientList);

        assertEquals(expectedMax, actualMax, TOLERANCE);

        double expectedAvg = 86;
        double actualAvg = Statistics.average(patientList);
        assertEquals(expectedAvg, actualAvg, TOLERANCE);

        double expectedStd = Double.NaN;
        double actualStd = Statistics.standardDeviation(patientList);
        assertEquals(expectedStd, actualStd, TOLERANCE);
    }

    /** Testing statistics functions using list of invoices */
    @Test
    public void test9() {
        Measurable invoice6 = new Invoice("13579", "12-34-56", 987.56);
        Measurable invoice7 = new Invoice("24680", "78-90-12", 123.45);
        Measurable invoice8 = new Invoice("18346", "34-56-78", 3456.78);
        Measurable invoice9 = new Invoice("92745", "90-12-34", 9876.54);

        ArrayList<Measurable> invoiceList = new ArrayList<>();
        invoiceList.add(invoice6);
        invoiceList.add(invoice7);
        invoiceList.add(invoice8);
        invoiceList.add(invoice9);

        double expectedMax = 9876.54;
        double actualMax = Statistics.maximum(invoiceList);

        assertEquals(expectedMax, actualMax, TOLERANCE);

        double expectedAvg = 3611.0825;
        double actualAvg = Statistics.average(invoiceList);
        assertEquals(expectedAvg, actualAvg, TOLERANCE);

        double expectedStd = 4409.316565;
        double actualStd = Statistics.standardDeviation(invoiceList);
        assertEquals(expectedStd, actualStd, TOLERANCE);
    }

    /** Testing statistics functions using list of patients */
    @Test
    public void test10() {

        Measurable patient6 = new Patient("Gareth", 16, 70.2);
        Measurable patient7 = new Patient("Harry", 18, 75.4);
        Measurable patient8 = new Patient("Imogen", 21, 65.6);
        Measurable patient9 = new Patient("Jodie", 30, 68.8);
        Measurable patient10 = new Patient("Kelly", 50, 58.2);

        ArrayList<Measurable> patientList = new ArrayList<>();
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);
        patientList.add(patient5);
        patientList.add(patient6);
        patientList.add(patient7);
        patientList.add(patient8);
        patientList.add(patient9);
        patientList.add(patient10);

        double expectedMax = 85.3;
        double actualMax = Statistics.maximum(patientList);

        assertEquals(expectedMax, actualMax, TOLERANCE);

        double expectedAvg = 70.927272;
        double actualAvg = Statistics.average(patientList);
        assertEquals(expectedAvg, actualAvg, TOLERANCE);

        double expectedStd = 7.9786077;
        double actualStd = Statistics.standardDeviation(patientList);
        assertEquals(expectedStd, actualStd, TOLERANCE);
    }

}