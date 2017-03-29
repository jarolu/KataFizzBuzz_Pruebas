/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizzbuzz_pruebas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ljaneiro
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    @Test
    public void testFizzBuzzOneReturnsOne() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(1);        
        String expected = "1";
        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzzTwoReturnsTwo() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(2);        
        String expected = "2";
        assertEquals(expected, result);
    }
    
    @Test
    public void testFizzBuzzThreeReturnsFizz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(3);        
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    
    
    
}
