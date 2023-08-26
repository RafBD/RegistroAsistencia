package Interfaz;

import Clases.consultas;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public LoginForm() {
        initComponents();
        // Centrar el formulario
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextMatricula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jBtnAcceder = new javax.swing.JButton();
        txtOlvideContrasena = new javax.swing.JLabel();
        jTextPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        cboRol = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Inicio de Sesión");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUsb.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Matricula");

        jTextMatricula.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jTextMatricula.setForeground(new java.awt.Color(51, 51, 51));
        jTextMatricula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextMatricula.setBorder(null);
        jTextMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatriculaActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/passwordIcon.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Contraseña");

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));

        jBtnAcceder.setBackground(new java.awt.Color(0, 110, 211));
        jBtnAcceder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jBtnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAcceder.setText("Iniciar Sesión");
        jBtnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAccederActionPerformed(evt);
            }
        });

        txtOlvideContrasena.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtOlvideContrasena.setForeground(new java.awt.Color(51, 51, 51));
        txtOlvideContrasena.setText("¿Olvidaste la contraseña?");
        txtOlvideContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtOlvideContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOlvideContrasenaMouseClicked(evt);
            }
        });

        jTextPass.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jTextPass.setForeground(new java.awt.Color(51, 51, 51));
        jTextPass.setBorder(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/opcionIcon.png"))); // NOI18N

        cboRol.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cboRol.setForeground(new java.awt.Color(51, 51, 51));
        cboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción", "Administrador", "Alumno", "Profesor" }));
        cboRol.setBorder(null);
        cboRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboRol.setName(""); // NOI18N
        cboRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRolActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Elige tu rol");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoIcon.png"))); // NOI18N
        jLabel10.setText("Made by ");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(58, 58, 58))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(158, 158, 158))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jBtnAcceder))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(txtOlvideContrasena)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addComponent(jBtnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtOlvideContrasena)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAccederActionPerformed

        String usuario = jTextMatricula.getText();
        String password = jTextPass.getText();
        consultas consultas = new consultas();

        if (usuario.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Error. Todos los campos deben estar llenos");
        } else {
            String rol = cboRol.getSelectedItem().toString();

            switch (rol) {
                case "Profesor":

                    boolean accesoExitosoProfesor = consultas.accesoProfesor(usuario, password);
                    if (accesoExitosoProfesor) {
                        //JOptionPane.showMessageDialog(null, "Bienvenido, " + usuario + "!");

                        // Pasar a otra ventana
                        this.setVisible(false);
                    } else {
                        // No se pudo acceder, muestra un mensaje de error
                        JOptionPane.showMessageDialog(null, "Acceso denegado. Matrícula o contraseña incorrectos.");
                    }

                    break;

                case "Alumno":
                    boolean accesoExitosoAlumno = consultas.accesoAlumno(usuario, password);

                    if (accesoExitosoAlumno) {
                        this.setVisible(false);

                    } else {
                        // No se pudo acceder, muestra un mensaje de error
                        JOptionPane.showMessageDialog(null, "Acceso denegado. Matrícula o contraseña incorrectos.");

                    }

                    break;
                case "Administrador":
                    boolean accesoExitosoAdmin = consultas.accesoAdmin(usuario, password);
                    if (accesoExitosoAdmin) {
                        // Pasar a otra ventana
                        this.setVisible(false);
                        MenuAdministrador MenuAdministrador = new MenuAdministrador();
                        MenuAdministrador.setVisible(true);
                    } else {
                        // No se pudo acceder, muestra un mensaje de error
                        JOptionPane.showMessageDialog(null, "Acceso denegado. Matrícula o contraseña incorrectos.");
                    }

                    break;

                case "Selecciona una opción":
                    // Si no se selecciona un rol muestra un mensaje de seleccion
                    JOptionPane.showMessageDialog(null, "Por favor selecciona una opción");

                    break;
            }
        }

    }//GEN-LAST:event_jBtnAccederActionPerformed

    private void jTextMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatriculaActionPerformed
        // TODO add your handling code here:
        String matriculaUsuario = jTextMatricula.getText();
        System.out.println(matriculaUsuario);
    }//GEN-LAST:event_jTextMatriculaActionPerformed

    private void cboRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRolActionPerformed

        String rol = cboRol.getSelectedItem().toString();

        switch (rol) {
            case "Profesor":
                break;
            case "Alumno":
                break;
            case "Administrador":
                break;
            case "Selecciona una opción":
                JOptionPane.showMessageDialog(null, "Por favor, selecciona una opción");
                break;
        }
    }//GEN-LAST:event_cboRolActionPerformed

    private void txtOlvideContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOlvideContrasenaMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        RecuperarContrasena RecuperarContrasena = new RecuperarContrasena();
        RecuperarContrasena.setVisible(true);
    }//GEN-LAST:event_txtOlvideContrasenaMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboRol;
    public javax.swing.JButton jBtnAcceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextMatricula;
    private javax.swing.JPasswordField jTextPass;
    private javax.swing.JLabel txtOlvideContrasena;
    // End of variables declaration//GEN-END:variables
}
