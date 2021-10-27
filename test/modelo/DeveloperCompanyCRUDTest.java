
package modelo;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class DeveloperCompanyCRUDTest {
    
    public DeveloperCompanyCRUDTest() {
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
     * Test of ingresarRegistro method, of class DeveloperCompanyCRUD.
     */
    
    @Test
    public void testIngresarRegistro() {
        System.out.println("ingresarRegistro");
        DeveloperCompany Developer = new DeveloperCompany(1009,"hsb","ozbjsv","1987-09-08");
        DeveloperCompanyCRUD instance = new DeveloperCompanyCRUD();
        String expResult = "Se ingresó la compañía desarrolladora: "+Developer.getName()+" con exito";
        String result = instance.ingresarRegistro(Developer);
       // System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testIngresarRegistro1() {
        System.out.println("ingresarRegistro");
        DeveloperCompany Developer = new DeveloperCompany(1009,"hsb","ozbjsv","1987-09-08");
        DeveloperCompanyCRUD instance = new DeveloperCompanyCRUD();
        String expResult = "No se puedo ingresar la compañía desarrolladora: "+Developer.getName()+"ex.getMessage()";
        String result = instance.ingresarRegistro(Developer);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /** 
     * Test of mostrarRegistros method, of class DeveloperCompanyCRUD.
     */
  
    @Test
    public void testMostrarRegistros() {
        System.out.println("mostrarRegistros");
        DeveloperCompanyCRUD instance = new DeveloperCompanyCRUD();
        int expResult = 10 ;
        List<DeveloperCompany> result = instance.mostrarRegistros();
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarRegistro method, of class DeveloperCompanyCRUD.
     */
  
    @Test
    public void testActualizarRegistro() {
        System.out.println("actualizarRegistro");
        DeveloperCompany Developer = new DeveloperCompany(1007,"hob","ozbjsv","1987-09-08");
        DeveloperCompanyCRUD instance = new DeveloperCompanyCRUD();
        String expResult = "Actualización exitosa!";
        String result = instance.actualizarRegistro(Developer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarRegistro method, of class DeveloperCompanyCRUD.
     */
    
    @Test
    public void testBorrarRegistro() {
        System.out.println("borrarRegistro");
        int id =1006;
        DeveloperCompanyCRUD instance = new DeveloperCompanyCRUD();
        String expResult = "Borrado exitoso!";
        String result = instance.borrarRegistro(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
  
}
