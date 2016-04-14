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

    public static final String[] options = { "1", "2", "3", "4", "Salir" };
    
    public static void main(String[] args) {

        int quantity = 1, number, experience, score, children,age;
        String option = "0", name, data;
        Pill stringPill;
        IntPill intPill;
        JFrame frame = new JFrame("Input Dialog Example 3");
        do{
            option = (String) JOptionPane.showInputDialog(frame, 
            "¿Qué opción desea ejecutar?\n\n" + 
                "1 - 10 numeros mayores o iguales a 5\n" + 
                "2 - 5 nombres de personas que ingresan al ejército\n" + 
                "3 - 5 números y sumarlos\n" + 
                "4 - 10 números pares" + 
                "5 - Salir"
                ,
            "Seleccione",
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]);
        
            switch (option){
                case "1":
                    quantity = 1;
                    intPill = new IntPill(10);
                    while (quantity<=10){
                        number = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Número",null));
                        if (number>=5){
                            intPill.push(number);
                            quantity ++;
                        }else{
                            JOptionPane.showMessageDialog(null, "El número debe ser mayor o igual a 5");
                        }
                    }
                    JOptionPane.showMessageDialog(null, "La pila quedó: \n\n" + intPill.print());
                    break;
                case "2":
                    quantity = 1;
                    stringPill = new Pill(5);
                    while (quantity<=5){
                        age = Integer.parseInt(JOptionPane.showInputDialog(null,"Candidato No: " + quantity + "\n\nIngrese Edad",null));
                        if (age>=18 && age<=25){
                            name = JOptionPane.showInputDialog(null,"Ingrese Nombre",null);
                            stringPill.push(name);
                            quantity ++;
                        }else{
                            JOptionPane.showMessageDialog(null, "El número debe ser mayor o igual a 5");
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Los reclutados son: \n\n" + stringPill.print());
                    break;
                case "3":
                    quantity = 1;
                    intPill = new IntPill(5);
                    while (quantity<=5){
                        number = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Número a sumar",null));
                        intPill.push(number);
                        quantity ++;
                    }
                    data = "";
                    quantity --;
                    while (quantity>0){
                        data = data + intPill.pop() + "\n";
                        JOptionPane.showMessageDialog(null, "Los reclutados son: \n\n" + data);
                        quantity--;
                    }
                    break;
                case "4":
                    quantity = 1;
                    intPill = new IntPill(10);
                    while (quantity<=5){
                        number = Integer.parseInt(JOptionPane.showInputDialog(null,"Número: " + quantity + "\n\n",null));
                        if ((number % 2) == 0){
                            intPill.push(number);
                            quantity ++;
                        }else{
                            JOptionPane.showMessageDialog(null, "El número debe ser par");
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Los números son: \n\n" + intPill.print());
                    break;
            }
        }while (!"Salir".equals(option));
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios: \n");
        
    }

}
