package ucenfotec.progra2.proyectoFinal;

/**
 * 
 * @author Jazmin Arias
 */
public class Querellante extends Persona{
    private String direccion;

    public Querellante(String direccion, String nombre, String apellido, String cedula, String telefono) {
        super(nombre, apellido, cedula, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + 
                ", apellido" + this.apellido +
                ", cedula: " + this.cedula +
                ", teléfono: " + this.telefono +
                "direccion=" + direccion;
    }
    
}
