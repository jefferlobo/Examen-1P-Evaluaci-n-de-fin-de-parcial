/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Scanner;

/**
 *
 * @author jeffe
 */
public class Clientes extends Persona{
    
    public Clientes(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, String Profecion, String dirreccion, String fechanacimeinto, String correo) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, Profecion, dirreccion, fechanacimeinto, correo);
    
    Persona jc= new Persona("1235", "Lolo , ", "Mateo", "Robert  ", "Jarrin", "NA", "Quito", "12/03/1995", "Lolo@gamil.com");
        System.out.println("Datos  de mi  cliente son cl: :"+jc.getCedula());
        System.out.println("Nombres completos:"+jc.getNombre1()+jc.getNombre2());
        System.out.println("Apelllidos completos:"+jc.getApellido1()+jc.getApellido2());
        System.out.println("Que profecion tiene:"+jc.getProfecion());
        
        System.out.println("Fecha NCM:"+jc.getFechanacimeinto());
        System.out.println("correo:"+jc.getCorreo());
    
    
    }
    public int telefonoContacto(){
   Scanner fon = new Scanner (System.in);
    int numero;
    
    int resultado;
  
       
             System.out.print("El numero de telefono solicitado  es  = ");
           return   numero = fon.nextInt();
    }
            
    
}
