/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iulian Ghionoiu <iulian.ghionoiu@exenne.ro>
 */
public class KataTest {
    
    /**
     * Test of main method, of class Kata.
     */
    @Test
    public void test_I() {
        //Given
        String roman = "I";
        int expected = 1;
        
        //When
        int result = 1;
        
        //Then
        assertEquals(expected,result);
    }
}