/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glarmester_solution.data;

import glarmester_solution.logic.FrameType;
import glarmester_solution.logic.PriceCalculator;
import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class TopDownTest {

    private DataAccessorDatabase instance;
    private DataAccessorHardCodedValues getValues;

    public TopDownTest() {
    }

    /**
     * Test of getGlassprice method, of class DataAccessorDatabase.
     */
    @Test
    public void testGetGlassprice() throws Exception {
        System.out.println("getGlassprice");
        instance = new DataAccessorDatabase();
        getValues = new DataAccessorHardCodedValues();

        double expResult = getValues.getGlassprice();
        double result = instance.getGlassprice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getFramePrice method, of class DataAccessorDatabase.
     */
    @Test
    public void testGetFramePrice() {
        System.out.println("getFramePrice");
        instance = new DataAccessorDatabase();
        getValues = new DataAccessorHardCodedValues();

        double expResult = getValues.getFramePrice(FrameType.Simple);
        double result = instance.getFramePrice(FrameType.Simple);
        assertEquals(expResult, result, 0.0);

        expResult = getValues.getFramePrice(FrameType.Ornate);
        result = instance.getFramePrice(FrameType.Ornate);
        assertEquals(expResult, result, 0.0);

        expResult = getValues.getFramePrice(FrameType.Lavish);
        result = instance.getFramePrice(FrameType.Lavish);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetFramePriceErr() {
        System.out.println("testGetFramePriceErr");
        instance = new DataAccessorDatabase();
        getValues = new DataAccessorHardCodedValues();

        double result = instance.getFramePrice(FrameType.Test);
        assertEquals(true, Double.isNaN(result));
    }
}
