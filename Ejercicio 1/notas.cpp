// =============================================
//  GUIA APE 4  |  Ejercicio 1: Notas del curso
//  Dereck Paredes
// =============================================

#include <iostream>
#include <iomanip>
#include <string>
#include <vector>
using namespace std;

class Estudiante {
public:
    string nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;
};

// Funcion auxiliar para no repetir las mismas lineas en cada estudiante
Estudiante nuevoEstudiante(string nombre, double n1, double n2, double n3) {
    Estudiante e;
    e.nombre = nombre;
    e.nota1 = n1;
    e.nota2 = n2;
    e.nota3 = n3;
    e.promedio = 0;
    return e;
}

string clasificar(double promedio) {
    if (promedio >= 7) {
        return "Aprobado";
    } else if (promedio >= 5) {
        return "Supletorio";
    }
    return "Reprobado";
}

int main() {
    vector<Estudiante> estudiantes;
    estudiantes.push_back(nuevoEstudiante("Bryan Tipan", 7.5, 8, 6.5));
    estudiantes.push_back(nuevoEstudiante("Mishell Rocha", 5.5, 5, 6));
    estudiantes.push_back(nuevoEstudiante("Ariel Coello", 2, 4, 3));
    estudiantes.push_back(nuevoEstudiante("Nicole Vega", 10, 9.5, 9));
    estudiantes.push_back(nuevoEstudiante("Joel Cando", 6, 7, 7.5));

    int cantidadAprobados = 0;
    cout << fixed << setprecision(2);

    for (Estudiante& est : estudiantes) {
        est.promedio = (est.nota1 + est.nota2 + est.nota3) / 3.0;
        string resultado = clasificar(est.promedio);

        cout << est.nombre << " : " << est.promedio << " " << resultado << "\n";

        if (resultado == "Aprobado") {
            cantidadAprobados = cantidadAprobados + 1;
        }
    }

    cout << "-------------------------------\n";
    cout << "Aprobaron " << cantidadAprobados << " de "
         << estudiantes.size() << " estudiantes\n";
    return 0;
}
