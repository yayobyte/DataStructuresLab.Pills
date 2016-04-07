
package ejpilas;
import javax.swing.*;
public class Pila {

    private int tamano;
    private int top;
    private String pil[];


    public Pila(int tamano) {

    	this.tamano = tamano;
        this.top = 0;
        this.pil = new String [tamano];

    }

    public boolean EstaVacia(){
        if(top==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean EstaLlena(){

	if(top==tamano){
            return true;
        }else{
            return false;
        }

    }

    public void Push(String dato){
         if(EstaLlena())
         {
        
        JOptionPane.showMessageDialog(null,"PILA LLENA");
         }else{
            pil[top]=dato;
            top++;
        }
    }
    
    
    public void pop(){
      if(EstaVacia()){
          
          JOptionPane.showMessageDialog(null,"PILA VACIA");
      } else{

		  JOptionPane.showMessageDialog(null,"DATO ELIMINADO: "+ pil[top-1]);
		  pil[top-1]=null;
                  top--;
      }
   }

   public void imprimir(){
       if(EstaVacia())
            
            JOptionPane.showMessageDialog(null,"PILA VACIA");
        else
            for(int i=0;i<top;i++)
                
                JOptionPane.showMessageDialog(null,pil[i]+" ");
    }

}