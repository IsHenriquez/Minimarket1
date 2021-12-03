/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

/**
 *
 * @author Isadora
 */
public class Controlador {
    public Usuario buscarPorId(String usuarioVentana) {
        Usuario user = new Usuario();

        try {
            Conection conection1 = new Conection();
            Connection cnx = conection1.obtenerConexion();

            String query = "SELECT usuario, pass FROM usuarios.user WHERE usuario= BINARY ? and estado = \'ACTIVO\'";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, usuarioVentana);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user.setUserr(rs.getString("usuario"));
                user.setPass(rs.getString("pass"));
            }

            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar libro por id" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar libro por id" + e.getMessage());
        }
        return user;
    }
}
