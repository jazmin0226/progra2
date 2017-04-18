package ucenfotec.progra2.accesoBD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Jazmin Arias
 */
public class Connector {
    private static AccesoBD conectorBD = null;
    

    public static AccesoBD getConector() throws java.sql.SQLException,Exception{
	if(conectorBD==null){
                            conectorBD = new AccesoBD("com.mysql.jdbc.Driver","jdbc:mysql://localhost/corte?\" +\n" +
"                                   \"user=root&password=root");
	}
	return conectorBD;
    }
    
    
     public static void leerAcceso()
    {
        try
        {
            FileReader reader = new FileReader("Archivo.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;
            
            while((datos = buffer.readLine()) != null) 
            {
                
            }
            reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
