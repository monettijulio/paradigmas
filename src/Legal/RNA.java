package Legal;

import modelovehiculos.Camion;

public class RNA {
   public final String ID = "Mendoza";  //siempre "pertenece" a Mendoza
   private Camion inscripto[] = new Camion[10000];  //cantidad constante! 
   public int cantidad=0;
      
   //registra un camión y su dueño
   //para ello genera un título
   public Titulo registrar(String propietario, Camion c) {
       Titulo t = new Titulo(this, propietario, c);
    
       inscripto[cantidad++] = c;
       
       return t;
   }
   
   //recibido un título, muestra el titular y datos del camión
   public void mostrar(Titulo t){
           System.out.println("Propietario: " + t.prop);  
           System.out.println("Marca del Vehículo: " + t.c.Marca);  
           //TODO: mostar el resto de los datos ?
   }
}
