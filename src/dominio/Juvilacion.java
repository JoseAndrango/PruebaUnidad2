
package dominio;

public class Juvilacion extends Persona{

    public Juvilacion(String nombre, int ci, int anios, double suelo) {
        super(nombre, ci, anios, suelo);
    }

    @Override
    public double Pencion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
