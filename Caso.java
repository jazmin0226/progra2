package ucenfotec.progra2.proyectoFinal;

import java.time.LocalDate;

/**
 * 
 * @author Jazmin Arias
 */
public class Caso { //el nu mero, la descripcio n, el querellante, el juez, el estado y la fecha Adema s cada caso debe tener un historial asociado, que tiene la fecha y el estado,
     private int numero;
     private String descripción;
     private Querellante querellante;
     private Juez juez;
     private Estados estado;
     private LocalDate fecha;
     //private ArrayList<> historial;

    public Caso(int numero, String descripción, Querellante querellante, Juez juez, Estados estado, LocalDate fecha) {
        this.numero = numero;
        this.descripción = descripción;
        this.querellante = querellante;
        this.juez = juez;
        this.estado = estado;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Querellante getQuerellante() {
        return querellante;
    }

    public void setQuerellante(Querellante querellante) {
        this.querellante = querellante;
    }

    public Juez getJuez() {
        return juez;
    }

    public void setJuez(Juez juez) {
        this.juez = juez;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Caso{" + "numero=" + numero + 
                ", descripci\u00f3n=" + descripción +
                ", querellante=" + querellante +
                ", juez=" + juez + 
                ", estado=" + estado + 
                ", fecha=" + fecha;
    }
     
     
     
}
