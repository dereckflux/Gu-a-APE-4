// =============================================
//  GUIA APE 4  |  Ejercicio 4: Cuenta de ahorro
//  Dereck Paredes
// =============================================

#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Cuenta {
public:
    string titular;
    double saldo;
};

// Deposita 50 cada mes con un while hasta llegar a 500
// y devuelve cuantos meses se necesitaron.
// La cuenta se recibe por referencia (&) para cambiar su saldo real.
int ahorrarHastaMeta(Cuenta& c) {
    int mes = 0;
    while (c.saldo < 500) {
        c.saldo += 50;
        mes++;
        cout << "[Mes " << setw(2) << setfill('0') << mes << "] "
             << c.titular << " : $" << c.saldo << "\n";
    }
    return mes;
}

int main() {
    Cuenta cuenta1;
    cuenta1.titular = "Andres Quispe";
    cuenta1.saldo = 200;

    Cuenta cuenta2;
    cuenta2.titular = "Daniela Torres";
    cuenta2.saldo = 350;

    cout << fixed << setprecision(2);

    int tiempo1 = ahorrarHastaMeta(cuenta1);
    cout << "\n";
    int tiempo2 = ahorrarHastaMeta(cuenta2);

    cout << "\nMeses necesarios:\n";
    cout << "  " << cuenta1.titular << " -> " << tiempo1 << "\n";
    cout << "  " << cuenta2.titular << " -> " << tiempo2 << "\n";
    return 0;
}
