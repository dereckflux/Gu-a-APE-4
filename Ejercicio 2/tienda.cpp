// =============================================
//  GUIA APE 4  |  Ejercicio 2: Inventario de una tienda
//  Dereck Paredes
// =============================================

#include <iostream>
#include <iomanip>
#include <string>
#include <vector>
using namespace std;

class Producto {
public:
    string nombre;
    double precio;
    int stock;
};

Producto nuevoProducto(string nombre, double precio, int stock) {
    Producto p;
    p.nombre = nombre;
    p.precio = precio;
    p.stock = stock;
    return p;
}

int main() {
    vector<Producto> ferreteria;
    ferreteria.push_back(nuevoProducto("Martillo", 8.50, 10));
    ferreteria.push_back(nuevoProducto("Caja de clavos", 1.20, 7));
    ferreteria.push_back(nuevoProducto("Destornillador", 3.40, 5));
    ferreteria.push_back(nuevoProducto("Cinta aislante", 0.90, 20));

    cout << fixed << setprecision(2);

    cout << "[ PRODUCTOS ]\n";
    for (Producto& p : ferreteria) {
        cout << p.nombre << " : $" << p.precio << "\n";
    }

    // Venta de 3 unidades de la caja de clavos y 3 del destornillador
    int unidadesVendidas = 3;
    Producto& vendido1 = ferreteria[1];
    Producto& vendido2 = ferreteria[2];
    vendido1.stock -= unidadesVendidas;
    vendido2.stock -= unidadesVendidas;

    cout << "\n[ VENTA ] -" << unidadesVendidas << " " << vendido1.nombre
         << " | -" << unidadesVendidas << " " << vendido2.nombre << "\n";

    cout << "\n[ STOCK ACTUAL ]\n";
    double valorInventario = 0;
    for (Producto& p : ferreteria) {
        cout << p.nombre << " : $" << p.precio << " x " << p.stock;
        if (p.stock < 5) {
            cout << "   *** Reponer ***";
        }
        cout << "\n";
        valorInventario += p.precio * p.stock;
    }

    cout << "\nValor total del inventario = $" << valorInventario << "\n";
    return 0;
}
