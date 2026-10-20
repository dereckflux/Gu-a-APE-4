// =============================================
//  GUIA APE 4  |  Ejercicio 3: Veterinaria
//  Dereck Paredes
// =============================================

import java.util.Locale;

class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;
}

public class Veterinaria {

    static Mascota nuevaMascota(String nombre, String especie, int edad, double peso) {
        Mascota m = new Mascota();
        m.nombre = nombre;
        m.especie = especie;
        m.edad = edad;
        m.peso = peso;
        return m;
    }

    static void imprimirFicha(Mascota m) {
        String ficha = String.format(Locale.US, "%s : %s : %.2f kg",
                m.nombre, m.especie, m.peso);
        if (m.peso > 20) {
            ficha += "  [Revisar peso]";
        }
        System.out.println(ficha);
    }

    public static void main(String[] args) {
        Mascota m1 = nuevaMascota("Bruno", "Perro", 3, 31.0);
        Mascota m2 = nuevaMascota("Pelusa", "Gato", 6, 5.1);
        Mascota m3 = nuevaMascota("Kiwi", "Loro", 2, 0.4);

        System.out.println("== Fichas de la veterinaria ==");
        imprimirFicha(m1);
        imprimirFicha(m2);
        imprimirFicha(m3);

        System.out.println();
        System.out.println(">> m1.edad = " + m1.edad);

        Mascota m4 = m1;
        m4.edad += 1;

        System.out.println(">> Se suma 1 a m4.edad");
        System.out.println(">> m1.edad = " + m1.edad);

        // POR QUE CAMBIO m1.edad?
        // En Java las variables de tipo objeto no guardan el objeto en si,
        // guardan una referencia (la ubicacion del objeto en memoria).
        // Al escribir "Mascota m4 = m1;" se copia esa referencia, no el objeto.
        // Resultado: m1 y m4 senalan al mismo perro (Bruno). Por eso, cuando
        // se suma 1 a m4.edad, en realidad se modifica a Bruno y al consultar
        // m1.edad aparece 4 en lugar de 3. Para tener dos mascotas distintas
        // habria que crear otra con new.
    }
}
