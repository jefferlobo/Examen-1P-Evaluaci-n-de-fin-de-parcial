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
public class Empleado extends Persona {
   
    
    
    public Empleado(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, String Profecion,
            String dirreccion, String fechanacimeinto, String correo) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, Profecion, dirreccion, fechanacimeinto, correo);
    Persona jn= new Persona("1235", "Martines , ", "Luis", "Fonceca  ", "Jarrin", 
                "Bodeguero", "Cayambe", "12/03/1990", "Martines@gamil.com");
        System.out.println("Datos  de mi  empleado  son cl: :"+jn.getCedula());
        System.out.println("Nombres completos:"+jn.getNombre1()+jn.getNombre2());
        System.out.println("Apelllidos completos:"+jn.getApellido1()+jn.getApellido2());
        System.out.println("Que profecion tiene:"+jn.getProfecion());
        System.out.println("dirrecion:"+jn.getDirreccion());
        System.out.println("Fecha NCM:"+jn.getFechanacimeinto());
        System.out.println("correo:"+jn.getCorreo());
        
        
    
   
    }
     
     
         public  int sueldo1(){
             Scanner valor = new Scanner (System.in);//declaro objeto tipo Scanner
    double numero1;
    double numero2;
    double resultado;

    
    System.out.println("Ingrewse el salario bruto de mi empleado :");
       
             System.out.print("Inserte el  primer sueldo basico = ");
              numero1 = valor.nextInt();
                 System.out.print("Inserte el  segundo sueldo aunmentado  = ");
                    numero2 = valor.nextDouble();
                    resultado =numero1+numero2;
                    
        return (int) (numero1+numero2);
             
        
        
        
         
          
        
         
         }
     
     
     }
    
 
   
