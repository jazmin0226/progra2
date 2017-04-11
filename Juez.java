package ucenfotec.progra2.proyectoFinal;

/**
 * 
 * @author Jazmin Arias
 */
public class Juez extends Persona {
    private String sala;
    private String usuario;
    private String clave;

    public Juez(String sala, String usuario, String clave, String nombre, String apellido, String cedula, String telefono) {
        super(nombre, apellido, cedula, telefono);
        this.sala = sala;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return  "sala=" + sala + ", usuario=" + usuario + ", clave=" + clave + '}';
    }


}
