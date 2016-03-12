/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import modelo.Materia;
import modelo.Matricula;
import modelo.MatriculaPK;
import persistencia.EstudianteJpaController;
import persistencia.MateriaJpaController;
import persistencia.MatriculaJpaController;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author jsnar
 */
public class VistaMatricula extends javax.swing.JPanel {

    private List<Materia> listaMateria;
    private List<Estudiante> listaEstudiante;
    private Matricula matricula;
    /**
     * Creates new form VistaMatricula
     */
    public VistaMatricula() {
        matricula = new Matricula();
        /**
         * Obtiene la lista de nombres de materias y se agregan a un modelo de comboBox
         * dicho modelo es cargado en jComboBox2 para que el usuario seleccione una opción
         */
        DefaultComboBoxModel materiaComboBoxModel = new DefaultComboBoxModel();
        MateriaJpaController controladorMateria = new MateriaJpaController();
        listaMateria = controladorMateria.findMateriaEntities();
        for (Materia materia : listaMateria) {
            Object nombreMateria = materia.getNombremateria();
            materiaComboBoxModel.addElement(nombreMateria);
        }
        
        DefaultComboBoxModel estudianteComboBoxModel = new DefaultComboBoxModel();
        EstudianteJpaController controladorEstudiante = new EstudianteJpaController();
        listaEstudiante = controladorEstudiante.findEstudianteEntities();
        for (Estudiante estudiante : listaEstudiante) {
            Object nombreEstudiante = estudiante.getNombreestudiante() + " " + estudiante.getApellidoestudiante();
            estudianteComboBoxModel.addElement(nombreEstudiante);
        }
        initComponents();
        jComboBox2.setModel(materiaComboBoxModel);
        jComboBox3.setModel(estudianteComboBoxModel);

        int numeroMateriaSeleccionada = listaMateria.get(0).getNumeromateria();
        jTextField5.setText(String.valueOf(numeroMateriaSeleccionada));
        
        Long numeroEstudianteSeleccionado = listaEstudiante.get(0).getDocumentoestudiante();
        jTextField2.setText(String.valueOf(numeroEstudianteSeleccionado));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();

        jLabel2.setText("Nombre Estudiante");

        jLabel3.setText("No. Documento Estudiante");

        jTextField2.setEnabled(false);

        jLabel4.setText("Materia");

        jLabel5.setText("Nota");

        jLabel6.setText("Estado");

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Leer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("No. Materia");

        jTextField5.setEnabled(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APROBADO", "DESAPROBADO" }));

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jLabel1.setText("No. Documento Estudiante");

        jButton5.setText("Consultar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre carrera");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Consultar materias desaprobadas por estudiante");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Consultar promedio de materias por carrera");

        jButton7.setText("Consultar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Consultar materias por semestre y carrera");

        jLabel12.setText("Semestre");

        jLabel13.setText("Nombre carrera");

        jButton9.setText("Consultar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton11.setText("Limpiar campos de consulta");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(14, 14, 14)))
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                    .addGap(75, 75, 75)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField7)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(14, 14, 14)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton11)))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        /**
         * Cuando se seleeciona una opcion en el comboBox
         * lee el indice de la materia seleccionada, el indice es el mismo
         * que en la lista de materias, por lo tanto dicho indice sirve para consular el numero de materia
         * en la lista de materias y lo agrega a jTextField5
         */
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            int indexMateriaSeleccionada = jComboBox2.getSelectedIndex();
            int numeroMateriaSeleccionada = listaMateria.get(indexMateriaSeleccionada).getNumeromateria();
            jTextField5.setText(String.valueOf(numeroMateriaSeleccionada));
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            int indexEstudianteSeleccionado = jComboBox3.getSelectedIndex();
            Long numeroEstudianteSeleccionado = listaEstudiante.get(indexEstudianteSeleccionado).getDocumentoestudiante();
            jTextField2.setText(String.valueOf(numeroEstudianteSeleccionado));
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    /**
     * Crear Matriícula
     *
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Long documentoEstudiante = Long.parseLong(jTextField2.getText());
            Integer numeroMateria = Integer.parseInt(jTextField5.getText());
            Double nota = Double.parseDouble(jTextField4.getText());
            String estado = jComboBox1.getSelectedItem()+"";
            
            Estudiante estudiante;
            EstudianteJpaController controladorEstudiante = new EstudianteJpaController();
            estudiante = controladorEstudiante.findEstudiante(documentoEstudiante);
            
            Materia materia;
            MateriaJpaController controladorMateria = new MateriaJpaController();
            materia = controladorMateria.findMateria(numeroMateria);
            
            matricula.setEstudiante(estudiante);
            matricula.setMateria(materia);
            matricula.setNota(nota);
            matricula.setEstado(estado);
            
            MatriculaJpaController controladorMatricula= new MatriculaJpaController();
            controladorMatricula.create(matricula);
            JOptionPane.showMessageDialog(this, "Matricula realizada exitosamente");
            
            jTextField4.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Leer Matrícula
     *
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Long documentoEstudiante = Long.parseLong(jTextField2.getText());
            Integer numeroMateria = Integer.parseInt(jTextField5.getText());
            
            MatriculaJpaController controladorMatricula = new MatriculaJpaController();
            MatriculaPK llavePrimariaMatricula = new MatriculaPK(documentoEstudiante, numeroMateria);
            matricula = controladorMatricula.findMatricula(llavePrimariaMatricula);
            
            jTextField4.setText(String.valueOf(matricula.getNota()));
            if (matricula.getEstado().equals("APROBADO")) {
                jComboBox1.setSelectedIndex(0);
            } else {
                jComboBox1.setSelectedIndex(1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "El estudiante no ha matriculado esta materia.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Actualizar Matrícula
     *
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Long documentoEstudiante = Long.parseLong(jTextField2.getText());
            Integer numeroMateria = Integer.parseInt(jTextField5.getText());
            Double nota = Double.parseDouble(jTextField4.getText());
            String estado = jComboBox1.getSelectedItem()+"";
            
            MatriculaJpaController controladorMatricula = new MatriculaJpaController();
            MatriculaPK llavePrimariaMatricula = new MatriculaPK(documentoEstudiante, numeroMateria);
            matricula = controladorMatricula.findMatricula(llavePrimariaMatricula);
            
            matricula.setNota(nota);
            matricula.setEstado(estado);
            
            controladorMatricula.edit(matricula);
            JOptionPane.showMessageDialog(this, "Matricula actualizada.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "El estudiante no ha matriculado esta materia.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Eliminar Matrícula
     * 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Long documentoEstudiante = Long.parseLong(jTextField2.getText());
            Integer numeroMateria = Integer.parseInt(jTextField5.getText());
            
            MatriculaJpaController controladorMatricula = new MatriculaJpaController();
            MatriculaPK llavePrimariaMatricula = new MatriculaPK(documentoEstudiante, numeroMateria);
            controladorMatricula.destroy(llavePrimariaMatricula);
            JOptionPane.showMessageDialog(this, "Matricula eliminada.");
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(this, "El estudiante no ha matriculado esta materia.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Botón para consultar las materias desaprobadas por un estudiante
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        this.jTextField3.setText(" ");
        this.jTextField6.setText(" ");
        this.jTextField7.setText(" ");
        
        MatriculaJpaController controladorMatricula = new MatriculaJpaController();
        Long idEstudiante = Long.parseLong(jTextField1.getText());
        List<String> listaMaterias = controladorMatricula.consultarDesaprobados(idEstudiante);
        
        if(listaMaterias.isEmpty()){
            this.jTextArea1.setText("No se encontraron registros.");
        }
        else{
            this.jTextArea1.setText("");
            this.jTextArea1.append("Materias desaprobadas por " + idEstudiante + "\n\n");
            for(String s: listaMaterias){
                this.jTextArea1.append(s + " \n");           
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Botón para consultar el promedio de notas de todas las materias de una determinada carrera
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        this.jTextField1.setText("");
        this.jTextField6.setText("");
        this.jTextField7.setText("");
        
        MatriculaJpaController controladorMatricula = new MatriculaJpaController();
        String nomCarrera = jTextField3.getText();
        Double promedio = controladorMatricula.promedioEstudiantesxCarrera(nomCarrera);
        
        try{
            this.jTextArea1.setText("");
            this.jTextArea1.append("Promedio de notas de las materias de " + nomCarrera + "\n\n");
            this.jTextArea1.append(promedio.toString());            
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(jComboBox1, "Carrera no existe");
            this.jTextField3.setText("");
            this.jTextArea1.setText("");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    // Botón para consultar todas las materias que se dan en un semestre de una carrera determinada
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        this.jTextField1.setText("");
        this.jTextField3.setText("");
        
        MatriculaJpaController controladorMatricula = new MatriculaJpaController();
        Integer semestre = Integer.parseInt(jTextField6.getText());
        String nomCarrera = jTextField7.getText();
        
        List<String> listaMaterias = controladorMatricula.consultarMateriasxSemxCarr(semestre, nomCarrera);
        
        if(listaMaterias.isEmpty()){
            this.jTextArea1.setText("No se encontraron registros.");
        }
        else{
            this.jTextArea1.setText("");
            this.jTextArea1.append("Materias dadas en el semestre " + semestre + " de " + nomCarrera + "\n\n");
            for(String s: listaMaterias){
                this.jTextArea1.append(s + " \n");           
            }
        }        
    }//GEN-LAST:event_jButton9ActionPerformed

    // Botón para limpiar todos los campos de consulta
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.jTextField1.setText(" ");
        this.jTextField3.setText(" ");        
        this.jTextField6.setText(" ");
        this.jTextField7.setText(" ");
    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
