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
public class AvaluadorTest_MitjanaSiSupera {
     private Avaluador instance;

    
    @Parameter(0)
    public Estudiant estudiant0;
    
    @Parameter(1)
    public double mitjana;
    


    
    @Parameters
    public static Collection<Object[]> data() {





        Object[][] data = new Object[][]{
            {new Estudiant("Manolo",7,3,2), 0},
            {new Estudiant("Man",0,5,10), 0},
            {new Estudiant("Mo",2,2,2), 0},
            {new Estudiant("a",1,2,3), 0},
            {new Estudiant("b",6,5,4), 0},
            {new Estudiant("c",7,8,9), 8},
            {new Estudiant("d",10,5,5), 6.666},
            {new Estudiant("e",8,1,5), 0},
            {new Estudiant("f",8,1,1), 0},
            {new Estudiant("g",8,5,5), 6},
            {new Estudiant("h",8,4,5), 0},
            {new Estudiant("i",8,5,4), 0},
            {new Estudiant("j",2,5,2), 0},
            {new Estudiant("k",8,6,5), 6.3333},
            {new Estudiant("l",9,5,6), 6.6666},
        
        };


        return Arrays.asList(data);

    }
    
    
    
    public AvaluadorTest_MitjanaSiSupera() {
      //  instance = new Avaluador();
        
    }
    
    @BeforeClass
    public static void setUpClass() {
      //  instance = new Avaluador(10,0,5);
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
    @Test
    public void testMitjanaSiSupera() throws Exception {
        
       instance = new Avaluador(10,0,5);
    
        
       assertEquals(mitjana, instance.mitjanaSiSupera(estudiant0),0.001);

        

    }

    
}
