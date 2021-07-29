/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTIAGO SOLIS
 */
public class Controlador {
   Persona p;
    ArrayList<Persona>lista= new ArrayList<>();
   
   public void menu(){
   Integer op=0;
       do {           
           op=opcionesMenu();
           switch(op){
               case 1:
                   anadirPersona();
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
                   
           }
       } while (op!=5);
   }
   
   private Integer opcionesMenu(){
      Integer item=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción\n"
              + "1.- Añadir una persona a mi listado\n"
              + "2.- Mostrar el listado de personas\n"
              + "3.- Actualizar una persona\n"
              + "4.- Eliminar una persona\n"
              + "5.- Salir"));
       
       return item;
   }
   
   public void anadirPersona(){
       p=new Persona();
       p.setCedula(JOptionPane.showInputDialog("Ingresa la cedula"));
       p.setApellido1(JOptionPane.showInputDialog("Ingresa el apellido paterno"));
       p.setApellido2(JOptionPane.showInputDialog("Ingresa el apellido materno"));
       p.setNombres(JOptionPane.showInputDialog("Ingresa los dos nombre"));
       lista.add(p);
       
       
   }
   
   
}
