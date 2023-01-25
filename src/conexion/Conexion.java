package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //Creo metodo para hacer la conexion local con la bd, publico, estatico y connection y le coloco al metodo conectar
    public static Connection conectar() {
        // creo un try catch 
        //señala un bloque de instrucciones a intentar ( try ), y especifica una respuesta si se produce una excepción ( catch )
        try {

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_sistema_ve", "root", "root1234");
            return cn;

        } catch (SQLException e) {
            System.out.println("Error de conexión local " + e);

        }
        return null;

    }
}
