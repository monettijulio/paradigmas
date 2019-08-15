package modelo_camiones;

import modelovehiculos.Camion;


public class Motor {
    public Integer Numero;
    public Camion esDe; //relación con Camion
    
    public Motor(int numero) {
        this.Numero = new Integer(numero); //en base al int creo un Integer
    }
    
    public void setCamion(Camion c) {
        this.esDe = c;
    }
}
