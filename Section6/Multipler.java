/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author ABO AMER
 */
public class Multipler implements multiplyinterface {
    
     public void multiply(int BigDecimal)
   
     {
         System.out.println("number of BigDecimal:"+ BigDecimal);
     }

    @Override
    public void BigDecimal(int num1, int num2, String operationtype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
