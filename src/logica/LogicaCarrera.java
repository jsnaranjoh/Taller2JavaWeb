/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;
import modelo.Carrera;
import persistencia.CarreraJpaController;

/**
 *
 * @author NOREÑA
 */
public class LogicaCarrera {
    
    CarreraJpaController carreraDAO;
    
    public void crearCarrera(Carrera carrera){
        
    }
    
    public void editarCarrera(Carrera carrera){
        
    }
    
    public void eliminarCarrera(Carrera carrera){
        
    }
    
    public Carrera consultarCarrera(Integer codigo){
        
        return carreraDAO.findCarrera(codigo);
    }
    
    public List<Carrera> consultarCarreras(){

        return carreraDAO.findCarreraEntities();
    }
}
