/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaz.MenuAlumno;
import Interfaz.MenuProfesor;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rafab
 */
public class consultas {

    public boolean accesoAlumno(String matricula, String pass) {
        CConexion db = new CConexion();
        boolean usuarioEncontrado = false;
        String nombreUsuario = "";

        try {
            Connection cn = CConexion.getConnection();
            PreparedStatement pst;
            pst = cn.prepareStatement("SELECT est.matricula, est.nombre, passw.PasswordHash FROM Estudiantes est INNER JOIN Passwords passw ON est.idPassword = passw.IdPassword WHERE est.matricula = ?");
            pst.setString(1, matricula);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String matriculaCorrecta = rs.getString("matricula");
                nombreUsuario = rs.getString("nombre");
                String passCorrecto = rs.getString("PasswordHash");

                if (pass.equals(passCorrecto)) {
                    usuarioEncontrado = true;
                    JOptionPane.showMessageDialog(null, "Login Correcto. ¡Bienvenido(a) " + nombreUsuario + "!");
                    MenuAlumno MenuAlumno = new MenuAlumno(nombreUsuario);
                    MenuAlumno.setVisible(true);

                } else {
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún alumno con la matrícula ingresada.");
            }

        } catch (HeadlessException | SQLException err) {
            JOptionPane.showMessageDialog(null, "Error: " + err);
        }

        return usuarioEncontrado;
    }

    // **************************************************
    public boolean accesoProfesor(String matricula, String pass) {
        CConexion db = new CConexion();
        boolean usuarioEncontrado = false;
        String nombreUsuario = "";

        try {
            Connection cn = CConexion.getConnection();
            PreparedStatement pst;
            pst = cn.prepareStatement("SELECT prof.matricula, prof.nombre, passw.PasswordHash FROM Profesores prof INNER JOIN Passwords passw ON prof.idPassword = passw.IdPassword WHERE prof.matricula = ?");
            pst.setString(1, matricula);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String matriculaCorrecta = rs.getString("matricula");
                nombreUsuario = rs.getString("nombre");
                String passCorrecto = rs.getString("PasswordHash");

                if (pass.equals(passCorrecto)) {
                    usuarioEncontrado = true;
                    JOptionPane.showMessageDialog(null, "Login Correcto. ¡Bienvenido(a) " + nombreUsuario + "!");
                    MenuProfesor MenuProfesor = new MenuProfesor(nombreUsuario);
                    MenuProfesor.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Por favor, inténtalo de nuevo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún profesor con la matrícula ingresada.");
            }

        } catch (HeadlessException | SQLException err) {
            JOptionPane.showMessageDialog(null, "Error: " + err);
        }

        return usuarioEncontrado;
    }

    // Acceso admin
    public boolean accesoAdmin(String matricula, String pass) {

        CConexion db = new CConexion();
        boolean usuarioEncontrado = false; // Inicializamos la variable en false

        try {
            Connection cn = CConexion.getConnection();
            PreparedStatement admin = cn.prepareStatement("SELECT nombre, [password] FROM [admin]");
            ResultSet ejecutarAdmin = admin.executeQuery();

            while (ejecutarAdmin.next()) {
                //String matriculaCorrecta = ejecutarAdmin.getString("matricula");
                String nombreUsuario = ejecutarAdmin.getString("nombre");
                String passCorrecto = ejecutarAdmin.getString("password");

                if (matricula.equals(nombreUsuario) && pass.equals(passCorrecto)) {
                    usuarioEncontrado = true;
                    JOptionPane.showMessageDialog(null, "Login Correcto. ¡Bienvenido(a) " + nombreUsuario + "!");
                    break; // Se encontró el usuario, se sale del bucle
                }
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return usuarioEncontrado;
    }

    // GET ALUMNOS
    public ArrayList<String> obtenerNombresAlumnos() {
        ArrayList<String> nombresAlumnos = new ArrayList<>();

        try {
            Connection cn = CConexion.getConnection();
            PreparedStatement pst = cn.prepareStatement("SELECT alumno FROM Alumnos");
            ResultSet resultado = pst.executeQuery();

            // Recorrer el resultado y agregar los nombres de los alumnos a la lista
            while (resultado.next()) {
                String nombreAlumno = resultado.getString("alumno");
                nombresAlumnos.add(nombreAlumno);
            }

            // Cerrar recursos
            resultado.close();
            pst.close();
            cn.close();
        } catch (HeadlessException | SQLException err) {
            JOptionPane.showMessageDialog(null, "Error: " + err);
        }

        return nombresAlumnos;
    }

}
