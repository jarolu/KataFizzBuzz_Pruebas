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
        
    @Test
    public void testFizzBuzzFiveReturnsBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(5);        
        String expected = "Buzz";
        assertEquals(expected, result);
    }
    
    @Test
    public void testFizzBuzzThreeMultiplesReturnsFizz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(6);        
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    
    @Test
    public void testFizzBuzzFiveMultiplesReturnsBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(10);        
        String expected = "Buzz";
        assertEquals(expected, result);
    }
    
    @Test
    public void testFizzBuzzFiveAndThreeMultiplesReturnsFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(15);        
        String expected = "FizzBuzz";
    }

    @Test
    public void testFizzBuzzInclueThreeReturnsFizz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(13);        
        String expected = "Fizz";
        assertEquals(expected, result);
    }
}
