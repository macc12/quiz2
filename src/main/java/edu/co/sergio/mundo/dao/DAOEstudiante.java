/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import edu.co.sergio.mundo.vo.Curso;
import edu.co.sergio.mundo.vo.Estudiante;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Labing
 */
public class DAOEstudiante implements IBaseDatos<Estudiante> {

    @Override
    public List<Estudiante> findAll() {
        List<Estudiante> estudiantes = null;
        String query = "SELECT * FROM Estudiante";
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(DAOEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            double codigo;
            String nombre;
            String beca;
            ArrayList<Curso> cursos;

            while (rs.next()) {
                if (estudiantes == null) {
                    estudiantes = new ArrayList<Estudiante>();
                }                
                Estudiante registro = new Estudiante();
                
                codigo = rs.getDouble("codigo");
                registro.setCodigo(codigo);
                
                nombre = rs.getString("nombre");
                registro.setNombre(nombre);
                
                beca = rs.getString("beca");
                registro.setBeca(beca);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return estudiantes;
    }

    @Override
    public boolean insert(Estudiante t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Estudiante t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Estudiante t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
