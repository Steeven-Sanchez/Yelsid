package tps.Conectar;

import com.sun.crypto.provider.RSACipher;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;/*


/**
 *
 * @author usuario
 */
public class Sentencias_sql {
    private conexion con;
    PreparedStatement ps;
    Connection cn = con.conectado();
    
    public boolean comprar (String id,String cantidad)
    {
        boolean estado = false;
        try {
            PreparedStatement pps = cn.prepareStatement("update bodega set cantidad ='"+cantidad +"'where id_tipoarticulo = '"+id+"'");
            ps.executeUpdate();
            estado = true;
         }catch(SQLException e){
         System.out.println(e);
      }
       return estado;
    }
}
