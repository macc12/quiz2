/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

import java.util.ArrayList;

/**
 *
 * @author Labing
 */
public class Escuela {
    private double codigo;
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Escuela() {
    }

    public Escuela(double codigo, String nombre, ArrayList<Estudiante> estudiantes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
}
