
package dominio;

public class Vejez extends Persona implements Interface{
    public Vejez(String nombre, int ci, int anios, double sueldo) {
        super(nombre, ci, anios, sueldo);
    }

    @Override
    public double Pencion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
