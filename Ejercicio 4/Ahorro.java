// =============================================
//  GUIA APE 4  |  Ejercicio 4: Cuenta de ahorro
//  Dereck Paredes
// =============================================

import java.util.Locale;

class Cuenta {
    String titular;
    double saldo;
}

public class Ahorro {

    // Deposita 50 cada mes con un while hasta llegar a 500
    // y devuelve cuantos meses se necesitaron
    static int ahorrarHastaMeta(Cuenta c) {
        int mes = 0;
        while (c.saldo < 500) {
            c.saldo += 50;
            mes++;
            System.out.println(String.format(Locale.US, "[Mes %02d] %s : $%.2f",
                    mes, c.titular, c.saldo));
        }
        return mes;
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.titular = "Andres Quispe";
        cuenta1.saldo = 200;

        Cuenta cuenta2 = new Cuenta();
        cuenta2.titular = "Daniela Torres";
        cuenta2.saldo = 350;

        int tiempo1 = ahorrarHastaMeta(cuenta1);
        System.out.println();
        int tiempo2 = ahorrarHastaMeta(cuenta2);

        System.out.println();
        System.out.println("Meses necesarios:");
        System.out.println("  " + cuenta1.titular + " -> " + tiempo1);
        System.out.println("  " + cuenta2.titular + " -> " + tiempo2);
    }
}
