/**
 * @(#)Principal.java
 *
 *
 * @author
 * @version 1.00 2012/9/25
 */

package ejpilas;

import javax.swing.*;
public class Principal {


    public static void main(String[] args) {

        Pila p1 = new Pila(4);

        p1.Push("a");
        p1.Push("b");
        p1.Push("c");
        p1.Push("d");
        p1.imprimir();
        
        JOptionPane.showMessageDialog(null,"POP");
        
        p1.pop();
        p1.imprimir();

         
        p1.pop();
        p1.imprimir();
        
        p1.pop();
        p1.imprimir();
        
        p1.pop();
        p1.imprimir();




    }
}
