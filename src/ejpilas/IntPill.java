/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpilas;

import javax.swing.JOptionPane;

/**
 *
 * @author salak402
 */
public class IntPill {
    private int pointer;
    private int size;
    private int pill[];
    
    public IntPill (int size){
        this.size = size;
        this.pointer = 0;
        this.pill = new int [size];
    }
    
    public boolean isEmpty (){
        return (this.pointer == 0)? true:  false;
    }
    
    public boolean isFull () {
        return (this.pointer == this.size)? true : false;
    }
    
    public boolean push (int data) {
        if (this.isFull()){
            return false;
        }else {
            pill[this.pointer] = data;
            this.pointer ++;
            return true;
        }
    }
    
    public int pop (){
        int a;
        if (this.isEmpty()){
            return 0;
        }else{
            this.pointer --;
            a = this.pill[this.pointer];
            this.pill[this.pointer] =0;
            return a;
        }
    }
    
    public String print () {
        String data="";
        if (this.isEmpty()){
            data =  "Pila vacía";
        }else{
            for (int i = 0; i< this.pointer; i++){
                data = data + this.pill[i] + "\n";
            }
        }
        return data;
            
    }
}
