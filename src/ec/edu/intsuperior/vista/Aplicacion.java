/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Clientes;
import ec.edu.intsuperior.modelo.Directores_Jefes;


import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;


/**
 *
 * @author jeffe
 */
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("Empresa");
      Empresa cii=new Empresa("EmpresaLAPTOS", "123456488-9","Privado", "Privado", "Mediana");
        System.out.println("Nombre de la Empresa:"+cii.getNombreEmpresa());
        System.out.println("Id Empresa:"+cii.getIdEmpresa());
        System.out.println("Ruc Empresa:"+cii.getRuc());
        System.out.println("Forma Empresa:"+cii.getForma());
        System.out.println("Tamano Empresa:"+cii.getTamano());
        
        
        System.out.println("----------MI EMPRESA TIENE--------------");
        
        
        System.out.println("====Clientes===");
        
        Clientes leer=new Clientes("1235", "Lolo , ", "Mateo", "Robert  ", 
                "Jarrin", "NA", "Quito", "12/03/1995", "Lolo@gamil.com");
        System.out.println("El numero registrado:"+leer.telefonoContacto());
    
         System.out.println("====Empleados===");
         
        Empleado jn =new Empleado("1235", "Martines , ", "Luis", "Fonceca  ", "Jarrin", 
                "NA", "Quito", "12/03/1995", "Lolo@gamil.com");
     
        System.out.println("mi sueldo es:"+jn.sueldo1());
        
        System.out.println("---SON SUPERVISADOS POR DIRECTIVOS-----");
        
        Directores_Jefes jefe=new Directores_Jefes("172548", "Miguel", "Luismi" 
                ,"Guetierres", "Guamani", "DR supervisor del area a", "Tabacundo", "12/06/1970", "DRLOPES@gmai.com");
        
       
        System.out.println("El sueldo Bruto de los Directores son :"+jefe.sueldo2());
        
        
      
    }
}
