// =============================================
//  GUIA APE 4  |  Ejercicio 1: Notas del curso
//  Dereck Paredes
// =============================================

import java.util.ArrayList;
import java.util.Locale;

class Estudiante {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;
}

public class Notas {

    // Metodo auxiliar para no repetir las mismas lineas en cada estudiante
    static Estudiante nuevoEstudiante(String nombre, double n1, double n2, double n3) {
        Estudiante e = new Estudiante();
        e.nombre = nombre;
        e.nota1 = n1;
        e.nota2 = n2;
        e.nota3 = n3;
        return e;
    }

    static String clasificar(double promedio) {
        if (promedio >= 7) {
            return "Aprobado";
        } else if (promedio >= 5) {
            return "Supletorio";
        }
        return "Reprobado";
    }

    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(nuevoEstudiante("Bryan Tipan", 7.5, 8, 6.5));
        estudiantes.add(nuevoEstudiante("Mishell Rocha", 5.5, 5, 6));
        estudiantes.add(nuevoEstudiante("Ariel Coello", 2, 4, 3));
        estudiantes.add(nuevoEstudiante("Nicole Vega", 10, 9.5, 9));
        estudiantes.add(nuevoEstudiante("Joel Cando", 6, 7, 7.5));

        int cantidadAprobados = 0;

        for (Estudiante est : estudiantes) {
            est.promedio = (est.nota1 + est.nota2 + est.nota3) / 3.0;
            String resultado = clasificar(est.promedio);

            String linea = String.format(Locale.US, "%s : %.2f %s",
                    est.nombre, est.promedio, resultado);
            System.out.println(linea);

            if (resultado.equals("Aprobado")) {
                cantidadAprobados = cantidadAprobados + 1;
            }
        }

        System.out.println("-------------------------------");
        System.out.println("Aprobaron " + cantidadAprobados + " de "
                + estudiantes.size() + " estudiantes");
    }
}
