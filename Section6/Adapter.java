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
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Divider di=new Divider();
    System.out.println(di.BigDecimal(5,5,"+"));
    System.out.println(di.BigDecimal(5,5,"*"));
    System.out.println(di.BigDecimal(5,5,"-"));
    System.out.println(di.BigDecimal(5,5,"/"));
}
}