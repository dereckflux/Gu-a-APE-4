// =============================================
//  GUIA APE 4  |  Ejercicio 3: Veterinaria
//  Dereck Paredes
// =============================================

#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Mascota {
public:
    string nombre;
    string especie;
    int edad;
    double peso;
};

Mascota nuevaMascota(string nombre, string especie, int edad, double peso) {
    Mascota m;
    m.nombre = nombre;
    m.especie = especie;
    m.edad = edad;
    m.peso = peso;
    return m;
}

void imprimirFicha(const Mascota& m) {
    cout << m.nombre << " : " << m.especie << " : " << m.peso << " kg";
    if (m.peso > 20) {
        cout << "  [Revisar peso]";
    }
    cout << "\n";
}

int main() {
    Mascota m1 = nuevaMascota("Bruno", "Perro", 3, 31.0);
    Mascota m2 = nuevaMascota("Pelusa", "Gato", 6, 5.1);
    Mascota m3 = nuevaMascota("Kiwi", "Loro", 2, 0.4);

    cout << fixed << setprecision(2);

    cout << "== Fichas de la veterinaria ==\n";
    imprimirFicha(m1);
    imprimirFicha(m2);
    imprimirFicha(m3);

    cout << "\n>> m1.edad = " << m1.edad << "\n";

    // m4 guarda la direccion de m1 (&m1), igual que una referencia de Java
    Mascota* m4 = &m1;
    m4->edad += 1;

    cout << ">> Se suma 1 a m4.edad\n";
    cout << ">> m1.edad = " << m1.edad << "\n";

    // POR QUE CAMBIO m1.edad?
    // m4 no es otra mascota, es un puntero que guarda la direccion de memoria
    // de m1. Al hacer m4->edad += 1 se modifica el objeto que esta en esa
    // direccion, que es el mismo m1 (Bruno). Por eso m1.edad pasa de 3 a 4.
    return 0;
}
