/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

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
          String sql = "CREATE TABLE Escuela(codigo double,nombre varchar(40), PRIMARY KEY(codigo)) "
                  + "CREATE TABLE Estudiante(codigo double,nombre varchar(40), codEscuela double, beca varchar(20), PRIMARY KEY(codigo)), FOREIGN KEY(codigo) REFERENCES Escuela(codigo)"
                  + "";
          Connection connection = null;
            try {
                connection = Conexion.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql);
                
            } catch (URISyntaxException ex) {
                Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
             Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }
          
     }
}
