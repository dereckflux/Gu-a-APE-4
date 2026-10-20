<h1 align="center">Guía Práctica APE 4 · Programación Orientada a Objetos</h1>

<p align="center">
  <strong>🃏 EL CASINO DEL CÓDIGO · REMY LEBEAU DIVISION</strong><br>
  <em>El mazo está cargado: 5 ejercicios de POO resueltos con precisión cinética.</em>
</p>

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&amp;color=0:0D1117,60:4B0082,100:E0115F&amp;height=230&amp;section=header&amp;text=Guia%20APE%204%20%C2%B7%20POO&amp;fontSize=44&amp;fontColor=E0115F&amp;animation=fadeIn&amp;fontAlignY=38&amp;desc=DESARROLLO%20INDIVIDUAL%20%C2%B7%20PAREDES%20ACOSTA%20DERECK%20SHAIR&amp;descAlignY=60&amp;descSize=18&amp;descColor=FFFFFF" width="100%" alt="Guía APE 4 POO - Dereck Shair Paredes Acosta">

<h2>🃏 RESOLUCIÓN DE EJERCICIOS DE CLASES Y OBJETOS EN JAVA</h2>

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&amp;weight=700&amp;size=21&amp;duration=3200&amp;pause=1500&amp;color=E0115F&amp;center=true&amp;vCenter=true&amp;width=850&amp;height=70&amp;lines=Cinco+ejercicios.+Cero+suerte.+Pura+l%C3%B3gica.;Clases%2C+atributos%2C+instancias+y+referencias.;El+mazo+de+Java+est%C3%A1+en+mis+manos.;Desarrollo+individual+para+la+Gu%C3%ADa+APE+4." width="100%" alt="Frases animadas estilo Gambito">

**Cinco cartas sobre la mesa. Cinco problemas resueltos.**

<img src="https://img.shields.io/badge/MODALIDAD-INDIVIDUAL-E0115F?style=for-the-badge&amp;labelColor=18181B" alt="Modalidad Individual">
<img src="https://img.shields.io/badge/AUTOR-DERECK_PAREDES-E0115F?style=for-the-badge&amp;labelColor=18181B" alt="Dereck Paredes">
<img src="https://img.shields.io/badge/GU%C3%8DA-APE_4-E0115F?style=for-the-badge&amp;labelColor=18181B" alt="Guía APE 4">

<br>

<img src="https://img.shields.io/badge/LENGUAJE-JAVA-9333EA?style=flat-square&amp;labelColor=18181B" alt="Lenguaje Java">
<img src="https://img.shields.io/badge/PARADIGMA-POO-9333EA?style=flat-square&amp;labelColor=18181B" alt="Paradigma POO">

<br><br>

**Bienvenue à la mesa de trabajo.**<br>
Esta guía contiene la implementación completa de los 5 ejercicios prácticos<br>
de Introducción a la Programación Orientada a Objetos en Java.

</div>

---

## 🃏 Autor · El As de la Baraja

| Rol | Desarrollador | Asignatura | Trabajo |
| :---: | :--- | :--- | :--- |
| **As de Picas** | **Paredes Acosta Dereck Shair** | **Orientación a Objetos / Java** | **Guía APE 4 (Individual)** |

---

# 🗃️ Expediente de Misión · Los 5 Ejercicios de la Guía APE 4

---

### 🃏 Ejercicio 1 · Notas del curso

> **Descripción:** Crear la clase `Estudiante` con los atributos `nombre`, `nota1`, `nota2`, `nota3` y `promedio`. Instanciar 5 estudiantes, calcular su promedio e imprimir el estado académico de cada uno.

* **Reglas:**
  * **Aprobado:** Promedio $\ge 7.0$
  * **Supletorio:** Promedio entre $5.0$ y $6.99$
  * **Reprobado:** Promedio $< 5.0$
* **Salida esperada:** Formato `nombre: promedio - Estado`, seguido del conteo total de aprobados.

---

### 🃏 Ejercicio 2 · Inventario de una tienda

> **Descripción:** Crear la clase `Producto` con `nombre`, `precio` y `stock`. Instanciar 4 productos y simular la venta de 3 unidades en dos de ellos.

* **Reglas:**
  * Imprimir productos con el formato `nombre: precio`.
  * Mostrar la alerta `"Reponer"` junto a los productos cuyo stock sea menor a 5 unidades.
  * Calcular e imprimir el valor total del inventario ($\sum \text{precio} \times \text{stock}$).

---

### 🃏 Ejercicio 3 · Veterinaria & Referencias de Memoria

> **Descripción:** Crear la clase `Mascota` con `nombre`, `especie`, `edad` y `peso`. Instanciar 3 mascotas.

* **Reglas:**
  * Imprimir con formato `nombre: especie: peso`.
  * Mostrar `"Revisar peso"` si la mascota pesa más de 20 kg.
  * Asignación de referencia: Ejecutar `Mascota m4 = m1;`, incrementar `m4.edad++`, imprimir `m1.edad` y explicar mediante comentarios el comportamiento de la memoria Stack/Heap.

---

### 🃏 Ejercicio 4 · Cuenta de ahorro

> **Descripción:** Crear la clase `Cuenta` con `titular` y `saldo`. Instanciar 2 cuentas (una con $200 y otra con $350).

* **Reglas:**
  * Mediante un ciclo `while`, depositar $50 al mes en cada cuenta hasta alcanzar o superar los $500.
  * Imprimir el progreso mensual con formato `titular: saldo`.
  * Reportar cuántos meses necesitó cada cuenta para llegar a la meta (6 y 3 meses respectivamente).

---

### 🃏 Ejercicio 5 · Biblioteca

> **Descripción:** Crear las clases `Libro` (`titulo`, `autor`, `disponible`) y `Socio` (`nombre`, `librosPrestados`). Instanciar 4 libros y 2 socios.

* **Reglas:**
  * Registrar el préstamo de 2 libros al primer socio y 1 libro al segundo socio (cambiando `disponible = false` e incrementando `librosPrestados`).
  * Imprimir el estado de cada libro (`titulo: Disponible` o `titulo: Prestado`).
  * Imprimir el estado de cada socio con formato `nombre: librosPrestados`.
  * Mostrar el total de libros que permanecen disponibles en la biblioteca.

---

# ⚙️ Instrucciones de Ejecución

Para compilar y ejecutar los ejercicios se requiere contar con **Java (JDK 8 o superior)**.

```bash
# Compilar los archivos del proyecto
javac *.java

# Ejecutar la clase principal que contiene las pruebas
java Main
