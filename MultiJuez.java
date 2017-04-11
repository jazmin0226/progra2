package ucenfotec.progra2.proyectoFinal;

import java.sql.*;
import java.util.Date;
import java.util.Optional;
import java.util.Vector;
import  ucenfotec.progra2.accesoBD.Connector;
/**
 * 
 * @author Jazmin Arias
 */
public class MultiJuez {
    
    public  Juez crear (String nombre, String apellido, String cedula, String telefono,String  sala,String  usuario, String clave) throws java.sql.SQLException,Exception{
	java.sql.ResultSet rs;
	Juez juez=null;
	int numeroAbono=0;
	String sql;
	sql="INSERT INTO TAbono "+
	"(numCuenta, monto, fecha)"+
	"VALUES ('"+nombre+"',"+apellido+",'"+cedula+"','"+telefono+"','"+sala+"','"+usuario+"','"+clave+"');";
	Connector.getConector().ejecutarSQL(sql);
                   //sql = "SELECT IDENT_CURRENT ('TAbono') AS nuevoNumero;";
	sql = "SELECT max(numero) AS nuevoNumero from TAbono;";

	rs = Connector.getConector().ejecutarSQL(sql, true);
	if (rs.next()) {
		numeroAbono = rs.getInt("nuevoNumero");
		juez = new Juez(nombre, apellido, cedula, telefono, sala, usuario, clave);
	} else {
		throw new java.sql.SQLException ("Error en la BD.");
	}
	rs.close();
	return juez;
    }
        
}
