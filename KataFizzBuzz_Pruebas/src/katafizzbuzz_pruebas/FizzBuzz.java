/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizzbuzz_pruebas;

/**
 *
 * @author ljaneiro
 */
public class FizzBuzz {

    public String getFizzBuzz(int n) {
        String result=String.valueOf(n);;                
        if (result.indexOf("5")!=result.lastIndexOf("5")){
            result="BuzzBuzz";
        }else{
            if (n%3==0 || result.contains("3"))result="Fizz";
            if (n%5==0 || result.contains("5"))result="Buzz";        
            if (n%3==0 && n%5==0)result="FizzBuzz";        
        }        
        return result;
    }       
}
