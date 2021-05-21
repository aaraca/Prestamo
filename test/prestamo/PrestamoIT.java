/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author ainhoaarandacaro
 */
public class PrestamoIT {
    
    public PrestamoIT() {
    }

    @BeforeClass
    public static void BeforeClass() throws Exception {
        System.out.println("BeforeClass");
        Prestamo instance = new Prestamo();
    }

    @AfterClass
    public static void AfterClass() throws Exception {
        System.out.println("AfterClass");
    }

    @Before
    public void Before() throws Exception {
        System.out.println("Before");
         Prestamo = 0;
    }

    @After
    public void After() throws Exception {
        System.out.println("After");
    }

    /**
     * Test of main method, of class Prestamo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Prestamo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void testEstudio() {
        System.out.println("estudio");
        int cantidad = 2000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
