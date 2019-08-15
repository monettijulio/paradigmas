package modelovehiculos;

import Repuestos.Motor;
import Repuestos.Rueda;

public class Camion {
    private String prop;
    public int carga;
    public String Marca;
    private Rueda[] tiene;  //agregación
    public Chasis formadoPor = new Chasis();  //composición
    private Motor tieneUn;

    //especificar datos de construccion del camion, en los parametros de su constructor
    public Camion(String p, Integer c, int numeroChasis, Integer numeroMotor) { 
        prop = p;
        carga = c;
        formadoPor.numero = numeroChasis;
        tieneUn = new Motor(numeroMotor);
        tieneUn.setCamion(this);
    }

    //metodos get y set
    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public Motor getTieneUn() {
        return tieneUn;
    }

    public void setTieneUn(Motor tieneUn) {
        this.tieneUn = tieneUn;
    }
    
    public Rueda[] getTiene(){  //retornar todas las redas
        return tiene;
    }
    
    public void setTiene(Rueda ruedas[]) {  //agrega ruedas
        tiene = ruedas;
    }

}
