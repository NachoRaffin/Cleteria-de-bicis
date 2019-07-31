/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabicicleteria;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Bicicleteria {
    private ArrayList<Bicicleta> bicicletas;
    private float ganancias;
    private int cantidadDeVentas;
    
    public Bicicleteria(){
        bicicletas= new ArrayList<>();
        cantidadDeVentas=0;
        ganancias=0;
    }
    
    public void venderBicicleta(Bicicleta bicicleta){
        bicicletas.remove(bicicleta);
        cantidadDeVentas++;
        ganancias+=bicicleta.getPrecio();
    }
    
    public void addBicicleta(Bicicleta bicicleta){
        bicicletas.add(bicicleta);
    }
    
    public Bicicleta buscarBicicleta(int nroDeSerie){
        for (int i=0;i<bicicletas.size();i++){
            if(bicicletas.get(i).getNroDeSerie().equals(nroDeSerie)){
                return bicicletas.get(i);
            }
        }
    return null;
    }
}
