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
public class Persona {
    private  String cedula;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String Profecion;
    private String dirreccion;
    private String fechanacimeinto;
    private String correo;

    public Persona(String cl, String nom1, String nom2, String ape1, String ape2, String Pro, String dir
            , String fech, String cor) {
        this.cedula = cl;
        this.nombre1 = nom1;
        this.nombre2 = nom2;
        this.apellido1 = ape1;
        this.apellido2 = ape2;
        this.Profecion = Pro;
        this.dirreccion = dir;
        this.fechanacimeinto = fech;
        this.correo = cor;
    }

    public Persona() {

    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getProfecion() {
        return Profecion;
    }

    public void setProfecion(String Profecion) {
        this.Profecion = Profecion;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getFechanacimeinto() {
        return fechanacimeinto;
    }

    public void setFechanacimeinto(String fechanacimeinto) {
        this.fechanacimeinto = fechanacimeinto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    
}
