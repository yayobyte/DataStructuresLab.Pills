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
    
    public boolean isEmpty (){
        return (this.pointer == 0)? true:  false;
    }
    
    public boolean isFull () {
        return (this.pointer == this.size)? true : false;
    }
    
    public boolean push (String data) {
        if (this.isFull()){
            return false;
        }else {
            pill[this.pointer] = data;
            this.pointer ++;
            return true;
        }
    }
    
    public boolean pop (){
        if (this.isEmpty()){
            return false;
        }else{
            this.pill[this.pointer] = null;
            this.pointer --;
            return true;
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
