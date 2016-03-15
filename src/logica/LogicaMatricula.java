/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;
import modelo.Matricula;
import modelo.MatriculaPK;
import persistencia.MatriculaJpaController;

/**
 *
 * @author NOREÑA
 */
public class LogicaMatricula {

    MatriculaJpaController matriculaDAO;
    
    // Validación para crear matrícula
    public void crearMatricula(Matricula matricula) throws Exception{
        
        if(matricula.getNota() == null){
            throw new Exception("Campo Nota obligatorio");
        }
        else{
            matriculaDAO.create(matricula);   
        }
    }
    
    // Validación para editar matrícula
    public void editarMatricula(Matricula matricula) throws Exception{
        
        if(matricula.getNota() == null){
            throw new Exception("Campo Nota obligatorio");
        }
        else{
            matriculaDAO.edit(matricula);   
        }        
    }
    
    // Validación para eliminar matrícula
    public void eliminarMatricula(Matricula matricula) throws Exception{
        matriculaDAO.destroy(matricula.getMatriculaPK());
    }
    
    // Validación para consultar matrícula
    public Matricula consultarMatricula(MatriculaPK id) throws Exception{
        if(id == null){
            throw new Exception("Matrícula no existe.");
        }
        else{
            return matriculaDAO.findMatricula(id);   
        }
    }
    
    // Validación para consultar todas las mátriculas
    public List<Matricula> consultarMatriculas() throws Exception{
        return matriculaDAO.findMatriculaEntities();
    }
    
}
