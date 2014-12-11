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
public class Tabla {
    int numero;
    int i;
    public Tabla(){
    Valido validado = new Valido();
    do{
        String dato = JOptionPane.showInputDialog(null,"inroduce el numero");
        numero = Integer.parseInt(dato);
        numero = validado.Valido(numero);
        
     if(numero!=0){
         for(i=1;i<11;i++){
         int resultado =numero*i;
         System.out.println(numero+"por"+i+":"+ resultado);
         }
     }
    }while(numero!=0);
     System.out.println("el programa a finalizado");
     
    }
    
    
}
