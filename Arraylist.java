/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
interface AnonClass {

    public void alfabetoLista2();
    
}
/**
 *
 * @author annip
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1= new Persona("Anné","Páez");
        Persona p2= new Persona("Emmanuel","Salgado");
        Persona p3= new Persona("Diana","Iracheta");
        Persona p4= new Persona("Fernando","Páez");
        Persona p5= new Persona("Hector","Páez");
        Persona p6= new Persona("Jacqueline","Soto");
        Persona p7= new Persona("Elizabeth","Reyna");
        Persona p8= new Persona("Olivia","Benson");
        Persona p9= new Persona("Raúl","Reyes");
        Persona p10= new Persona("Bianca","Quintero");
        
     ArrayList<Persona> nombres = new ArrayList<Persona>();
        nombres.add(p1);
        nombres.add(p2);
        nombres.add(p3);
        nombres.add(p4);
        nombres.add(p5);
        nombres.add(p6);
        nombres.add(p7);
        nombres.add(p8);
        nombres.add(p9);
        nombres.add(p10);
        
        Collections.sort(nombres);
        
         AnonClass anon= new AnonClass() {
        @Override
        public void alfabetoLista2(){
            System.out.println("ORDENAMIENTO POR ALFABETO");
        for (Persona string:nombres){
            System.out.println(string);
            
        }
};
     
    
         };
       
                    anon.alfabetoLista2();
                    
                 }
}
