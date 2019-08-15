package modelo_camiones;

import Repuestos.Rueda;
import modelovehiculos.Camion;

public class Fabrica {
    public String Nombre;
    
    //Una fabrica "construye" un camion
    public Camion construye(){
        //fabricar las ruedas antes;
        Rueda r[] = new Rueda[4];
        
        for(int i=0; i<4; i++){ 
          r[i] = new Rueda("Firestone",1100);
        }
        
        Camion c = new Camion("Juan Perez" , 1000, 77565344,10009278);
        c.setTiene( r );   //coloco las ruedas al camion
                
        return c;
    }	
}
