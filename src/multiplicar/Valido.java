/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicar;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Valido {
    public int Valido(int dato){
        if(dato>0){
        return dato;
        }else{
            if (dato==0){
                return dato;
            }
       while(dato>0){
       String valor = JOptionPane.showInputDialog(null,"el numero no es valido");
       dato = Integer.parseInt(valor);
       
       }
       return dato;
        }
        
    
    }
    
}
