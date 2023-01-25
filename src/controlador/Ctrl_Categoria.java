package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Categoria;



public class Ctrl_Categoria {
    
    //metodo publico y boolean para registrar categoria en la BD
    //el constructor recibe un objeto de clase categoria
    public boolean guardar(Categoria objeto){
        //variable boolean de nombre respuesta
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar(); //objeto conexion
        try {
            //el query a la BD para categoria
            // clase preparedstatement y llamamos tabla categoria con 3 parametros
            PreparedStatement consulta = cn.prepareStatement("insert into tb_categoria values(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            cn.close();
            
        } catch (SQLException e) {  //catch de tipo sql
            System.out.println("Error al guardar categoria: " + e);
        }
        //retornamos t o f depende, y retornamos respusta
        return respuesta;
        
        //me voy a vista de categoria y le doy guardar
    }
    
       
}
