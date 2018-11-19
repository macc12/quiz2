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
public class Curso {
    private double codigo;
    private String nombre;
    private Profesor profesor;
    private ArrayList<Estudiante> cursos;

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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Estudiante> cursos) {
        this.cursos = cursos;
    }

    public Curso() {
    }

    public Curso(double codigo, String nombre, Profesor profesor, ArrayList<Estudiante> cursos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
        this.cursos = cursos;
    }
    
    
    
}
