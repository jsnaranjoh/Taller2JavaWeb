/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;
import modelo.Estudiante;
import persistencia.EstudianteJpaController;

/**
 *
 * @author NOREÑA
 */
public class LogicaEstudiante {
    
    EstudianteJpaController estudianteDAO;
    
    // Validación para crear estudiante
    public void crearMateria(Estudiante estudiante) throws Exception{
        
        // Evaluación de campos vacíos
        if(estudiante == null){
            throw new Exception("Campos vacíos.");
        }
        else{
            if(estudiante.getDocumentoestudiante() == 0 || estudiante.getDocumentoestudiante() == null){
                throw new Exception("Campo No. Documento obligatorio.");
            }
            if(estudiante.getNombreestudiante() == null || estudiante.getNombreestudiante().equals("")){
                throw new Exception("Campo Nombres obligatorio.");
            }
            if(estudiante.getApellidoestudiante() == null || estudiante.getApellidoestudiante().equals("")){
                throw new Exception("Campo Apellidos obligatorio.");
            }
            if(estudiante.getCorreoestudiante() == null || estudiante.getCorreoestudiante().equals("")){
                throw new Exception("Campo Correo obligatorio.");
            }
            if(!estudiante.getCorreoestudiante().contains("@")){
                throw new Exception("Campo Correo no válido.");
            }
            if(estudiante.getSemestreestudiante() == 0 || estudiante.getSemestreestudiante() == null){
                throw new Exception("Campo Semestre obligatorio.");
            }
            if(estudiante.getClaveestudiante() == null || estudiante.getClaveestudiante().equals("")){
                throw new Exception("Campo Clave obligatorio.");
            }
            if(estudiante.getClaveestudiante().length() < 8){
                throw new Exception("Clave muy corta. Escriba una mayor o igual a 8 caracteres.");
            }
        }
        
        // Evaluación de existencia de un estudiante
        Estudiante objEstudiante = estudianteDAO.findEstudiante(estudiante.getDocumentoestudiante());
        if(objEstudiante != null){
            throw new Exception("Estudiante ya existe.");
        }
        else{
            estudianteDAO.create(estudiante);
        }
    }
    
    // Validación para editar estudiante
    public void editarEstudiante(Estudiante estudiante) throws Exception{
        
        // Evaluación de campos vacíos
        if(estudiante == null){
            throw new Exception("Campos vacíos.");
        }
        else{
            if(estudiante.getDocumentoestudiante() == 0 || estudiante.getDocumentoestudiante() == null){
                throw new Exception("Campo No. Documento obligatorio.");
            }
            if(estudiante.getNombreestudiante() == null || estudiante.getNombreestudiante().equals("")){
                throw new Exception("Campo Nombres obligatorio.");
            }
            if(estudiante.getApellidoestudiante() == null || estudiante.getApellidoestudiante().equals("")){
                throw new Exception("Campo Apellidos obligatorio.");
            }
            if(estudiante.getCorreoestudiante() == null || estudiante.getCorreoestudiante().equals("")){
                throw new Exception("Campo Correo obligatorio.");
            }
            if(!estudiante.getCorreoestudiante().contains("@")){
                throw new Exception("Campo Correo no válido.");
            }
            if(estudiante.getSemestreestudiante() == 0 || estudiante.getSemestreestudiante() == null){
                throw new Exception("Campo Semestre obligatorio.");
            }
            if(estudiante.getClaveestudiante() == null || estudiante.getClaveestudiante().equals("")){
                throw new Exception("Campo Clave obligatorio.");
            }
            if(estudiante.getClaveestudiante().length() < 8){
                throw new Exception("Clave muy corta. Escriba una mayor o igual a 8 caracteres.");
            }
        }
        
        // Evaluación de existencia de un estudiante
        Estudiante objEstudiante = estudianteDAO.findEstudiante(estudiante.getDocumentoestudiante());
        if(objEstudiante == null){
            throw new Exception("Estudiante no existe.");
        }
        else{
            estudianteDAO.edit(estudiante);
        }        
    }
    
    // Validación para eliminar estudiante
    public void eliminarEstudiante(Estudiante estudiante) throws Exception{
        // Evaluación de campos vacíos
        if(estudiante == null){
            throw new Exception("Campos vacíos.");
        }
        else{
            if(estudiante.getDocumentoestudiante() == 0 || estudiante.getDocumentoestudiante() == null){
                throw new Exception("Campo No. Documento obligatorio.");
            }
        }
        
        // Evaluación de existencia de una materia
        Estudiante objEstudiante = estudianteDAO.findEstudiante(estudiante.getDocumentoestudiante());
        if(objEstudiante == null){
            throw new Exception("Estudiante a eliminar no existe.");
        }
        else{
            if(objEstudiante.getMatriculaList().size() > 0){
                throw new Exception("Este estudiante tiene matrículas asociadas.");
            }
            else{
                estudianteDAO.destroy(estudiante.getDocumentoestudiante());
            }
        }
    }
    
    // Validación para consultar estudiante
    public Estudiante consultarEstudiante(Long codigo) throws Exception{
        if(codigo == null || codigo == 0){
        throw new Exception("El código es Obligatorio.");
        }else{
            return estudianteDAO.findEstudiante(codigo);
        }
    }
    
    // Validación para consultar todas los estudiantes
    public List<Estudiante> consultarEstudiantes() throws Exception{
        return estudianteDAO.findEstudianteEntities();
    }
    
}
