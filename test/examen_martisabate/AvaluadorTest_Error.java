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
import org.junit.Rule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Marti Sabaté
 */
//@RunWith(Parameterized.class)
public class AvaluadorTest_Error {
    private Avaluador instance;
    @Rule
    public final Timeout timeout = Timeout.millis(100);

    
    
    public AvaluadorTest_Error() {
       instance = new Avaluador();
        
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
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        
       instance = new Avaluador(10,0,5);
       Estudiant estudiant55 = new Estudiant("Manolo",2,5,5);
        
       assertEquals(0, instance.mitjanaSiSupera(estudiant55),0.001);


    }

    /**
     * Test of mitjana method, of class Avaluador.
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjana() throws Exception {
    
      instance = new Avaluador(10,0,5);
       Estudiant estudiant55 = new Estudiant("Manolo",2,5,5);
        
       assertEquals(4, instance.mitjana(estudiant55),0.001);
        
        

    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     * @throws java.lang.Exception
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() throws Exception {

        
      instance = new Avaluador(10,0,5);
      
      Estudiant estu[] = new Estudiant[4];
      estu[0] = new Estudiant("Manolo",7,5,5);
      estu[1] = new Estudiant("Ma¡",5,5,5);
      estu[2] = new Estudiant("Mano",3,5,5);
      estu[3] = new Estudiant("Maolo",2,5,5);
    //  estu[4] = new Estudiant("lo",5,5,5);
      // Estudiant estudiant55 = new Estudiant("Manolo",5,5,5);
        
       assertEquals(estu[0], instance.millorEstudiantPerNotaMitjana(estu));
        
    }
    
    
}
    

