/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;
import modelo.Docente;
import persistencia.DocenteJpaController;

/**
 *
 * @author NOREÑA
 */
public class LogicaDocente {
   
    DocenteJpaController docenteDAO;
    
    public void crearDocente(Docente docente){
        
    }
    
    public void editarDocente(Docente docente){
        
    }
    
    public void eliminarCarrera(Docente docente){
        
    }
    
    public Docente consultarDocente(Long codigo){
        
        return docenteDAO.findDocente(codigo);
    }
    
    public List<Docente> consultarDocentes(){

        return docenteDAO.findDocenteEntities();
    }
    
}
