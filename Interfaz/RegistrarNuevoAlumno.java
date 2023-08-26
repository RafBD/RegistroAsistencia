package Interfaz;

import Clases.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafab
 */
public class RegistrarNuevoAlumno extends javax.swing.JFrame {

    public RegistrarNuevoAlumno() {
        initComponents();
        // Centrar el formulario
        this.setLocationRelativeTo(this);
        txtId.setVisible(false);
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cboCarrera = new javax.swing.JComboBox<>();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cboPeriodoEscolar = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboGrupo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registra un Nuevo Alumno");

        tblAlumnos.setForeground(new java.awt.Color(51, 51, 51));
        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Matrícula", "Nombre", "Carrera", "Correo", "Periodo Escolar", "Grupo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Matrícula");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Carrera");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Periodo Escolar");

        txtMatricula.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(51, 51, 51));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));

        cboCarrera.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cboCarrera.setForeground(new java.awt.Color(51, 51, 51));
        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Opcion", "Administración de Empresas", "Contaduría", "Comercio Exterior y Gestión Aduanera", "Mercadotecnia y Relaciones Comerciales", "Tecnologías de la Información en los negocios" }));
        cboCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCarreraActionPerformed(evt);
            }
        });

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));

        btnGuardar.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 255, 153));
        btnModificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(51, 51, 51));
        btnModificar.setText("MODIFICAR");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 51, 0));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(102, 153, 255));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR FORMULARIO");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cboPeriodoEscolar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cboPeriodoEscolar.setForeground(new java.awt.Color(51, 51, 51));
        cboPeriodoEscolar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Opcion", "Cuatrimestre", "Semestre" }));
        cboPeriodoEscolar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Grupo");

        cboGrupo.setForeground(new java.awt.Color(51, 51, 51));
        cboGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Contraseña");

        txtPassWord.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtMatricula)
                            .addComponent(cboCarrera, 0, 1, Short.MAX_VALUE)
                            .addComponent(txtCorreo)
                            .addComponent(cboPeriodoEscolar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboGrupo, 0, 297, Short.MAX_VALUE)
                            .addComponent(txtPassWord))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboPeriodoEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoIcon.png"))); // NOI18N
        jLabel7.setText("Made By");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnRegresar.setForeground(new java.awt.Color(51, 51, 51));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backIcon.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(504, 504, 504))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnRegresar)
                        .addGap(398, 398, 398)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Connection con = CConexion.getConnection();
        String matricula = txtMatricula.getText();
        String nombre = txtNombre.getText();
        String carrera = cboCarrera.getSelectedItem().toString();
        String correo = txtCorreo.getText();
        String periodoEscolar = cboPeriodoEscolar.getSelectedItem().toString();
        String grupo = cboGrupo.getSelectedItem().toString();

        if (matricula.equals("") || nombre.equals("") || carrera.equals("") || correo.equals("") || periodoEscolar.equals("")) {
            JOptionPane.showMessageDialog(null, "Error. Todos los campos deben estar llenos");
        } else {

            switch (carrera) {
                case "Administración de Empresas":
                    revisarOpcionPeriodoEscolar();
                    break;
                case "Contaduría":
                    revisarOpcionPeriodoEscolar();
                    break;
                case "Comercio Exterior y Gestión Aduanera":
                    revisarOpcionPeriodoEscolar();
                    break;
                case "Mercadotecnia y Relaciones Comerciales":
                    revisarOpcionPeriodoEscolar();
                    break;
                case "Tecnologías de la Información en los negocios":
                    revisarOpcionPeriodoEscolar();
                    break;
                case "Selecciona una Opcion":
                    // Si no se selecciona una carrera muestra un mensaje de seleccion
                    JOptionPane.showMessageDialog(null, "Por favor selecciona una opción");
                    break;
            }

            switch (grupo) {

                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "10":
                    break;
                case "11":
                    break;
                case "12":
                    break;

            }

        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked

        try {

            int fila = tblAlumnos.getSelectedRow();
            int id = Integer.parseInt(tblAlumnos.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;

            Connection con = CConexion.getConnection();
            ps = con.prepareStatement("SELECT Matricula, Nombre, Carrera, Correo, PeriodoEscolar, Grupo FROM Estudiantes WHERE Id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtId.setText(String.valueOf(id));
                txtMatricula.setText(rs.getString("Matricula"));
                txtNombre.setText(rs.getString("Nombre"));
                cboCarrera.setSelectedItem(rs.getString("Carrera"));
                txtCorreo.setText(rs.getString("Correo"));
                cboPeriodoEscolar.setSelectedItem(rs.getString("PeriodoEscolar"));
                cboGrupo.setSelectedItem(rs.getString("Grupo"));

            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.toString());
        }
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cboCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCarreraActionPerformed
        String carrera = cboCarrera.getSelectedItem().toString();

        switch (carrera) {
            case "Administración de Empresas":
                break;
            case "Contaduría":
                break;
            case "Comercio Exterior y Gestión Aduanera":
                break;
            case "Mercadotecnia y Relaciones Comerciales":
                break;
            case "Tecnologías de la Información en los negocios":
                break;
            case "Selecciona una opción":
                JOptionPane.showMessageDialog(null, "Por favor, selecciona una opción");
                break;
        }
    }//GEN-LAST:event_cboCarreraActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        modificarDatos();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
        MenuAdministrador RegresarAMenu = new MenuAdministrador();
        RegresarAMenu.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void limpiar() {
        txtMatricula.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
    }

    // MOSTRAR LISTA DE TODOS LOS ALUMNOS
    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlumnos.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {10, 10, 100, 100, 100, 100, 5};

        for (int i = 0; i < tblAlumnos.getColumnCount(); i++) {

            tblAlumnos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {

            Connection con = CConexion.getConnection();
            ps = con.prepareStatement("SELECT Id, Matricula, Nombre, Carrera, Correo, PeriodoEscolar, Grupo FROM Estudiantes ORDER BY Carrera");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {

                Object[] fila = new Object[columnas];

                for (int indice = 0; indice < columnas; indice++) {

                    fila[indice] = rs.getObject(indice + 1);
                }

                modeloTabla.addRow(fila);
            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.toString());

        }

    }

    private void revisarOpcionPeriodoEscolar() {

        String periodoEscolar = cboPeriodoEscolar.getSelectedItem().toString();

        switch (periodoEscolar) {
            case "Cuatrimestre":
                insertarDatos();
                break;
            case "Semestre":
                insertarDatos();
                break;
            case "Selecciona una Opcion":
                // Si no se selecciona una carrera muestra un mensaje de seleccion
                JOptionPane.showMessageDialog(null, "Por favor selecciona una opción");
                break;
        }

    }

    /*private void insertarDatos() {

        Connection con = CConexion.getConnection();
        String matricula = txtMatricula.getText();
        String nombre = txtNombre.getText();
        String carrera = cboCarrera.getSelectedItem().toString();
        String correo = txtCorreo.getText();
        String periodoEscolar = cboPeriodoEscolar.getSelectedItem().toString();
        String grupo = cboGrupo.getSelectedItem().toString();

        try {
            String buscarMatricula = matricula;
            PreparedStatement ps1 = con.prepareStatement("SELECT COUNT(*) FROM Estudiantes WHERE matricula = ?");
            ps1.setString(1, buscarMatricula);

            ResultSet buscarMatriculaResultado = ps1.executeQuery();

            if (buscarMatriculaResultado.next()) {

                int recuento = buscarMatriculaResultado.getInt(1);

                if (recuento > 0) {
                    JOptionPane.showMessageDialog(null, "La matricula " + matricula + " ya esta registrada");
                } else {
                    
                    

                    PreparedStatement ps = con.prepareStatement("INSERT INTO Estudiantes (Matricula, Nombre, Carrera, Correo, PeriodoEscolar, Grupo) VALUES (?, ?, ?, ?, ?, ?)");
                    ps.setString(1, matricula);
                    ps.setString(2, nombre);
                    ps.setString(3, carrera);
                    ps.setString(4, correo);
                    ps.setString(5, periodoEscolar);
                    ps.setString(6, grupo);

                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro Guardado Correctamente :-) ");
                    limpiar();
                    cargarTabla();

                }

            }

        } catch (SQLException err) {

            JOptionPane.showMessageDialog(null, err.toString());
        }

    }
     */
    private void insertarDatos() {
        Connection con = CConexion.getConnection();

        String matricula = txtMatricula.getText();
        String nombre = txtNombre.getText();
        String carrera = cboCarrera.getSelectedItem().toString();
        String correo = txtCorreo.getText();
        String periodoEscolar = cboPeriodoEscolar.getSelectedItem().toString();
        String grupo = cboGrupo.getSelectedItem().toString();
        String password = txtPassWord.getText(); // Obtener la contraseña ingresada por el administrador

        //------------------------------------------------
        //String facultad = cboFacultad.getSelectedItem().toString();
        try {
            String buscarMatricula = matricula;
            PreparedStatement ps1 = con.prepareStatement("SELECT COUNT(*) FROM Estudiantes WHERE matricula = ?");
            ps1.setString(1, buscarMatricula);

            ResultSet buscarMatriculaResultado = ps1.executeQuery();

            if (buscarMatriculaResultado.next()) {
                int recuento = buscarMatriculaResultado.getInt(1);

                if (recuento > 0) {
                    JOptionPane.showMessageDialog(null, "La matricula " + matricula + " ya esta registrada");
                } else {

                    try {
                        // Insertar la contraseña en la tabla "Passwords"
                        PreparedStatement psInsertPassword = con.prepareStatement("INSERT INTO Passwords (PasswordHash) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
                        psInsertPassword.setString(1, password);
                        psInsertPassword.executeUpdate();

                        ResultSet generatedKeys = psInsertPassword.getGeneratedKeys();
                        if (generatedKeys.next()) {
                            int idPasswordGenerada = generatedKeys.getInt(1);

                            // Insertar los datos del alumno en la tabla "Estudiantes" junto con el idPassword generado
                            String SQL = "EXEC InsertarDatosAlumnos ?, ?, ?, ?, ?, ?, ? ";
                            PreparedStatement ps = con.prepareStatement(SQL);

                            ps.setString(1, matricula);
                            ps.setString(2, nombre);
                            ps.setString(3, carrera);
                            ps.setString(4, correo);
                            ps.setString(5, periodoEscolar);
                            ps.setString(6, grupo);
                            ps.setInt(7, idPasswordGenerada);

                            ResultSet rs = ps.executeQuery();

                            while (rs.next()) {
                                System.out.println("DATOS INSERTADOS CON EL STORED PROCEDURE: \n\n");
                                String matriculaSP = rs.getString("matricula");
                                System.out.println(matriculaSP);
                                String nombreSP = rs.getString("nombre");
                                System.out.println(nombreSP);
                                String carreraSP = rs.getString("carrera");
                                System.out.println(carreraSP);
                                String periodoEscolarSP = rs.getString("correo");
                                System.out.println(periodoEscolarSP);
                                String grupoSP = rs.getString("periodoEscolar");
                                System.out.println(grupoSP);
                                String idPassword = rs.getString("grupo");

                            }

                            JOptionPane.showMessageDialog(null, "Registro Guardado Correctamente :-) ");
                            limpiar();
                            cargarTabla();
                        }
                    } catch (SQLException err) {
                        JOptionPane.showMessageDialog(null, err.toString());
                    }
                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.toString());
        }
    }

    private void modificarDatos() {

        Connection con = CConexion.getConnection();
        int id = Integer.parseInt(txtId.getText());
        String matricula = txtMatricula.getText();
        String nombre = txtNombre.getText();
        String carrera = cboCarrera.getSelectedItem().toString();
        String correo = txtCorreo.getText();
        String periodoEscolar = cboPeriodoEscolar.getSelectedItem().toString();
        String grupo = cboGrupo.getSelectedItem().toString();

        try {

            PreparedStatement ps = con.prepareStatement("UPDATE Estudiantes SET Matricula = ?, Nombre = ?, Carrera = ?, Correo = ?, PeriodoEscolar = ?, Grupo = ? WHERE id = ?");
            ps.setString(1, matricula);
            ps.setString(2, nombre);
            ps.setString(3, carrera);
            ps.setString(4, correo);
            ps.setString(5, periodoEscolar);
            ps.setString(6, grupo);
            ps.setInt(7, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado Correctamente :-) ");
            limpiar();
            cargarTabla();

        } catch (SQLException err) {

            JOptionPane.showMessageDialog(null, err.toString());
        }

    }

    private void eliminarDatos() {

        Connection con = CConexion.getConnection();
        int id = Integer.parseInt(txtId.getText());

        try {

            PreparedStatement ps = con.prepareStatement("DELETE FROM Estudiantes WHERE Id = ?");
            ps.setInt(1, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado Correctamente :-) ");
            limpiar();
            cargarTabla();

        } catch (SQLException err) {
            System.out.println(err.toString());
            JOptionPane.showMessageDialog(null, err.toString());
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
            java.util.logging.Logger.getLogger(RegistrarNuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarNuevoAlumno().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cboCarrera;
    private javax.swing.JComboBox<String> cboGrupo;
    private javax.swing.JComboBox<String> cboPeriodoEscolar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassWord;
    // End of variables declaration//GEN-END:variables
}
