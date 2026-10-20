// =============================================
//  GUIA APE 4  |  Ejercicio 5: Biblioteca
//  Dereck Paredes
// =============================================

import java.util.ArrayList;

class Libro {
    String titulo;
    String autor;
    boolean disponible;
}

class Socio {
    String nombre;
    int librosPrestados;
}

public class Biblioteca {

    static Libro nuevoLibro(String titulo, String autor) {
        Libro l = new Libro();
        l.titulo = titulo;
        l.autor = autor;
        l.disponible = true;
        return l;
    }

    static Socio nuevoSocio(String nombre) {
        Socio s = new Socio();
        s.nombre = nombre;
        s.librosPrestados = 0;
        return s;
    }

    // Registra el prestamo: el libro deja de estar disponible
    // y al socio se le suma un libro prestado
    static void registrarPrestamo(Socio socio, Libro libro) {
        libro.disponible = false;
        socio.librosPrestados++;
    }

    public static void main(String[] args) {
        ArrayList<Libro> catalogo = new ArrayList<>();
        catalogo.add(nuevoLibro("1984", "George Orwell"));
        catalogo.add(nuevoLibro("Fahrenheit 451", "Ray Bradbury"));
        catalogo.add(nuevoLibro("Maria", "Jorge Isaacs"));
        catalogo.add(nuevoLibro("Cumanda", "Juan Leon Mera"));

        Socio primero = nuevoSocio("Ricardo Benitez");
        Socio segundo = nuevoSocio("Tatiana Mora");

        registrarPrestamo(primero, catalogo.get(0));
        registrarPrestamo(primero, catalogo.get(1));
        registrarPrestamo(segundo, catalogo.get(2));

        int contadorDisponibles = 0;

        System.out.println("<< CATALOGO >>");
        for (Libro l : catalogo) {
            String estado;
            if (l.disponible) {
                estado = "Disponible";
                contadorDisponibles++;
            } else {
                estado = "Prestado";
            }
            System.out.println(l.titulo + " : " + estado);
        }

        System.out.println("<< SOCIOS >>");
        System.out.println(primero.nombre + " : " + primero.librosPrestados);
        System.out.println(segundo.nombre + " : " + segundo.librosPrestados);

        System.out.println("<< RESUMEN >>");
        System.out.println("Libros disponibles en la biblioteca: " + contadorDisponibles);
    }
}
