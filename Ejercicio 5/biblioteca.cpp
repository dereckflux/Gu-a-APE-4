// =============================================
//  GUIA APE 4  |  Ejercicio 5: Biblioteca
//  Dereck Paredes
// =============================================

#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Libro {
public:
    string titulo;
    string autor;
    bool disponible;
};

class Socio {
public:
    string nombre;
    int librosPrestados;
};

Libro nuevoLibro(string titulo, string autor) {
    Libro l;
    l.titulo = titulo;
    l.autor = autor;
    l.disponible = true;
    return l;
}

Socio nuevoSocio(string nombre) {
    Socio s;
    s.nombre = nombre;
    s.librosPrestados = 0;
    return s;
}

// Registra el prestamo: el libro deja de estar disponible
// y al socio se le suma un libro prestado (ambos por referencia)
void registrarPrestamo(Socio& socio, Libro& libro) {
    libro.disponible = false;
    socio.librosPrestados++;
}

int main() {
    vector<Libro> catalogo;
    catalogo.push_back(nuevoLibro("1984", "George Orwell"));
    catalogo.push_back(nuevoLibro("Fahrenheit 451", "Ray Bradbury"));
    catalogo.push_back(nuevoLibro("Maria", "Jorge Isaacs"));
    catalogo.push_back(nuevoLibro("Cumanda", "Juan Leon Mera"));

    Socio primero = nuevoSocio("Ricardo Benitez");
    Socio segundo = nuevoSocio("Tatiana Mora");

    registrarPrestamo(primero, catalogo[0]);
    registrarPrestamo(primero, catalogo[1]);
    registrarPrestamo(segundo, catalogo[2]);

    int contadorDisponibles = 0;

    cout << "<< CATALOGO >>\n";
    for (const Libro& l : catalogo) {
        string estado;
        if (l.disponible) {
            estado = "Disponible";
            contadorDisponibles++;
        } else {
            estado = "Prestado";
        }
        cout << l.titulo << " : " << estado << "\n";
    }

    cout << "<< SOCIOS >>\n";
    cout << primero.nombre << " : " << primero.librosPrestados << "\n";
    cout << segundo.nombre << " : " << segundo.librosPrestados << "\n";

    cout << "<< RESUMEN >>\n";
    cout << "Libros disponibles en la biblioteca: " << contadorDisponibles << "\n";
    return 0;
}
