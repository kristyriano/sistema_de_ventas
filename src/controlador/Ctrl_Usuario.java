package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class Ctrl_Usuario {

    //definir metodo q me permitira iniciar sesion en la BD
    // metodo publico, boolean (true o f, y se llama loginuser)
    // parametro de la clase del modelo usuario q se llamara objeto
    public boolean loginUser(Usuario objeto) {
        //defino variable tipo y nombre
        boolean respuesta = false;
        //invoco metodo conectar creo objeto de la clase connection
        Connection cn = Conexion.conectar();
        //en MYSQLWorkbench me voy a crear el query para loggear el usuario
        //copio la linea de mysql aqui
        String sql = "select usuario, password from tb_usuario where usuario = '" + objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "'";
        Statement st; //creo objeto clase statement
        try { //creo trycatch

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql); //creo objeto clase resultset

            while (rs.next()) { //bucle while ciclo repetitivo se ejecuta por correcto para q el user se logee
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }

        //retornamos variable respuesta por ser tipo boolean
        return respuesta; 
    }
//este metodo nos enseña si nos retorna T el usuario esta en la BD se loggea y si no esta es False y saldra una alerta q no esta en la BD
    // me voy a login a boton iniciar sesion
}
