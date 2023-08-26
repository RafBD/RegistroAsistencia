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
public class RegistrarNuevoProfesor extends javax.swing.JFrame {

    public RegistrarNuevoProfesor() {
        initComponents();
        // Centrar el formulario
        this.setLocationRelativeTo(this);
        txtId.setVisible(false);
        cargarTabla();
        cargarFacultades();

        cboFacultad.addActionListener(e -> {
            String facultadSeleccionada = (String) cboFacultad.getSelectedItem();
            cargarCarreras(facultadSeleccionada);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfesores = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cboFacultad = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboCarrera = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registra un Nuevo Profesor");

        tblProfesores.setForeground(new java.awt.Color(51, 51, 51));
        tblProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Matrícula", "Nombre", "Facultad", "Carrera", "Materia", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfesoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProfesores);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Matrícula");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Facultad");

        txtMatricula.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

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

        cboFacultad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cboFacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Opcion" }));
        cboFacultad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Carrera");

        cboCarrera.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Opcion", "Biologia", "Biologia Clinica", "Ingenieria en Alimentos", "Biotecnologia", "Quimico Farmaceutico Biologo", "Contaduria", "Administracion de Empresas", "Comercio Exterior y Gestion Aduanera", "Mercadotecnia y Relaciones Comerciales", "Tecnologias de la Informacion en los Negocios", "Comunicacion y Multimedios", "Diseño de la Comunicacion Visual", "Pedagogia", "Derecho" }));
        cboCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCarreraActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Correo");

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Contraseña");

        txtPassWord.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtMatricula)
                            .addComponent(cboFacultad, 0, 297, Short.MAX_VALUE)
                            .addComponent(cboCarrera, 0, 1, Short.MAX_VALUE)
                            .addComponent(txtCorreo)
                            .addComponent(txtPassWord))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(47, 47, 47)
                        .addComponent(btnModificar)
                        .addGap(39, 39, 39)
                        .addComponent(btnEliminar)
                        .addGap(36, 36, 36)
                        .addComponent(btnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoIcon.png"))); // NOI18N
        jLabel7.setText("Made By");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

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
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(446, 446, 446))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
        String facultad = cboFacultad.getSelectedItem().toString();
        String carrera = cboCarrera.getSelectedItem().toString();
        String correo = txtCorreo.getText();

        if (matricula.equals("") || nombre.equals("") || facultad.equals("") || carrera.equals("") || correo.equals("")) {
            JOptionPane.showMessageDialog(null, "Error. Todos los campos deben estar llenos");
        } else {

            insertarDatos();

        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfesoresMouseClicked

        try {

            int fila = tblProfesores.getSelectedRow();
            int id = Integer.parseInt(tblProfesores.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;

            Connection con = CConexion.getConnection();
            ps = con.prepareStatement("SELECT Matricula, Nombre, idFacultad,idLicenciatura, Correo FROM Profesores WHERE IdProfesor = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtId.setText(String.valueOf(id));
                txtMatricula.setText(rs.getString("Matricula"));
                txtNombre.setText(rs.getString("Nombre"));
                cboFacultad.setSelectedItem("idFacultad");
                cboCarrera.setSelectedItem("idLicenciatura");
                txtCorreo.setText(rs.getString("Correo"));

            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.toString());
        }
    }//GEN-LAST:event_tblProfesoresMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cboCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCarreraActionPerformed

    }//GEN-LAST:event_cboCarreraActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        modificarDatos();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuAdministrador RegresarAMenu = new MenuAdministrador();
        RegresarAMenu.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void limpiar() {
        txtMatricula.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        cboFacultad.setSelectedItem("Selecciona una Opcion");
        cboCarrera.setSelectedItem("Selecciona una Opcion");
    }

    // MOSTRAR LISTA DE TODOS LOS PROFESORES
    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblProfesores.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {10, 10, 100, 100, 100, 100, 100};

        for (int i = 0; i < tblProfesores.getColumnCount(); i++) {

            tblProfesores.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {

            Connection con = CConexion.getConnection();
            ps = con.prepareStatement("SELECT " + "P.idProfesor, " + "P.matricula, " + "P.nombre, " + "F.nombreFacultad AS facultad, " + "L.nombreLicenciatura AS licenciatura, "
                    + "P.correo "
                    + "FROM "
                    + "Profesores P " + "INNER JOIN " + "Licenciaturas L ON P.idLicenciatura = L.idLicenciatura " + "INNER JOIN " + " Facultades F ON P.idFacultad = F.idFacultad;");
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

    private void insertarDatos() {
        Connection con = CConexion.getConnection();
        String matricula = txtMatricula.getText();
        String nombre = txtNombre.getText();
        String facultad = cboFacultad.getSelectedItem().toString();
        String carrera = cboCarrera.getSelectedItem().toString();
        String correo = txtCorreo.getText();
        String password = txtPassWord.getText(); // Obtener la contraseña ingresada por el administrador

        try {
            String buscarMatricula = matricula;
            PreparedStatement ps1 = con.prepareStatement("SELECT COUNT(*) FROM Profesores WHERE matricula = ?");
            ps1.setString(1, buscarMatricula);

            ResultSet buscarMatriculaResultado = ps1.executeQuery();

            if (buscarMatriculaResultado.next()) {
                int recuento = buscarMatriculaResultado.getInt(1);

                if (recuento > 0) {
                    JOptionPane.showMessageDialog(null, "La matricula " + matricula + " ya esta registrada");
                } else {
                    // Obtener el idFacultad a partir del nombre seleccionado en el combo box
                    int idFacultad = obtenerIdFacultad(con, facultad);

                    // Obtener el idLicenciatura a partir del nombre seleccionado en el combo box
                    int idLicenciatura = obtenerIdLicenciatura(con, carrera);

                    try {
                        // Insertar la contraseña en la tabla "Passwords"
                        PreparedStatement psInsertPassword = con.prepareStatement("INSERT INTO Passwords (PasswordHash) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
                        psInsertPassword.setString(1, password);
                        psInsertPassword.executeUpdate();

                        ResultSet generatedKeys = psInsertPassword.getGeneratedKeys();
                        if (generatedKeys.next()) {
                            int idPasswordGenerada = generatedKeys.getInt(1);

                            // Insertar los datos del profesor en la tabla "Profesores" junto con el idPassword generado
                            PreparedStatement ps = con.prepareStatement("INSERT INTO Profesores (matricula, nombre, idFacultad, idLicenciatura, correo, idPassword) VALUES (?, ?, ?, ?, ?, ?)");
                            ps.setString(1, matricula);
                            ps.setString(2, nombre);
                            ps.setInt(3, idFacultad);
                            ps.setInt(4, idLicenciatura);
                            ps.setString(5, correo);
                            ps.setInt(6, idPasswordGenerada);
                            ps.executeUpdate();

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

    private int obtenerIdFacultad(Connection con, String nombreFacultad) throws SQLException {
        String sql = "SELECT idFacultad FROM Facultades WHERE nombreFacultad = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nombreFacultad);
        ResultSet resultSet = ps.executeQuery();

        if (resultSet.next()) {
            return resultSet.getInt("idFacultad");
        }

        return -1; // Si no se encuentra el nombre de la facultad
    }

    private int obtenerIdLicenciatura(Connection con, String nombreLicenciatura) throws SQLException {
        String sql = "SELECT idLicenciatura FROM Licenciaturas WHERE nombreLicenciatura = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nombreLicenciatura);
        ResultSet resultSet = ps.executeQuery();

        if (resultSet.next()) {
            return resultSet.getInt("idLicenciatura");
        }

        return -1; // Si no se encuentra el nombre de la licenciatura
    }

    private void modificarDatos() {
        Connection con = CConexion.getConnection();
        int id = Integer.parseInt(txtId.getText());
        String matricula = txtMatricula.getText();
        String nombre = txtNombre.getText();
        String facultad = cboFacultad.getSelectedItem().toString();
        String carrera = cboCarrera.getSelectedItem().toString();
        String correo = txtCorreo.getText();

        if (facultad.equals("Selecciona una Opcion") || carrera.equals("Selecciona una Opcion")) {

            JOptionPane.showMessageDialog(null, "Selecciona una carrera y/o facultad");
        } else {
            try {
                // Obtener los IDs de la facultad y la carrera a partir de los nombres seleccionados
                int idFacultad = obtenerIdFacultad(con, facultad);
                int idLicenciatura = obtenerIdLicenciatura(con, carrera);

                PreparedStatement ps = con.prepareStatement("UPDATE Profesores SET Matricula = ?, Nombre = ?, idFacultad = ?, idLicenciatura = ?, Correo = ? WHERE idProfesor = ?");
                ps.setString(1, matricula);
                ps.setString(2, nombre);
                ps.setInt(3, idFacultad);
                ps.setInt(4, idLicenciatura);
                ps.setString(5, correo);
                ps.setInt(6, id);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Modificado Correctamente :-) ");
                limpiar();
                cargarTabla();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.toString());
            }
        }

    }

    private void eliminarDatos() {

        Connection con = CConexion.getConnection();
        int id = Integer.parseInt(txtId.getText());

        try {

            PreparedStatement ps = con.prepareStatement("DELETE FROM Profesores WHERE idProfesor = ?");
            ps.setInt(1, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado Correctamente :-) ");
            limpiar();
            cargarTabla();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.toString());
        }

    }

    private void cargarCarreras(String facultadSeleccionada) {
        cboCarrera.removeAllItems(); // Limpiamos las carreras anteriores
        Connection con = CConexion.getConnection();
        String consulta = "SELECT nombreLicenciatura FROM Licenciaturas "
                + "WHERE idFacultad = (SELECT idFacultad FROM Facultades WHERE nombreFacultad = ?)";
        try {
            PreparedStatement ps1 = con.prepareStatement(consulta);
            ps1.setString(1, facultadSeleccionada);
            try (ResultSet rs = ps1.executeQuery()) {
                while (rs.next()) {
                    String carrera = rs.getString("nombreLicenciatura");
                    cboCarrera.addItem(carrera);
                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.toString());
        }
    }

    private void cargarFacultades() {

        PreparedStatement ps;
        ResultSet rs;

        try {
            Connection con = CConexion.getConnection();
            ps = con.prepareStatement("SELECT nombreFacultad FROM Facultades");
            rs = ps.executeQuery();

            while (rs.next()) {
                String facultad = rs.getString("nombreFacultad");
                cboFacultad.addItem(facultad);
            }
        } catch (SQLException err) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JComboBox<String> cboFacultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProfesores;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassWord;
    // End of variables declaration//GEN-END:variables
}
