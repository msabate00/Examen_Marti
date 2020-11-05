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
public class AvaluadorTestMillor {
     private Avaluador instance;

    
    @Parameter(0)
    public Estudiant estudiant0;
    @Parameter(1)
    public Estudiant estudiant1;
    @Parameter(2)
    public Estudiant estudiant2;
    @Parameter(3)
    public Estudiant estudiant3;
    
    @Parameter(4)
    public Estudiant millor;
    



 @Parameters
    public static Collection<Object[]> data() {

        Object[][] data = new Object[][]{
            {new Estudiant("A",5,6,7),
                new Estudiant("B",1,6,7),
                new Estudiant("C",3,6,2),
                new Estudiant("D",8,6,8),
                new Estudiant("A",5,6,7)
            },
            {new Estudiant("E",2,3,4),
                new Estudiant("F",6,6,7),
                new Estudiant("G",8,6,2),
                new Estudiant("H",2,6,5),
                new Estudiant("F",6,6,7)
            },
            {new Estudiant("I",1,7,2),
                new Estudiant("J",1,6,7),
                new Estudiant("K",8,6,2),
                new Estudiant("L",5,6,1),
                new Estudiant("K",8,6,2)
            },
            {new Estudiant("IA",1,7,2),
                new Estudiant("JA",1,6,7),
                new Estudiant("KA",8,6,2),
                new Estudiant("LA",5,6,1),
                new Estudiant("KA",8,6,2)
            },
            {new Estudiant("IE",2,2,2),
                new Estudiant("JE",3,3,3),
                new Estudiant("KE",4,4,4),
                new Estudiant("LE",1,1,1),
                new Estudiant("KE",4,4,4)
            },
            {new Estudiant("IT",9,9,9),
                new Estudiant("JT",8,8,8),
                new Estudiant("KT",8,7,7),
                new Estudiant("LT",7,7,7),
                new Estudiant("IT",9,9,9)
            },
            {new Estudiant("E",2,3,4),
                new Estudiant("F",6,6,7),
                new Estudiant("G",8,6,2),
                new Estudiant("H",2,6,5),
                new Estudiant("F",6,6,7)
            },
            {new Estudiant("I9",1,7,2),
                new Estudiant("JF",1,6,7),
                new Estudiant("KF",8,6,2),
                new Estudiant("LF",5,6,1),
                new Estudiant("KF",8,6,2)
            },
            {new Estudiant("IE",2,2,2),
                new Estudiant("JE",3,3,3),
                new Estudiant("KE",4,4,4),
                new Estudiant("LE",1,1,1),
                new Estudiant("KE",4,4,4)
            },
            {new Estudiant("IK",1,7,2),
                new Estudiant("JK",1,6,7),
                new Estudiant("KK",8,6,2),
                new Estudiant("LK",5,6,1),
                new Estudiant("KK",8,6,2)
            },
            {new Estudiant("IT",9,9,9),
                new Estudiant("JT",8,8,8),
                new Estudiant("KT",8,7,7),
                new Estudiant("LT",7,7,7),
                new Estudiant("IT",9,9,9)
            },
            {new Estudiant("A",5,6,7),
                new Estudiant("B",1,6,7),
                new Estudiant("C",3,6,2),
                new Estudiant("D",8,6,8),
                new Estudiant("A",5,6,7)
            },
            {new Estudiant("E",2,3,4),
                new Estudiant("F",6,6,7),
                new Estudiant("G",8,6,2),
                new Estudiant("H",2,6,5),
                new Estudiant("F",6,6,7)
            },
            {new Estudiant("IT",9,9,9),
                new Estudiant("JT",8,8,8),
                new Estudiant("KT",8,7,7),
                new Estudiant("LT",7,7,7),
                new Estudiant("IT",9,9,9)
            },
            {new Estudiant("I9",1,7,2),
                new Estudiant("JF",1,6,7),
                new Estudiant("KF",8,6,2),
                new Estudiant("LF",5,6,1),
                new Estudiant("KF",8,6,2)
            },
        
        
        
        };

        return Arrays.asList(data);

 

    }
    
    
    
    public AvaluadorTestMillor() {
   
        
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
    
    @Test
   
    public void testMillorEstudiantPerNotaMitjana() throws Exception {

        
      instance = new Avaluador(10,0,5);
      
//      Estudiant estu[] = new Estudiant[4];
//      estu[0] = new Estudiant("Manolo",7,5,5);
//      estu[1] = new Estudiant("Ma¡",5,5,5);
//      estu[2] = new Estudiant("Mano",3,5,5);
//      estu[3] = new Estudiant("Maolo",2,5,5);
    //  estu[4] = new Estudiant("lo",5,5,5);
      // Estudiant estudiant55 = new Estudiant("Manolo",5,5,5);
      
            Estudiant estu[] = new Estudiant[4];
            estu[0] = estudiant0;
            estu[1] = estudiant1;
            estu[2] = estudiant2;
            estu[3] = estudiant3;
            
            
       assertEquals(millor, instance.millorEstudiantPerNotaMitjana(estu));
        
    }
    
}
