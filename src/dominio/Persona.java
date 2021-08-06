
package dominio;


public abstract class Persona {
    private String nombre;
    private int ci;
    private double sueldo;
    private int anios;
    public abstract double Pencion();
    public Persona (String nombre,int ci,int anios,double suelo) {
        this.nombre = nombre;
        this.ci = ci;
        this.anios = anios;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }
    public double jubilacion(){
        if(anios>0 && anios<11){
            return sueldo*50/100;
        }else if(anios>10 && anios<21){
            return sueldo*60/100;
        }else if(anios>20 && anios<31){
            return sueldo*70/100;
        }else if(anios>30 && anios<36){
            return sueldo*80/100;
        }else if(anios>35 && anios<40){
            return sueldo*90/100;
        }else if(anios>39){
            return sueldo*100/100;
        }
        return 0;
    }
}
