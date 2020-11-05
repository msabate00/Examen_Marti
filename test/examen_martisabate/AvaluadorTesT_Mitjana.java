/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_martisabate;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Marti Sabaté
 */
@RunWith(Parameterized.class)
public class AvaluadorTesT_Mitjana {
     private Avaluador instance;
//    private final double notaMin = 0.0;
//    private final double notaMax = 10.0;
//    private final double notaSupe = 5.0;
    
    @Parameter(0)
    public Estudiant estudiant0;
    
    @Parameter(1)
    public double mitjana;

    @Parameters
    public static Collection<Object[]> data() {





        Object[][] data = new Object[][]{
            {new Estudiant("Manolo",7,3,2), 4},
            {new Estudiant("Man",0,5,10), 5},
            {new Estudiant("Mo",2,2,2), 2},
            {new Estudiant("a",1,2,3), 2},
            {new Estudiant("b",6,5,4), 5},
            {new Estudiant("c",7,8,9), 8},
            {new Estudiant("d",10,5,5), 6.666},
            {new Estudiant("e",8,1,5), 4.666},
            {new Estudiant("f",8,1,1), 3.333},
            {new Estudiant("g",8,5,5), 6},
            {new Estudiant("h",8,4,5), 5.666},
            {new Estudiant("i",8,5,4), 5.666},
            {new Estudiant("j",2,5,2), 3},
            {new Estudiant("k",8,6,5), 6.3333},
            {new Estudiant("l",9,5,6), 6.6666},
        
        };
        
    
               
            


        return Arrays.asList(data);

    }
    
    
    
    public AvaluadorTesT_Mitjana() {
     
        
    }
    
    @BeforeClass
    public static void setUpClass() {
   
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        
      instance = new Avaluador(10,0,5);
       //Estudiant estudiant55 = new Estudiant("Manolo",2,5,5);
        
       assertEquals(mitjana, instance.mitjana(estudiant0),0.001);
        
        

    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
   
    
}
