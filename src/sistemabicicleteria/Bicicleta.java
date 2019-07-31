/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabicicleteria;

/**
 *
 * @author Administrador
 */
public class Bicicleta {
    private String nroDeSerie;
    private String modelo;
    private int año;
    private float precio;
    
    public Bicicleta (String nroDeSerie, String modelo, int año){
        this.nroDeSerie=nroDeSerie;
        this.modelo=modelo;
        this.año=año;
    }
    
    public String getNroDeSerie(){
        return nroDeSerie;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio){
        this.precio=precio;
    }
}
