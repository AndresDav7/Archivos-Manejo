package matricula;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Matricula extends javax.swing.JFrame {
   
    //Tablas
    String [][] materias;
    DefaultTableModel tblModelMaterias;
    
    String [][] estudiantes;
    DefaultTableModel tblModelEstudiantes;
    
    String [][] matricula;
    DefaultTableModel tblModelMatricula;
    
    //ComboBOx
    List<Materia> listaMaterias = new ArrayList<Materia>();
    DefaultComboBoxModel listaMateriasModel = 
            new DefaultComboBoxModel(listaMaterias.toArray());
    
    List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    DefaultComboBoxModel listaEstudiantesModel = 
            new DefaultComboBoxModel(listaEstudiantes.toArray());
    
    ArrayList<Object> materiaD = new ArrayList<>();
    ArrayList<Object> estudianteD = new ArrayList<>();
    int cont = 0;
    //boolean inicio = true;
    
    ClsControlador controller = new ClsControlador();
    
    public Matricula() {
        initComponents();  
        
        materiaD = controller.extraerObjetos("materia.dat");
        estudianteD = controller.extraerObjetos("estudiante.dat");
        
        if(materiaD.size() > 0){
            Materia ultimo = (Materia) materiaD.get(materiaD.size()-1);
            cont = ultimo.getId();
        }
        if(estudianteD.size() > 0){
            Estudiante ultimo = (Estudiante) estudianteD.get(estudianteD.size()-1);
            cont = ultimo.getId();
        }
        /*
        Inicializo Tabla materias
        */
        
        String titulosColumnasMaterias[] = new String [] {
            "Materia"
        };
        
        tblModelMaterias = new DefaultTableModel(materias, titulosColumnasMaterias);
        tblMaterias.setModel(tblModelMaterias);
        
        
        /*
        Inicializo tabla estudiantes
        */
       
        String titulosColumnasEstudiantes[] = new String [] {
            "Nombre", "Apellido", "Edad"
        };
        
        tblModelEstudiantes = new DefaultTableModel(estudiantes, titulosColumnasEstudiantes);
        tblEstudiantes.setModel(tblModelEstudiantes);
        
        /*
        Inicio tabla Matricula
        */
        String tituloMatricula[] = new String[]{
            "Nombre", "Materia"
        };
        
        tblModelMatricula = new DefaultTableModel(matricula,tituloMatricula);
        tblMatricula.setModel(tblModelMatricula);
        
        /*
        Inicializo COMBOBOX  de materias y estudiantes
        */
        cmbListaMaterias.setModel(listaMateriasModel);
        cmbListaEstudiantes.setModel(listaEstudiantesModel);
        
        //leno con los datos del archivo
        //el combobox y la tabla repesctivamente asignadas
        
        llenarCombo();
        llenarGrid();
        llenarComboEstudiantes();
        llenarGridEstudiantes();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombreMateria = new javax.swing.JLabel();
        txtNombreMateria = new javax.swing.JTextField();
        btnAgregarMateria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblNombreEstudiante = new javax.swing.JLabel();
        lblApellidoEstudiante = new javax.swing.JLabel();
        lblEdadEstudiante = new javax.swing.JLabel();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtApellidoEstudiante = new javax.swing.JTextField();
        txtEdadEstudiante = new javax.swing.JTextField();
        btnRegistrarEstudiante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbListaEstudiantes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbListaMaterias = new javax.swing.JComboBox<>();
        btnMatricularEstudiante = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatricula = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombreMateria.setText("Nombre");

        btnAgregarMateria.setText("Agregar materia");
        btnAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMateriaActionPerformed(evt);
            }
        });

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tblMaterias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(btnAgregarMateria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(lblNombreMateria)
                        .addGap(48, 48, 48)
                        .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMateria)
                    .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarMateria)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Materias", jPanel1);

        lblNombreEstudiante.setText("Nombre");

        lblApellidoEstudiante.setText("Apellido");

        lblEdadEstudiante.setText("Edad");

        btnRegistrarEstudiante.setText("Registrar Estudiante");
        btnRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEstudianteActionPerformed(evt);
            }
        });

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblEstudiantes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreEstudiante)
                            .addComponent(lblApellidoEstudiante)
                            .addComponent(lblEdadEstudiante))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(txtApellidoEstudiante))
                            .addComponent(txtEdadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btnRegistrarEstudiante))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEstudiante)
                    .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoEstudiante)
                    .addComponent(txtApellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadEstudiante)
                    .addComponent(txtEdadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estudiantes", jPanel2);

        jLabel3.setText("Estudiante");

        cmbListaEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaEstudiantesActionPerformed(evt);
            }
        });

        jLabel1.setText("Materia");

        cmbListaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaMateriasActionPerformed(evt);
            }
        });

        btnMatricularEstudiante.setText("Matricular");
        btnMatricularEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularEstudianteActionPerformed(evt);
            }
        });

        tblMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Materia"
            }
        ));
        jScrollPane3.setViewportView(tblMatricula);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbListaEstudiantes, 0, 154, Short.MAX_VALUE)
                            .addComponent(cmbListaMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnMatricularEstudiante)
                        .addGap(325, 325, 325))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbListaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnMatricularEstudiante)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Matrículas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMateriaActionPerformed
        
        tblModelMaterias.setRowCount(0);
        llenarGrid();
        
        Materia newMateria = new Materia(txtNombreMateria.getText());      
        
        cont++;
        Materia estudiante = new Materia(cont, txtNombreMateria.getText());
        materiaD.add(estudiante);
        controller.escribirObjeto("materia.dat", materiaD);
        materiaD = controller.extraerObjetos("materia.dat");
        //limpiar();
        llenarCombo();
        
        tblModelMaterias.addRow(new String[]{newMateria.getNombre()});        
        listaMateriasModel.addElement(newMateria);
        
        
    }//GEN-LAST:event_btnAgregarMateriaActionPerformed

    private void btnRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteActionPerformed
        
        tblModelEstudiantes.setRowCount(0);
        llenarGridEstudiantes();

        String nombre = txtNombreEstudiante.getText();
        String apellido = txtApellidoEstudiante.getText();
        int edad = Integer.parseInt(txtEdadEstudiante.getText());
        
        Estudiante newEstudiante = new Estudiante(nombre, apellido, edad);
        
        cont++;
        Estudiante estu = new Estudiante(cont, txtNombreEstudiante.getText(), txtApellidoEstudiante.getText(), edad);
        estudianteD.add(estu);
        controller.escribirObjeto("estudiante.dat", estudianteD);
        estudianteD = controller.extraerObjetos("estudiante.dat");
        //limpiar();
        llenarComboEstudiantes();
        
        tblModelEstudiantes.addRow(new String[]{newEstudiante.getNombre(), newEstudiante.getApellido(), ""+newEstudiante.getEdad()});
        listaEstudiantesModel.addElement(newEstudiante);
       
    }//GEN-LAST:event_btnRegistrarEstudianteActionPerformed

    private void btnMatricularEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularEstudianteActionPerformed
        
        String materias = cmbListaMaterias.getSelectedItem().toString();
        String estudiantes = cmbListaEstudiantes.getSelectedItem().toString();
             
        tblModelMatricula.addRow(new String[]{estudiantes,materias,});
        
    }//GEN-LAST:event_btnMatricularEstudianteActionPerformed

    private void cmbListaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListaMateriasActionPerformed
        
    }//GEN-LAST:event_cmbListaMateriasActionPerformed

    private void cmbListaEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListaEstudiantesActionPerformed
        
    }//GEN-LAST:event_cmbListaEstudiantesActionPerformed

    /**
     * @param args the command line arguments
     */
       
    public void llenarCombo(){
        if(materiaD.size() > 0){
            cmbListaMaterias.setEnabled(true);
            materiaD = controller.extraerObjetos("materia.dat");
            cmbListaMaterias.setModel(new javax.swing.DefaultComboBoxModel(materiaD.toArray()));
        }else{
            cmbListaMaterias.setEnabled(false);
        }
    }
    
    public void llenarGrid(){
        if(materiaD.size() > 0){
            Materia est = new Materia();
            DefaultTableModel model = (DefaultTableModel) tblMaterias.getModel();
            for(int i = 0; i < materiaD.size(); i ++){
                est = (Materia) materiaD.get(i);
                System.out.println(est.getNombre());
                Object estudiantesG [] = {est.getNombre()};
                model.insertRow(i, estudiantesG);
            }
        }
    }
    
     public void llenarComboEstudiantes(){
        if(estudianteD.size() > 0){
            cmbListaEstudiantes.setEnabled(true);
            estudianteD = controller.extraerObjetos("estudiante.dat");
            cmbListaEstudiantes.setModel(new javax.swing.DefaultComboBoxModel(estudianteD.toArray()));
        }else{
            cmbListaEstudiantes.setEnabled(false);
        }
    }
    
    public void llenarGridEstudiantes(){
        if(estudianteD.size() > 0){
            Estudiante est = new Estudiante();
            DefaultTableModel model = (DefaultTableModel) tblEstudiantes.getModel();
            for(int i = 0; i < estudianteD.size(); i ++){
                est = (Estudiante) estudianteD.get(i);
                System.out.println(est.getNombre());
                Object estudiantesG [] = {est.getNombre(), est.getApellido(), est.getEdad()};
                model.insertRow(i, estudiantesG);
            }
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMateria;
    private javax.swing.JButton btnMatricularEstudiante;
    private javax.swing.JButton btnRegistrarEstudiante;
    private javax.swing.JComboBox<String> cmbListaEstudiantes;
    private javax.swing.JComboBox<String> cmbListaMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApellidoEstudiante;
    private javax.swing.JLabel lblEdadEstudiante;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblNombreMateria;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTable tblMatricula;
    private javax.swing.JTextField txtApellidoEstudiante;
    private javax.swing.JTextField txtEdadEstudiante;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtNombreMateria;
    // End of variables declaration//GEN-END:variables
}