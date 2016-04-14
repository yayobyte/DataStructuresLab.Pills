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

        int quantity = 1, age, experience, score, children;
        Pill objPill = new Pill (5);
        while (quantity<=5){
            JOptionPane.showMessageDialog(null, "Ingrese candidat No: "+ quantity);
            age = Integer.parseInt(JOptionPane.showInputDialog(null,null,"Digite su edad"));
            experience = Integer.parseInt(JOptionPane.showInputDialog(null,null,"Ingrese la experiencia en años"));
            score = Integer.parseInt(JOptionPane.showInputDialog(null,null,"Ingrese puntaje de pruebas tecnicas"));
            children = Integer.parseInt(JOptionPane.showInputDialog(null,null,"Ingrese cantidad de hijos"));
            if (age >= 25 && age<=40){
                if (experience>2){
                    if (score>200) {
                        if (children<=2){
                            JOptionPane.showMessageDialog(null, "reclutado");
                            objPill.push(
                                    "Candidato No: " + quantity
                                    +"\nEdad: " + age
                                    +"\nExperiencia: "+ experience
                                    +"\nPuntaje: "+ score
                                    +"\nN of hijos: "+ children
                                    +"\n----------------------\n"
                            );
                            quantity++;
                            JOptionPane.showMessageDialog(null, "Datos Ingresados: \n" + objPill.print());
                        }else{
                            JOptionPane.showMessageDialog(null, "Debe tener maximo 2 hijos");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe tener una puntueacion de mas de 200");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Debe tener mas de 2 años de experiencia");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Debe tener entre 25 y 40 años");
            }
                
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios: \n");
    }
}
