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
public class Profesor {
    private double codigo;
    private String nombre;
    private String apellido;
    private ArrayList<Curso> cursos;

    public Profesor() {
    }

    public Profesor(double codigo, String nombre, String apellido, ArrayList<Curso> cursos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cursos = cursos;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
}
