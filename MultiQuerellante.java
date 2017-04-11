package ucenfotec.progra2.proyectoFinal;

import ucenfotec.progra2.accesoBD.Connector;

/**
 * 
 * @author Jazmin Arias
 */
public class MultiQuerellante {
    
        public  Querellante crear (String nombre, String apellido, String cedula, String telefono,String  sala,String  direccion) throws java.sql.SQLException,Exception{
	java.sql.ResultSet rs;
	Querellante querellante=null;
	int numeroAbono=0;
	String sql;
	sql="INSERT INTO TAbono "+
	"(numCuenta, monto, fecha)"+
	"VALUES ('"+nombre+"',"+apellido+",'"+cedula+"','"+telefono+"','"+sala+"','"+direccion+"'');";
	Connector.getConector().ejecutarSQL(sql);
                   //sql = "SELECT IDENT_CURRENT ('TAbono') AS nuevoNumero;";
	sql = "SELECT max(numero) AS nuevoNumero from TAbono;";

	rs = Connector.getConector().ejecutarSQL(sql, true);
	if (rs.next()) {
		numeroAbono = rs.getInt("nuevoNumero");
		querellante = new Querellante(nombre, apellido, cedula, telefono,direccion);
	} else {
		throw new java.sql.SQLException ("Error en la BD.");
	}
	rs.close();
	return querellante;
    }
}
