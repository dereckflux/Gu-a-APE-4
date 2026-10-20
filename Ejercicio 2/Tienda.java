// =============================================
//  GUIA APE 4  |  Ejercicio 2: Inventario de una tienda
//  Dereck Paredes
// =============================================

import java.util.ArrayList;
import java.util.Locale;

class Producto {
    String nombre;
    double precio;
    int stock;
}

public class Tienda {

    static Producto nuevoProducto(String nombre, double precio, int stock) {
        Producto p = new Producto();
        p.nombre = nombre;
        p.precio = precio;
        p.stock = stock;
        return p;
    }

    public static void main(String[] args) {
        ArrayList<Producto> ferreteria = new ArrayList<>();
        ferreteria.add(nuevoProducto("Martillo", 8.50, 10));
        ferreteria.add(nuevoProducto("Caja de clavos", 1.20, 7));
        ferreteria.add(nuevoProducto("Destornillador", 3.40, 5));
        ferreteria.add(nuevoProducto("Cinta aislante", 0.90, 20));

        System.out.println("[ PRODUCTOS ]");
        for (Producto p : ferreteria) {
            System.out.println(String.format(Locale.US, "%s : $%.2f", p.nombre, p.precio));
        }

        // Venta de 3 unidades de la caja de clavos y 3 del destornillador
        int unidadesVendidas = 3;
        Producto vendido1 = ferreteria.get(1);
        Producto vendido2 = ferreteria.get(2);
        vendido1.stock -= unidadesVendidas;
        vendido2.stock -= unidadesVendidas;

        System.out.println();
        System.out.println("[ VENTA ] -" + unidadesVendidas + " " + vendido1.nombre
                + " | -" + unidadesVendidas + " " + vendido2.nombre);

        System.out.println();
        System.out.println("[ STOCK ACTUAL ]");
        double valorInventario = 0;
        for (Producto p : ferreteria) {
            String linea = String.format(Locale.US, "%s : $%.2f x %d",
                    p.nombre, p.precio, p.stock);
            if (p.stock < 5) {
                linea = linea + "   *** Reponer ***";
            }
            System.out.println(linea);
            valorInventario += p.precio * p.stock;
        }

        System.out.println();
        System.out.println(String.format(Locale.US,
                "Valor total del inventario = $%.2f", valorInventario));
    }
}
