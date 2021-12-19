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
public class divideAdapter implements divideinterface{
       
 
 
  multiplyinterface mult;
   public  divideAdapter(String operationtype) 
   {
      if(operationtype.equalsIgnoreCase("*"))
     {
    mult=new Multipler();
    }
 else
          System.out.print("any operation");
 }
 
  public double BigDecimal(int num1,int num2,String operationtype)
  {
  
  if (operationtype.equalsIgnoreCase("*"))
  {
     mult. BigDecimal(num1,num2,operationtype);
  }
  return0;
   

