package ucenfotec.progra2.proyectoFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * @author Jazmin Arias
 */
public class CL {
    public static void leerLineas()
    {
        try
        {
            FileReader reader = new FileReader("Archivo.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;
            
            while((datos = buffer.readLine()) != null) 
            {
                System.out.println(datos);
            }
            reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
       
    }
}
