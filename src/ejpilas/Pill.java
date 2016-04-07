/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpilas;

/**
 *
 * @author salak402
 */
public class Pill {
    private int pointer;
    private int size;
    private String pill[];
    
    public Pill (int size){
        this.size = size;
        this.pointer = 0;
        this.pill = new String [size];
    }
    
    
}
