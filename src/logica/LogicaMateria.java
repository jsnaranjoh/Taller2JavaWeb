/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;
import modelo.Materia;
import persistencia.MateriaJpaController;

/**
 *
 * @author NOREÑA
 */
public class LogicaMateria {
    
    MateriaJpaController materiaDAO;
    
    // Validación para crear materia
    public void crearMateria(Materia materia) throws Exception{
        
        // Evaluación de campos vacíos
        if(materia == null){
            throw new Exception("Campos vacíos.");
        }
        else{
            if(materia.getNumeromateria() == 0 || materia.getNumeromateria() == null){
                throw new Exception("Campo No. Materia obligatorio.");
            }
            if(materia.getNombremateria() == null ||materia.getNombremateria().equals("")){
                throw new Exception("Campo Nombre obligatorio.");
            }
            if(materia.getCreditosmateria() == 0 || materia.getCreditosmateria() == null){
                throw new Exception("Campo No. Créditos obligatorio.");
            }
        }
        
        // Evaluación de existencia de una materia
        Materia objMateria = materiaDAO.findMateria(materia.getNumeromateria());
        if(objMateria != null){
            throw new Exception("Materia ya existe.");
        }
        else{
            materiaDAO.create(materia);
        }
    }
    
    // Validación para editar materia
    public void editarMateria(Materia materia) throws Exception{
        
        // Evaluación de campos vacíos
        if(materia == null){
            throw new Exception("Campos vacíos.");
        }
        else{
            if(materia.getNumeromateria() == 0 || materia.getNumeromateria() == null){
                throw new Exception("Campo No. Materia obligatorio.");
            }
            if(materia.getNombremateria() == null ||materia.getNombremateria().equals("")){
                throw new Exception("Campo Nombre obligatorio.");
            }
            if(materia.getCreditosmateria() == 0 || materia.getCreditosmateria() == null){
                throw new Exception("Campo No. Créditos obligatorio.");
            }
        }
        
        // Evaluación de existencia de una materia
        Materia objMateria = materiaDAO.findMateria(materia.getNumeromateria());
        if(objMateria == null){
            throw new Exception("Materia a modificar no existe.");
        }
        else{
            materiaDAO.edit(materia);
        }        
    }
    
    // Validación para eliminar materia
    public void eliminarMateria(Materia materia) throws Exception{
        // Evaluación de campos vacíos
        if(materia == null){
            throw new Exception("Campos vacíos.");
        }
        else{
            if(materia.getNumeromateria() == 0 || materia.getNumeromateria() == null){
                throw new Exception("Campo No. Materia obligatorio.");
            }
        }
        
        // Evaluación de existencia de una materia
        Materia objMateria = materiaDAO.findMateria(materia.getNumeromateria());
        if(objMateria == null){
            throw new Exception("Materia a eliminar no existe.");
        }
        else{
            if(objMateria.getDocenteList().size() > 0){
                throw new Exception("Esta materia tiene docentes asociados.");
            }
            if(objMateria.getMatriculaList().size() > 0){
                throw new Exception("Esta materia tiene matrículas asociadas.");
            }
            else{
                materiaDAO.destroy(objMateria.getNumeromateria());
            }
        }
    }
    
    // Validación para consultar materia
    public Materia consultarMateria(Integer codigo) throws Exception{
        if(codigo==null || codigo==0){
        throw new Exception("El código es Obligatorio.");
        }else{
            return materiaDAO.findMateria(codigo);
        }
    }
    
    // Validación para consultar todas las materias
    public List<Materia> consultarMaterias() throws Exception{
        return materiaDAO.findMateriaEntities();
    }
}
