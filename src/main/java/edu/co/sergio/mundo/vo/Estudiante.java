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
public class Estudiante {
    private double codigo;
    private String nombre;
    private String beca;
    private ArrayList<Curso> cursos;

    public Estudiante() {
    }

    public Estudiante(double codigo, String nombre, String beca, ArrayList<Curso> cursos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.beca = beca;
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

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    
    
    
}
