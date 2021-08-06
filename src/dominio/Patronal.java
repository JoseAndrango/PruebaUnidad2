
package dominio;

public class Patronal extends Persona{

    public Patronal(String nombre, int ci, int anios, double suelo) {
        super(nombre, ci, anios, suelo);
    }

    public Patronal(String nombre, int cedula, int anios, double salario, int inflacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Pencion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
