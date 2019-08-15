package Legal;

import java.util.Date;
import modelovehiculos.Camion;

public class Titulo {             //clase asociativa (contiene datos del registro)  
    public String prop;             //TODO: encapsular este atributo
    public RNA rna;                 //una relación entre clases.
    private Date diaInscripcion;    //TODO: agregar en el diagrama de clases
    public Camion c;

    public Titulo(RNA rna, String prop, Camion c) { //método constructor
        this.prop = prop;
        this.rna = rna;
        diaInscripcion = new Date();      //fecha de hoy
        this.c = c;
    }
}
