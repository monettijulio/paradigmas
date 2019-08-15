package modelo_camiones;

public class Rueda {

    public String Marca;
    private int Rodaje;

    //constructor de rueda
    public Rueda(String m, int r) {
        Marca = m;
        Rodaje = r;

    }
    
    //como contamos con un atributo privado
    //creamos métodos get y set para el atributo
    public int getRodaje() {
        return Rodaje;
    }
    public void setRodaje(int Rodaje) {
        this.Rodaje = Rodaje;
    }
}
