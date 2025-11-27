/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 (Muy buena) del estudiante rené
Calificación 4 (Buena) del estudiante rolando

Promedio de calificaciones: 8,50

---
Si la nota es mayor o igual a 5 es un nota "Muy buena", caso contrario es buena
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaFinal;
        double nota;
        String nota1 = "";
        int salida;
        String nombre; // *
        double promedio;
        boolean bandera = true;
        double suma = 0;
        int contador_calificaciones = 0;
        
        cadenaFinal = "Listado de notas: \n";
                
        do {
            
            System.out.println("Ingrese nombre del estudiante");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese calificaciones");
            nota = entrada.nextDouble();
            
            if(nota >= 5){
                nota1 = "(Muy buena)";
            }else{
                nota1 = "(Buena)";
            }
            
            
            suma = suma + nota;
            // agrego una unidad al contador para luego sacar el promedio
            contador_calificaciones = contador_calificaciones + 1;
            
            
            System.out.println("Ingrese (1) si desea salir "
                    + "del ciclo ");
            salida = entrada.nextInt();

            if (salida == 1) {
                bandera = false;
            }
            // atención
            entrada.nextLine(); // se limpia el buffer, pues el primer valor
                               // que se solicita al inicio del ciclo es una
                               // cadena
            promedio = suma / contador_calificaciones;
        cadenaFinal = String.format("\n%s\nCalificación %.2f %s del estudiante "
                + "%s\n",
                cadenaFinal, nota, nota1, nombre);

        } while (bandera); // (bandera==true
        
        System.out.printf("%s\nPromedio de calificaciones: %.2f", cadenaFinal
                , promedio);
    }
}
