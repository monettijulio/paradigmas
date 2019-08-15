package modelo_camiones;

//Clase/Programa principal

import Legal.RNA;
import modelovehiculos.Camion;

public class Ej_modelo_camiones {

    public static void main(String[] args) {
       Fabrica f = new Fabrica();
       RNA r = new RNA();
       Camion c ; 
       
       c = f.construye();
       r.registrar( "Juan Perez", c);
    
    }
    
}
