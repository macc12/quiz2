/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import edu.co.sergio.mundo.vo.Escuela;
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
public class DAOEscuela implements IBaseDatos<Escuela> {

    @Override
    public List<Escuela> findAll() {
        List<Escuela> escuelas = null;
        String query = "SELECT * FROM Depto";
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(DAOEscuela.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            double codigo = 0;
            String nombre = null;

            while (rs.next()) {
                if (escuelas == null) {
                    escuelas = new ArrayList<Escuela>();
                }

                Escuela registro = new Escuela();
                
                codigo = rs.getDouble("codigo");
                registro.setCodigo(codigo);
                
                nombre = rs.getString("nombre");
                registro.setNombre(nombre);
                
                escuelas.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return escuelas;
    }

    @Override
    public boolean insert(Escuela t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Escuela t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Escuela t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
