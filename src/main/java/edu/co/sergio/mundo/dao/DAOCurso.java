/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import edu.co.sergio.mundo.vo.Curso;
import java.util.List;

/**
 *
 * @author Labing
 */
public class DAOCurso implements IBaseDatos<Curso>{

    @Override
    public List<Curso> findAll() {
       return null;
    }

    @Override
    public boolean insert(Curso t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Curso t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Curso t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public  List<Curso> find(double id) {
        
        return null;
    }
    
}
