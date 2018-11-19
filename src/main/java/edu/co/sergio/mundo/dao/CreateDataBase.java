/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import edu.co.sergio.mundo.vo.Escuela;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabian Giraldo
 */
public class CreateDataBase {
     public static void run(){
          String sql = "CREATE TABLE Escuela(codigo double,nombre varchar(40), PRIMARY KEY(codigo)); "
                  + "CREATE TABLE Estudiante(codigo double,nombre varchar(40), codEscuela double, beca varchar(20), PRIMARY KEY(codigo), FOREIGN KEY(codEscuela) REFERENCES Escuela(codigo));"
                  + "CREATE TABLE Profesor(codigo double, nombre varchar(40), apellido varchar(40), PRIMARY KEY(codigo));"
                  + "CREATE TABLE Curso(codigo double, nombre varchar(40), codProfesor double, PRIMARY KEY(codigo), FOREIGN KEY(codProfesor) REFERENCES Profesor(codigo));"
                  + "CREATE TABLE Registro(id double, codEstudiante double, coCurso double, semestre varchar(20), nota double, PRIMARY KEY(id), FOREIGN KEY(codEstudiante) REFERENCES Estudiante(codigo),"
                  + "FOREIGN KEY(coCurso) REFERENCES Curso(codigo))";
          Connection connection = null;
            try {
                connection = Conexion.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql);
                
            } catch (URISyntaxException ex) {
                
            } catch (SQLException ex) {
             Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }
          
     }
}
