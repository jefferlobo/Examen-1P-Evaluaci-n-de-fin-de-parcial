/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author jeffe
 */
public class Empresa {
    
       private String nombreEmpresa;
       private String idEmpresa;
       private String ruc;
       private String Forma ;
       private String tamano;

    public Empresa(String nombreEmpresa, String idEmpresa, String ruc, String Forma, String tamano) {
        this.nombreEmpresa = nombreEmpresa;
        this.idEmpresa = idEmpresa;
        this.ruc = ruc;
        this.Forma = Forma;
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getForma() {
        return Forma;
    }

    public void setForma(String Forma) {
        this.Forma = Forma;
    }

   
    
     
       
       
    
    
    
    }

