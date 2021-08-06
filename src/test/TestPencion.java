
package test;

import dominio.*;
import java.util.Scanner;

public class TestPencion {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 3;
        Persona[] per = new Persona[n];
        System.out.println("Ingrese si quiere trartar con :");
        System.out.println("1.- Jubilados por Vejez");
        System.out.println("2.- Jubilados por Discapacidad");
        System.out.println("3.- Jubilados Patronal");
        int opcion1 = entrada.nextInt();
        System.out.println("Opcion : "+opcion1);
        if (opcion1 == 1) {
            llenarVejez(per);
            System.out.println("Jubilacion Vejez");
            for (int i = 0; i < n; i++) { 
                if (per[i] instanceof Vejez) {
                }
            }
        } else if (opcion1 == 2) {
            llenarDiscapacidad(per);
            System.out.println("Jubilacion Discapacitado");
            for (int i = 0; i < n; i++) { 
                if (per[i] instanceof Discapacidad) {
                }
            }
        } else if (opcion1 == 3) {
            llenarPatronal(per);
            System.out.println("Jubilacion Patronal");
            for (int i = 0; i < n; i++) { 
                if (per[i] instanceof Patronal) {
                }
            }
        }
    }

    public static void llenarVejez(Persona per[]) {
        String nombre;
        int cedula, anios;
        double salario;
        System.out.print("Ingrese el nombre: ");
        entrada.next();
        nombre = entrada.nextLine();
        System.out.print("Ingrese su cedula: ");
        cedula = entrada.nextInt();
        System.out.print("Ingrese años en la empresa: ");
        anios = entrada.nextInt();
        System.out.println("Ingrese su sueldo: ");
        salario = entrada.nextDouble();
        per[0] = new Vejez(nombre, cedula, anios, salario);
        
    }

    public static void llenarDiscapacidad(Persona per[]) {
        String nombre;
        int cedula, anios, discapacidad;
        double salario;
        System.out.print("Ingrese el nombre: ");
        entrada.next();
        nombre = entrada.nextLine();
        System.out.print("Ingrese su cedula: ");
        cedula = entrada.nextInt();
        System.out.print("Ingrese años en la empresa: ");
        anios = entrada.nextInt();
        System.out.println("Ingrese su sueldo: ");
        salario = entrada.nextDouble();
        System.out.println("Ingrese del 1 al 100 su discapcidad");
        discapacidad = entrada.nextInt();
  
    }

    public static void llenarPatronal(Persona per[]) {
        String nombre;
        int cedula, anios;
        double salario;
        System.out.print("Ingrese el nombre: ");
        entrada.next();
        nombre = entrada.nextLine();
        System.out.print("Ingrese su cedula: ");
        cedula = entrada.nextInt();
        System.out.print("Ingrese años en la empresa: ");
        anios = entrada.nextInt();
        System.out.println("Ingrese su sueldo: ");
        salario = entrada.nextDouble();
        System.out.println("Ingrese la inflacion de la empresa");
        int inflacion = entrada.nextInt();
        System.out.println("Ingrese <<1>> si es Empesa privada o <<2>> si es publica");
        int opcion = entrada.nextInt();
        if (opcion == 1) {
            per[2] = new Patronal(nombre, cedula, anios, salario, inflacion);
            
        } else if (opcion == 2) {
            per[2] = new Patronal(nombre, cedula, anios, salario, inflacion);
            
        }

    }
}
