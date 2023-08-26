package Interfaz;

import Clases.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class VentanaRegistrarAsistencia extends javax.swing.JFrame {

    public VentanaRegistrarAsistencia() {
        initComponents();
        // Centrar el formulario
        this.setLocationRelativeTo(this);

        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFechaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnPresente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jCalendarFecha = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Asistencia");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registro de Asistencia");

        jFechaLabel.setBackground(new java.awt.Color(255, 255, 255));
        jFechaLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jFechaLabel.setToolTipText("");
        jFechaLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblAlumnos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblAlumnos.setForeground(new java.awt.Color(51, 51, 51));
        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Nombre", "Asistencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);
        if (tblAlumnos.getColumnModel().getColumnCount() > 0) {
            tblAlumnos.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnPresente.setBackground(new java.awt.Color(178, 242, 187));
        btnPresente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPresente.setForeground(new java.awt.Color(51, 51, 51));
        btnPresente.setText("PRESENTE");
        btnPresente.setBorder(null);
        btnPresente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresenteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("REGISTRA LA ASISTENCIA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPresente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnPresente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backIcon.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jCalendarFecha.setBackground(new java.awt.Color(255, 255, 255));
        jCalendarFecha.setForeground(new java.awt.Color(51, 51, 51));
        jCalendarFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCalendarFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendarFechaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jCalendarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCalendarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar)
                            .addComponent(jFechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        String usuario = null;
        MenuProfesor RegresarAMenu = new MenuProfesor(usuario);
        RegresarAMenu.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jCalendarFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarFechaMouseClicked
        // TODO add your handling code here:
        obtenerFechaSeleccionada();
    }//GEN-LAST:event_jCalendarFechaMouseClicked

    private void btnPresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresenteActionPerformed
        int filaSeleccionada = tblAlumnos.getSelectedRow();
        if (filaSeleccionada != -1) {
            String nombreAlumno = (String) tblAlumnos.getValueAt(filaSeleccionada, 1); // Nombre del alumno en la columna "Nombre"

            // Obtiene la fecha seleccionada del JCalendar
            Date fechaSeleccionada = jCalendarFecha.getDate();

            // Lógica para registrar la asistencia con la fecha y el nombre del alumno
            registrarAsistenciasSeleccionadas(nombreAlumno, fechaSeleccionada, "Presente");

            // Marca el checkbox de asistencia en la fila correspondiente
            tblAlumnos.setValueAt(true, filaSeleccionada, 2); // Suponiendo que la columna de asistencia (checkbox) está en la columna 2
        }
    }//GEN-LAST:event_btnPresenteActionPerformed

    private void cargarTabla() {

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlumnos.getModel();
        modeloTabla.setRowCount(0);

        int[] anchos = {10, 50, 20, 100};

        for (int i = 0; i < tblAlumnos.getColumnCount(); i++) {

            tblAlumnos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {

            Connection con = CConexion.getConnection();
            ps = con.prepareStatement("SELECT Matricula, Nombre FROM Estudiantes");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];

                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }

                // Agrega la información de asistencia a la fila
                //fila[columnas] = rs.getString("estadoAsistencia");
                modeloTabla.addRow(fila);
            }

            addCheckBox(2, tblAlumnos);

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.toString());

        }

    }

    private void addCheckBox(int column, JTable tblAlumnos) {
        TableColumn tc = tblAlumnos.getColumnModel().getColumn(column);
        tc.setCellEditor(tblAlumnos.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tblAlumnos.getDefaultRenderer(Boolean.class));
    }

    private boolean isSelected(int row, int column, JTable tblAlumnos) {
        return tblAlumnos.getValueAt(row, column) != null;
    }

    private void registrarAsistenciasSeleccionadas(String nombreAlumno, Date fecha, String estado) {
        try {
            Connection con = CConexion.getConnection(); // Get the database connection

            // Format the date in the appropriate format for SQL Server (yyyy-MM-dd)
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = sdf.format(fecha);

            // Check if there's already a registered attendance for the day
            String revisarRegistroAsistencia = "SELECT E.Nombre FROM AsistenciasEstudiantes AE "
                    + "INNER JOIN Estudiantes E ON AE.idEstudiante = E.Id "
                    + "WHERE AE.fechaAsistencia = ?";

            PreparedStatement psRevisarRegistroAsistencia = con.prepareStatement(revisarRegistroAsistencia);
            psRevisarRegistroAsistencia.setString(1, fechaFormateada);
            ResultSet rsRevisarRegistroAsistencia = psRevisarRegistroAsistencia.executeQuery();

            if (rsRevisarRegistroAsistencia.next()) {
                StringBuilder alumnosRegistrados = new StringBuilder();

                do {
                    alumnosRegistrados.append(rsRevisarRegistroAsistencia.getString("Nombre")).append("\n");
                } while (rsRevisarRegistroAsistencia.next());

                JOptionPane.showMessageDialog(null, "Este alumno ya tiene una fecha registrada este día:\n" + alumnosRegistrados);
            } else {
                // Prepara la sentencia SQL para insertar la asistencia
                for (int row = 0; row < tblAlumnos.getRowCount(); row++) {
                    if ((isSelected(row, 2, tblAlumnos))) {
                        nombreAlumno = tblAlumnos.getValueAt(row, 1).toString();

                        // Get student ID using JOIN instead of subquery
                        String studentIdQuery = "SELECT E.Id FROM Estudiantes E WHERE E.Nombre = ?";
                        PreparedStatement psStudentId = con.prepareStatement(studentIdQuery);
                        psStudentId.setString(1, nombreAlumno);
                        ResultSet rsStudentId = psStudentId.executeQuery();

                        if (rsStudentId.next()) {
                            int studentId = rsStudentId.getInt("Id");

                            String sql = "INSERT INTO AsistenciasEstudiantes (idEstudiante, fechaAsistencia, estadoAsistencia) "
                                    + "VALUES (?, ?, ?)";
                            PreparedStatement ps = con.prepareStatement(sql);

                            ps.setInt(1, studentId);
                            ps.setString(2, fechaFormateada);
                            ps.setString(3, estado);

                            // Execute the SQL statement
                            ps.executeUpdate();
                        }
                    }
                }

                con.commit();
                JOptionPane.showMessageDialog(null, "Asistencias Registradas Correctamente");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error al registrar las asistencias :( " + err.toString());
            System.out.println("Error registering attendances: " + err.toString());
        }
    }

    private void obtenerFechaSeleccionada() {
        Date fechaSeleccionada = jCalendarFecha.getDate();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaSeleccionada);

        String monthName = "";
        int year = jCalendarFecha.getCalendar().get(Calendar.YEAR);
        int month = jCalendarFecha.getCalendar().get(Calendar.MONTH);
        int day = jCalendarFecha.getCalendar().get(Calendar.DAY_OF_MONTH);

        switch (month) {

            case 0:
                monthName = "Ene";
                break;
            case 1:
                monthName = "Feb";
                break;
            case 2:
                monthName = "Mar";
                break;
            case 3:
                monthName = "Abr";
                break;
            case 4:
                monthName = "May";
                break;
            case 5:
                monthName = "Jun";
                break;
            case 6:
                monthName = "Jul";
                break;
            case 7:
                monthName = "Ago";
                break;
            case 8:
                monthName = "Sept";
                break;
            case 9:
                monthName = "Oct";
                break;
            case 10:
                monthName = "Nov";
                break;
            case 11:
                monthName = "Dic";
                break;
            default:
                break;

        }

        String fecha = ("La fecha de hoy es: " + year + "-" + monthName + "-" + day);
        System.out.println(fecha);
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
            java.util.logging.Logger.getLogger(VentanaRegistrarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPresente;
    private javax.swing.JButton btnRegresar;
    private com.toedter.calendar.JCalendar jCalendarFecha;
    private javax.swing.JLabel jFechaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlumnos;
    // End of variables declaration//GEN-END:variables

}
