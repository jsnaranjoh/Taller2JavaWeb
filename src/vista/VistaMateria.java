/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.Carrera;
import modelo.Materia;
import persistencia.CarreraJpaController;
import persistencia.MateriaJpaController;
import persistencia.exceptions.IllegalOrphanException;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author jsnar
 */
public class VistaMateria extends javax.swing.JPanel {

    private int cantidadCarreras;
    private List<Carrera> listaCarreras;
    private CarreraJpaController controladorCarrera = new CarreraJpaController();
    
    /**
     * Creates new form VistaMateria
     */
    public VistaMateria() {
        
        /** 
         * Variables que serán útiles para la caja de selección de opciones:
         * Variable para contar la cantidad de items del JComboBox
         * Variable para contener la lista de carreras (items del JComboBox)
         */
        cantidadCarreras = controladorCarrera.getCarreraCount();
        listaCarreras = controladorCarrera.findCarreraEntities();
        
        initComponents();
        
        /**
         * Se almacena para leer el índice del item seleccionado.
         * De acuerdo al índice se obtendrá de la lista el nombre de la carrera
         * y permitirá que un campo de texto la visualice.
         */
        int indexCarrera = jComboBox1.getSelectedIndex();
        String nombreCarrera = listaCarreras.get(indexCarrera).getNombrecarrera();
        jTextField4.setText(nombreCarrera);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        jLabel2.setText("No. Materia");

        jLabel3.setText("Nombre");

        jLabel4.setText("No. Créditos");

        jLabel5.setText("Carrera");

        jTextField4.setFocusable(false);

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

        jComboBox1.setMaximumRowCount(cantidadCarreras);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(listaCarreras.toArray()));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Materias que tienen 4 créditos");

        jButton5.setText("Consultar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Consultar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Materias que dicta un docente en una carrera");

        jLabel7.setText("Nombre Docente");

        jLabel8.setText("Nombre Carrera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(400, 400, 400)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(2, 2, 2)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

    }// </editor-fold>//GEN-END:initComponents

    // Método para limpiar los campos
    private void limpiar(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");            
        this.jComboBox1ItemStateChanged();
    }
    
    // Método que permite crear la materia al presionar el botón "Crear"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            MateriaJpaController controladorMateria = new MateriaJpaController();
            Materia materia = new Materia();
            
            Integer numMateria = Integer.parseInt(jTextField1.getText());
            String nomMateria = jTextField2.getText();
            Integer numCreditos = Integer.parseInt(jTextField3.getText());
            Carrera carrera = (Carrera) jComboBox1.getSelectedItem();   // Objeto Carrera seleccionado

            materia.setNumeromateria(numMateria);
            materia.setNombremateria(nomMateria);
            materia.setCreditosmateria(numCreditos);
            
            carrera.getNumerocarrera();         // Se obtiene el número de carrera del objeto
            materia.setNumerocarrera(carrera);  // Con que se sepa el numerocarrera el programa sabrá a 
                                                // qué carrera se le debe asignar la materia
            
            controladorMateria.create(materia);
            JOptionPane.showMessageDialog(null, "Materia adicionada con éxito.");
            
            this.limpiar();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Método sobrecargado para la reinicialización del JComboBox al primer item.
    private void jComboBox1ItemStateChanged() {                                            
        int indexCarrera = 0;
        jComboBox1.setSelectedIndex(indexCarrera);
        String nombreCarrera = listaCarreras.get(indexCarrera).getNombrecarrera();
        jTextField4.setText(nombreCarrera);
    }    
    
    // Método que permitirá visualizar la carrera que se seleccionó.
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        int indexCarrera = jComboBox1.getSelectedIndex();
        String nombreCarrera = listaCarreras.get(indexCarrera).getNombrecarrera();
        jTextField4.setText(nombreCarrera);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    // Método que permite leer la información de la materia al accionar el botón "Leer"
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Ingrese código materia.");
        }
        else{
            try{
                MateriaJpaController controladorMateria = new MateriaJpaController();

                Integer numMateria = Integer.parseInt(jTextField1.getText());        
                Materia materia = controladorMateria.findMateria(numMateria);

                jTextField2.setText(materia.getNombremateria());
                jTextField3.setText(materia.getCreditosmateria().toString());
                jComboBox1.setSelectedItem(materia.getNumerocarrera());
                jTextField4.setText(materia.getNumerocarrera().getNombrecarrera());            
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Materia no existe.");
                this.limpiar();
            }            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Método que permite la eliminación de la materia al presionar el botón "Eliminar"
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Ingrese código materia.");
        }
        else{
            try {
                MateriaJpaController controladorMateria = new MateriaJpaController();

                Integer numMateria = Integer.parseInt(jTextField1.getText());
                Materia materia = controladorMateria.findMateria(numMateria);

                controladorMateria.destroy(numMateria);
                JOptionPane.showMessageDialog(null, "Materia eliminada con éxito.");
            } 
            catch (NumberFormatException | NonexistentEntityException ex) {
                JOptionPane.showMessageDialog(null, "Materia no existe.");
            }
            catch (IllegalOrphanException ex){
                JOptionPane.showMessageDialog(null, "Materia tiene matrículas asociadas.");
            }
        }
        
        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    // Método que permite editar la información de la materia al presionar el botón "Actualizar"
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Ingrese código materia.");
        }
        else{
            try {
                MateriaJpaController controladorMateria = new MateriaJpaController();

                Integer numMateria = Integer.parseInt(jTextField1.getText());        
                Materia materia = controladorMateria.findMateria(numMateria);

                String nomMateria = jTextField2.getText();
                Integer numCreditos = Integer.parseInt(jTextField3.getText());
                Carrera carrera = (Carrera) jComboBox1.getSelectedItem();   // Objeto Carrera seleccionado

                materia.setNumeromateria(numMateria);
                materia.setNombremateria(nomMateria);
                materia.setCreditosmateria(numCreditos);

                carrera.getNumerocarrera();         // Se obtiene el número de carrera del objeto
                materia.setNumerocarrera(carrera);  // Con que se sepa el numerocarrera el programa sabrá a
                // qué carrera se le debe asignar la materia

                controladorMateria.edit(materia);
                JOptionPane.showMessageDialog(null, "Materia actualizada con éxito.");

                this.limpiar();
            } catch (NonexistentEntityException ex) {
                JOptionPane.showMessageDialog(null, "Materia no existe.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ningún campo puede quedar vacío.");
            }        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Botón para consultar materias que tengan 4 créditos o menos
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        this.jTextArea1.setText("");
        MateriaJpaController controladorMateria = new MateriaJpaController();       
        List<Materia> listaMaterias = controladorMateria.consultarMaterias();
        
        this.jTextArea1.append("Materias con 4 créditos o menos\n\n");        
        for(Materia m: listaMaterias)
        {
            this.jTextArea1.append(m.getNombremateria() + ": " + m.getCreditosmateria() + " créditos\n");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Botón para consultar las materias que dicta un docente en una determinada carrera
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        this.jTextArea1.setText("");
        MateriaJpaController controladorMateria = new MateriaJpaController();
        String nomDocente = jTextField5.getText();
        String nomCarrera = jTextField6.getText();
        
        List<String> listaMaterias = controladorMateria.consultarMateriasxDocxCarr(nomDocente, nomCarrera);

        if(listaMaterias.isEmpty())
        {
            this.jTextArea1.append("No se encontraron registros.");
        }
        else
        {
            for(String s: listaMaterias)
            {
                this.jTextArea1.append(s + "\n");
            }            
        }
    }//GEN-LAST:event_jButton7ActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
