package Repuestos;

public class Rueda {

    public String Marca;
    private int Rodaje;

    //constructor de rueda
    public Rueda(String m, int r) {
        Marca = m;
        
        //solo se pueden setear estas medidas de rueda        
        if(Rodaje == 1000 || Rodaje == 1100 || Rodaje == 1200)
        Rodaje = r;
        else
        Rodaje = 0;    

    }
    
    //como contamos con un atributo privado
    //creamos métodos get y set para el atributo
    public int getRodaje() {
        return Rodaje;
    }
    public void setRodaje(int Rodaje) {
        
        //solo se pueden setear estas medidas de rueda
        if(Rodaje == 1000 || Rodaje == 1100 || Rodaje == 1200)
        this.Rodaje = Rodaje;
    }
}
