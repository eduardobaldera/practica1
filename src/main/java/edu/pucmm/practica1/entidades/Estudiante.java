package edu.pucmm.practica1.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Estudiante {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long matricula;
    private String nombre;
    private String apellido = "";
    private String telefono= "";

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long id) {
        this.matricula = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



}
