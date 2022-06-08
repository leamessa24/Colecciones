/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones3;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Alumno> alumnos = new ArrayList();
        do{
            Alumno a1 = new Alumno();
            System.out.println(" Ingrese el nombre del alumno ");
            a1.setNombre(leer.next());
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println(" Ingrese la nota "+ (i + 1) + " del alumno " + a1.getNombre());
                notas.add(leer.nextInt());
            }
            a1.setNotas(notas);
            alumnos.add(a1);
            System.out.println(" ¿Desea agregar otro alumno?  (si/no) ");
        }while(leer.next().equalsIgnoreCase("si"));
        
        do{
            System.out.println(" Ingrese el nombre del alumno para calcular su nota: ");
            String nombre = leer.next();
            for (Alumno aux : alumnos) {
                if(aux.getNombre().equals(nombre)){
                    System.out.println(" La nota final del alumno "+ nombre + " es de " + aux.NotaFinal(aux));
                }
            }
            System.out.println(" ¿Desea calcular la nota final de otro alumno? (si/no) ");
        }while (leer.next().equalsIgnoreCase("si"));
    }
    
}
