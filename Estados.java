/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ucenfotec.progra2.proyectoFinal;

/**
 * 
 * @author Jazmin Arias
 */
public enum Estados {
    RECIBIDO("Recibido"),
    ACEPTADO("Aceptado"),
    CONSULTA("Consulta"),
    RECHAZADO("Rechazado"),
    REDACTADO("Redactado"), 
    RESUELTO("Resuelto"), 
    REVISION("Revision");
    
    private final String estado;
    
    private Estados(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Estados{" + "estado=" + estado + '}';
    }
    
}
