<h1 align="center">Guía Práctica APE 4 · Programación Orientada a Objetos</h1>

<p align="center">
  <strong>🃏 EL CASINO DEL CÓDIGO · REMY LEBEAU DIVISION</strong><br>
  <em>El mazo está cargado: 5 ejercicios de POO resueltos con precisión cinética en un solo programa.</em>
</p>

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&amp;color=0:0D1117,60:4B0082,100:E0115F&amp;height=230&amp;section=header&amp;text=Guia%20APE%204%20%C2%B7%20POO&amp;fontSize=44&amp;fontColor=E0115F&amp;animation=fadeIn&amp;fontAlignY=38&amp;desc=DESARROLLO%20INDIVIDUAL%20%C2%B7%20PAREDES%20ACOSTA%20DERECK%20SHAIR&amp;descAlignY=60&amp;descSize=18&amp;descColor=FFFFFF" width="100%" alt="Guía APE 4 POO - Dereck Shair Paredes Acosta">

<h2>🃏 RESOLUCIÓN UNIFICADA DE EJERCICIOS DE CLASES Y OBJETOS EN JAVA</h2>

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&amp;weight=700&amp;size=21&amp;duration=3200&amp;pause=1500&amp;color=E0115F&amp;center=true&amp;vCenter=true&amp;width=850&amp;height=70&amp;lines=Cinco+ejercicios.+Un+solo+c%C3%B3digo.+Pura+l%C3%B3gica.;Clases%2C+atributos%2C+instancias+y+referencias.;El+mazo+de+Java+est%C3%A1+en+mis+manos.;Desarrollo+individual+para+la+Gu%C3%ADa+APE+4." width="100%" alt="Frases animadas estilo Gambito">

**Cinco cartas sobre la mesa. Un solo sistema ejecutable.**

<img src="https://img.shields.io/badge/MODALIDAD-INDIVIDUAL-E0115F?style=for-the-badge&amp;labelColor=18181B" alt="Modalidad Individual">
<img src="https://img.shields.io/badge/AUTOR-DERECK_PAREDES-E0115F?style=for-the-badge&amp;labelColor=18181B" alt="Dereck Paredes">
<img src="https://img.shields.io/badge/GU%C3%8DA-APE_4-E0115F?style=for-the-badge&amp;labelColor=18181B" alt="Guía APE 4">

<br>

<img src="https://img.shields.io/badge/LENGUAJE-JAVA-9333EA?style=flat-square&amp;labelColor=18181B" alt="Lenguaje Java">
<img src="https://img.shields.io/badge/PARADIGMA-POO-9333EA?style=flat-square&amp;labelColor=18181B" alt="Paradigma POO">

<br><br>

**Bienvenue à la mesa de trabajo.**<br>
Esta guía contiene la implementación completa y unificada de los 5 ejercicios prácticos<br>
de Introducción a la Programación Orientada a Objetos en Java con consola estilizada.

</div>

---

## 🃏 Autor · El As de la Baraja

| Rol | Desarrollador | Asignatura | Trabajo |
| :---: | :--- | :--- | :--- |
| **As de Picas** | **Paredes Acosta Dereck Shair** | **Orientación a Objetos / Java** | **Guía APE 4 (Individual)** |

---

# 🗃️ Planteamiento de los 5 Ejercicios

---

### 🃏 Ejercicio 01 · Notas del curso
Crear la clase `Estudiante` con los atributos `nombre`, `nota1`, `nota2`, `nota3` y `promedio`. En `main`, crear 5 instancias, calcular el promedio de cada una e imprimirlas una debajo de otra con el formato `nombre : promedio`, agregando `Aprobado` (7 o más), `Supletorio` (de 5 a 6.99) o `Reprobado` (menos de 5). Al final, imprimir cuántos estudiantes aprobaron.

---

### 🃏 Ejercicio 02 · Inventario de una tienda
Crear la clase `Producto` con `nombre`, `precio` y `stock`. Crear 4 productos e imprimirlos con el formato `nombre : precio`. Simular la venta de 3 unidades de dos de ellos, mostrar “Reponer” junto a cada producto que quede con menos de 5 unidades e imprimir el valor total del inventario (suma de precio por stock).

---

### 🃏 Ejercicio 03 · Veterinaria
Crear la clase `Mascota` con `nombre`, `especie`, `edad` y `peso`. Crear 3 mascotas e imprimirlas con el formato `nombre : especie : peso`, mostrando “Revisar peso” si pesan más de 20 kg. Luego escribir `Mascota m4 = m1;`, sumar 1 a `m4.edad`, imprimir `m1.edad` y explicar en un comentario por qué cambió.

---

### 🃏 Ejercicio 04 · Cuenta de ahorro
Crear la clase `Cuenta` con `titular` y `saldo`. Crear 2 cuentas, una con 200 y otra con 350. Con un `while`, depositar 50 por mes en cada cuenta hasta que llegue a 500, imprimiéndola cada mes con el formato `titular : saldo`, y al final cuántos meses necesitó cada una (6 y 3).

---

### 🃏 Ejercicio 05 · Biblioteca
Crear las clases `Libro` (`titulo`, `autor`, `disponible`) y `Socio` (`nombre`, `librosPrestados`). Crear 4 libros y 2 socios, registrar que el primer socio presta 2 libros y el segundo presta 1 (`disponible = false` y aumentar `librosPrestados`), y al final imprimir cada libro con el formato `titulo : Disponible` o `titulo : Prestado`, cada socio con el formato `nombre : librosPrestados` y cuántos libros quedan disponibles.

---

# 💻 Código Fuente Completo Unificado · `GuiaAPE4.java`

```java
// ============================================================================
//  GUÍA PRÁCTICA APE 4 · INTRODUCCIÓN A LA POO EN JAVA
//  Autor: Paredes Acosta Dereck Shair
//  Temática: Gambito (Remy LeBeau / The Cajun Division)
// ============================================================================

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// ============================================================================
//  PALETA DE COLORES ANSI · ENERGÍA CINÉTICA & GAMBITO
// ============================================================================
class Estilo {
    public static final String RESET   = "\u001B[0m";
    public static final String MAGENTA = "\u001B[35m"; // Magenta Neón
    public static final String PURPLE  = "\u001B[38;5;129m"; // Púrpura Cargado
    public static final String CYAN    = "\u001B[36m"; // Cian Cinético
    public static final String YELLOW  = "\u001B[33m"; // Oro Casino
    public static final String RED     = "\u001B[31m"; // Rojo Alerta
    public static final String GREEN   = "\u001B[32m"; // Verde Victoria
    public static final String BOLD    = "\u001B[1m";  // Negrita
}

// ============================================================================
//  MODELOS Y CLASES DE LOS 5 EJERCICIOS
// ============================================================================

// --- EJERCICIO 1: NOTAS DEL CURSO ---
class Estudiante {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularPromedio() {
        this.promedio = (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }

    public String obtenerEstado() {
        if (this.promedio >= 7.0) return "Aprobado";
        if (this.promedio >= 5.0) return "Supletorio";
        return "Reprobado";
    }
}

// --- EJERCICIO 2: INVENTARIO DE UNA TIENDA ---
class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}

// --- EJERCICIO 3: VETERINARIA ---
class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;

    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }
}

// --- EJERCICIO 4: CUENTA DE AHORRO ---
class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}

// --- EJERCICIO 5: BIBLIOTECA ---
class Libro {
    String titulo;
    String autor;
    boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
}

class Socio {
    String nombre;
    int librosPrestados;

    public Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }
}

// ============================================================================
//  CLASE PRINCIPAL · GUÍA APE 4 (SISTEMA UNIFICADO)
// ============================================================================
public class GuiaAPE4 {

    // ------------------------------------------------------------------------
    // EJERCICIO 1: RESOLUCIÓN
    // ------------------------------------------------------------------------
    public static void resolverEjercicio1() {
        imprimirEncabezadoEjercicio("01", "NOTAS DEL CURSO");

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Bryan Tipan", 7.5, 8.0, 6.5));
        estudiantes.add(new Estudiante("Mishell Rocha", 5.5, 5.0, 6.0));
        estudiantes.add(new Estudiante("Ariel Coello", 2.0, 4.0, 3.0));
        estudiantes.add(new Estudiante("Nicole Vega", 10.0, 9.5, 9.0));
        estudiantes.add(new Estudiante("Joel Cando", 6.0, 7.0, 7.5));

        int aprobados = 0;

        for (Estudiante est : estudiantes) {
            est.calcularPromedio();
            String estado = est.obtenerEstado();
            
            String colorEstado = Estilo.RED;
            if (estado.equals("Aprobado")) {
                colorEstado = Estilo.GREEN;
                aprobados++;
            } else if (estado.equals("Supletorio")) {
                colorEstado = Estilo.YELLOW;
            }

            System.out.printf(Locale.US, "  %-15s : %s%.2f%s -> %s%s%s%n",
                    est.nombre, Estilo.CYAN, est.promedio, Estilo.RESET,
                    colorEstado, estado, Estilo.RESET);
        }

        System.out.println("\n  " + Estilo.MAGENTA + "---------------------------------------" + Estilo.RESET);
        System.out.println("  " + Estilo.BOLD + "Aprobaron " + aprobados + " de " + estudiantes.size() + " estudiantes." + Estilo.RESET);
    }

    // ------------------------------------------------------------------------
    // EJERCICIO 2: RESOLUCIÓN
    // ------------------------------------------------------------------------
    public static void resolverEjercicio2() {
        imprimirEncabezadoEjercicio("02", "INVENTARIO DE UNA TIENDA");

        ArrayList<Producto> ferreteria = new ArrayList<>();
        ferreteria.add(new Producto("Martillo", 8.50, 10));
        ferreteria.add(new Producto("Caja de clavos", 1.20, 7));
        ferreteria.add(new Producto("Destornillador", 3.40, 5));
        ferreteria.add(new Producto("Cinta aislante", 0.90, 20));

        System.out.println("  " + Estilo.PURPLE + "[ CATÁLOGO DE PRODUCTOS ]" + Estilo.RESET);
        for (Producto p : ferreteria) {
            System.out.printf(Locale.US, "  • %-15s : %s$%.2f%s%n", p.nombre, Estilo.CYAN, p.precio, Estilo.RESET);
        }

        // Simulación de venta de 3 unidades en dos productos
        int unidadesVendidas = 3;
        Producto vendido1 = ferreteria.get(1);
        Producto vendido2 = ferreteria.get(2);
        vendido1.stock -= unidadesVendidas;
        vendido2.stock -= unidadesVendidas;

        System.out.println("\n  " + Estilo.YELLOW + "⚡ SIMULACIÓN DE VENTA: -3 " + vendido1.nombre + " | -3 " + vendido2.nombre + Estilo.RESET + "\n");

        System.out.println("  " + Estilo.PURPLE + "[ INVENTARIO FINAL & STOCK ]" + Estilo.RESET);
        double valorTotal = 0;

        for (Producto p : ferreteria) {
            double valorProducto = p.precio * p.stock;
            valorTotal += valorProducto;

            String alerta = "";
            if (p.stock < 5) {
                alerta = " " + Estilo.RED + Estilo.BOLD + "*** Reponer ***" + Estilo.RESET;
            }

            System.out.printf(Locale.US, "  • %-15s : $%.2f x %d unidades%s%n",
                    p.nombre, p.precio, p.stock, alerta);
        }

        System.out.println("\n  " + Estilo.MAGENTA + "---------------------------------------" + Estilo.RESET);
        System.out.printf(Locale.US, "  " + Estilo.BOLD + "Valor total del inventario = %s$%.2f%s%n", Estilo.GREEN, valorTotal, Estilo.RESET);
    }

    // ------------------------------------------------------------------------
    // EJERCICIO 3: RESOLUCIÓN
    // ------------------------------------------------------------------------
    public static void resolverEjercicio3() {
        imprimirEncabezadoEjercicio("03", "VETERINARIA & REFERENCIAS EN MEMORIA");

        Mascota m1 = new Mascota("Bruno", "Perro", 3, 31.0);
        Mascota m2 = new Mascota("Pelusa", "Gato", 6, 5.1);
        Mascota m3 = new Mascota("Kiwi", "Loro", 2, 0.4);

        Mascota[] mascotas = {m1, m2, m3};

        System.out.println("  " + Estilo.PURPLE + "[ FICHAS DE PACIENTES ]" + Estilo.RESET);
        for (Mascota m : mascotas) {
            String revision = (m.peso > 20) ? " " + Estilo.YELLOW + "[Revisar peso]" + Estilo.RESET : "";
            System.out.printf(Locale.US, "  • %-8s : %-6s : %s%.2f kg%s%s%n",
                    m.nombre, m.especie, Estilo.CYAN, m.peso, Estilo.RESET, revision);
        }

        System.out.println("\n  " + Estilo.PURPLE + "[ DEMOSTRACIÓN DE REFERENCIAS EN HEAP ]" + Estilo.RESET);
        System.out.println("  • Edad inicial de m1 (Bruno): " + Estilo.CYAN + m1.edad + Estilo.RESET);
        
        // Asignación de referencia
        Mascota m4 = m1;
        m4.edad += 1;

        System.out.println("  ⚡ Se ejecuta: " + Estilo.YELLOW + "Mascota m4 = m1; m4.edad += 1;" + Estilo.RESET);
        System.out.println("  • Nueva edad consultada desde m1.edad: " + Estilo.GREEN + Estilo.BOLD + m1.edad + Estilo.RESET);

        System.out.println("\n  " + Estilo.MAGENTA + "📌 EXPLICACIÓN CINÉTICA:" + Estilo.RESET);
        System.out.println("  Las variables de tipo Objeto en Java no guardan la instancia, sino la " + Estilo.CYAN + "dirección de memoria" + Estilo.RESET + ".");
        System.out.println("  Al asignar 'm4 = m1', m4 apunta exactamente al mismo objeto en el Heap. Modificar m4 altera la memoria de m1.");
    }

    // ------------------------------------------------------------------------
    // EJERCICIO 4: RESOLUCIÓN
    // ------------------------------------------------------------------------
    public static void resolverEjercicio4() {
        imprimirEncabezadoEjercicio("04", "CUENTA DE AHORRO");

        Cuenta c1 = new Cuenta("Andres Quispe", 200.0);
        Cuenta c2 = new Cuenta("Daniela Torres", 350.0);

        int mesesC1 = simularAhorro(c1);
        System.out.println();
        int mesesC2 = simularAhorro(c2);

        System.out.println("\n  " + Estilo.MAGENTA + "---------------------------------------" + Estilo.RESET);
        System.out.println("  " + Estilo.BOLD + "RESUMEN DE TIEMPO PARA ALCANZAR LA META ($500):" + Estilo.RESET);
        System.out.println("  • " + c1.titular + " -> " + Estilo.GREEN + mesesC1 + " meses" + Estilo.RESET);
        System.out.println("  • " + c2.titular + " -> " + Estilo.GREEN + mesesC2 + " meses" + Estilo.RESET);
    }

    private static int simularAhorro(Cuenta c) {
        int mes = 0;
        System.out.println("  " + Estilo.PURPLE + "Ahorro programado para: " + c.titular + " (Saldo Inicial: $" + c.saldo + ")" + Estilo.RESET);
        while (c.saldo < 500.0) {
            c.saldo += 50.0;
            mes++;
            System.out.printf(Locale.US, "    [Mes %02d] Saldo actual: %s$%.2f%s%n",
                    mes, Estilo.CYAN, c.saldo, Estilo.RESET);
        }
        return mes;
    }

    // ------------------------------------------------------------------------
    // EJERCICIO 5: RESOLUCIÓN
    // ------------------------------------------------------------------------
    public static void resolverEjercicio5() {
        imprimirEncabezadoEjercicio("05", "SISTEMA DE BIBLIOTECA");

        ArrayList<Libro> catalogo = new ArrayList<>();
        catalogo.add(new Libro("1984", "George Orwell"));
        catalogo.add(new Libro("Fahrenheit 451", "Ray Bradbury"));
        catalogo.add(new Libro("María", "Jorge Isaacs"));
        catalogo.add(new Libro("Cumandá", "Juan León Mera"));

        Socio s1 = new Socio("Ricardo Benítez");
        Socio s2 = new Socio("Tatiana Mora");

        // Préstamos
        prestarLibro(s1, catalogo.get(0));
        prestarLibro(s1, catalogo.get(1));
        prestarLibro(s2, catalogo.get(2));

        System.out.println("  " + Estilo.PURPLE + "[ CATÁLOGO DE LIBROS ]" + Estilo.RESET);
        int disponibles = 0;
        for (Libro l : catalogo) {
            String estado = Estilo.RED + "Prestado" + Estilo.RESET;
            if (l.disponible) {
                estado = Estilo.GREEN + "Disponible" + Estilo.RESET;
                disponibles++;
            }
            System.out.printf("  • %-18s : %s%n", l.titulo, estado);
        }

        System.out.println("\n  " + Estilo.PURPLE + "[ REGISTRO DE SOCIOS ]" + Estilo.RESET);
        System.out.println("  • " + s1.nombre + " : " + Estilo.CYAN + s1.librosPrestados + " libros prestados" + Estilo.RESET);
        System.out.println("  • " + s2.nombre + " : " + Estilo.CYAN + s2.librosPrestados + " libros prestados" + Estilo.RESET);

        System.out.println("\n  " + Estilo.MAGENTA + "---------------------------------------" + Estilo.RESET);
        System.out.println("  " + Estilo.BOLD + "Libros disponibles en biblioteca: " + Estilo.GREEN + disponibles + Estilo.RESET);
    }

    private static void prestarLibro(Socio socio, Libro libro) {
        if (libro.disponible) {
            libro.disponible = false;
            socio.librosPrestados++;
        }
    }

    // ------------------------------------------------------------------------
    // MÉTODOS DE FORMATO & MENÚ PRINCIPAL
    // ------------------------------------------------------------------------
    private static void imprimirEncabezadoEjercicio(String num, String titulo) {
        System.out.println("\n" + Estilo.MAGENTA + "============================================================================" + Estilo.RESET);
        System.out.println("  " + Estilo.BOLD + Estilo.PURPLE + "🃏 EJERCICIO " + num + " · " + titulo + Estilo.RESET);
        System.out.println(Estilo.MAGENTA + "============================================================================" + Estilo.RESET);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n" + Estilo.MAGENTA + "============================================================================" + Estilo.RESET);
            System.out.println("    " + Estilo.BOLD + Estilo.CYAN + "🃏 GUÍA PRÁCTICA APE 4 · THE CAJUN CODE DIVISION 🃏" + Estilo.RESET);
            System.out.println("    " + Estilo.YELLOW + "Desarrollador: Paredes Acosta Dereck Shair" + Estilo.RESET);
            System.out.println(Estilo.MAGENTA + "============================================================================" + Estilo.RESET);
            System.out.println("  1. " + Estilo.PURPLE + "Ejecutar Ejercicio 1 (Notas del curso)" + Estilo.RESET);
            System.out.println("  2. " + Estilo.PURPLE + "Ejecutar Ejercicio 2 (Inventario de tienda)" + Estilo.RESET);
            System.out.println("  3. " + Estilo.PURPLE + "Ejecutar Ejercicio 3 (Veterinaria & Memoria)" + Estilo.RESET);
            System.out.println("  4. " + Estilo.PURPLE + "Ejecutar Ejercicio 4 (Cuenta de ahorro)" + Estilo.RESET);
            System.out.println("  5. " + Estilo.PURPLE + "Ejecutar Ejercicio 5 (Biblioteca)" + Estilo.RESET);
            System.out.println("  6. " + Estilo.GREEN + "⚡ Ejecutar TODOS los ejercicios en secuencia" + Estilo.RESET);
            System.out.println("  0. " + Estilo.RED + "Salir del Casino" + Estilo.RESET);
            System.out.print("\n  " + Estilo.BOLD + "Selecciona una carta [0-6]: " + Estilo.RESET);

            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> resolverEjercicio1();
                    case 2 -> resolverEjercicio2();
                    case 3 -> resolverEjercicio3();
                    case 4 -> resolverEjercicio4();
                    case 5 -> resolverEjercicio5();
                    case 6 -> {
                        resolverEjercicio1();
                        resolverEjercicio2();
                        resolverEjercicio3();
                        resolverEjercicio4();
                        resolverEjercicio5();
                    }
                    case 0 -> System.out.println("\n  " + Estilo.YELLOW + "🃏 El juego ha terminado. ¡Hasta la próxima mano, mon cher!" + Estilo.RESET);
                    default -> System.out.println("\n  " + Estilo.RED + "⚠️ Opción inválida. Elige una opción entre 0 y 6." + Estilo.RESET);
                }
            } catch (Exception e) {
                System.out.println("\n  " + Estilo.RED + "⚠️ Entrada no válida. Ingresa un número entero." + Estilo.RESET);
            }

        } while (opcion != 0);

        sc.close();
    }
}
