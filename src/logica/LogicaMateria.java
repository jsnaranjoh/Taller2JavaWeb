/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

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
    
    // Validación para eliminar materia
    
    // Validación para consultar materia
    
}
