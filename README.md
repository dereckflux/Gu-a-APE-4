<h1 align="center">Prueba-Práctica · SmartToll</h1>

<p align="center">
  <strong>🃏 EL CASINO DEL CÓDIGO · THE CAJUN DIVISION · GUÍA APE 4</strong><br>
  <em>El destino reparte las cartas, pero solo un jugador controla el peaje.</em>
</p>

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&amp;color=0:0D1117,60:4B0082,100:E0115F&amp;height=230&amp;section=header&amp;text=SmartToll&amp;fontSize=48&amp;fontColor=E0115F&amp;animation=fadeIn&amp;fontAlignY=38&amp;desc=REMY%20LEBEAU%20%C2%B7%20DESARROLLO%20INDIVIDUAL&amp;descAlignY=60&amp;descSize=20&amp;descColor=FFFFFF" width="100%" alt="SmartToll — Remy LeBeau, Desarrollo Individual: texto animado sobre ondas decorativas púrpuras y magenta">

<h2>🃏 EL PEAJE DE NUEVA ORLEANS: LA APUESTA PERFECTA</h2>

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&amp;weight=700&amp;size=21&amp;duration=3200&amp;pause=1500&amp;color=E0115F&amp;center=true&amp;vCenter=true&amp;width=850&amp;height=70&amp;lines=Si+lo+puedes+imaginar%2C+lo+puedes+programar.;Ning%C3%BAn+veh%C3%ADculo+cruza+sin+pagar+su+apuesta.;Una+sola+baraja.+Un+solo+desarrollador.;Cartas+cargadas.+Comienza+la+misi%C3%B3n.;El+mejor+estafador+nunca+deja+un+bug+en+el+c%C3%B3digo." width="100%" alt="Frases animadas estilo Gambito">

**La noche es joven. La energía cinética debe fluir.**

<img src="https://img.shields.io/badge/MODALIDAD-INDIVIDUAL-E0115F?style=for-the-badge&amp;labelColor=18181B" alt="Modalidad Individual">
<img src="https://img.shields.io/badge/AUTOR-1_DESARROLLADOR-E0115F?style=for-the-badge&amp;labelColor=18181B" alt="Un desarrollador">
<img src="https://img.shields.io/badge/GU%C3%8DA-APE_4-E0115F?style=for-the-badge&amp;labelColor=18181B" alt="Guía APE 4">

<br>

<img src="https://img.shields.io/badge/LENGUAJE-JAVA-9333EA?style=flat-square&amp;labelColor=18181B" alt="Lenguaje Java">
<img src="https://img.shields.io/badge/ENFOQUE-SWITCH_·_CICLOS_·_VALIDACIONES-9333EA?style=flat-square&amp;labelColor=18181B" alt="Enfoque en switch, ciclos y validaciones">

<br><br>

**Miser, bienvenidos a mi mesa de juego.**<br>
Esta vez la misión es controlar la entrada al territorio: cada vehículo que cruza el peaje<br>
debe identificarse, pagar la tarifa exacta y quedar registrado en el mazo.

**Un solo jugador. Una estrategia implacable. Un peaje.**

</div>

---

## 🃏 Autor · El As de la Baraja

En el código, como en las cartas, depender de otros solo complica la jugada. Esta solución fue concebida, ejecutada y pulida de forma completamente individual para cumplir con los requerimientos de la **Guía APE 4**.

| Rol | Desarrollador | Operación | Objetivo |
| :---: | :--- | :--- | :--- |
| **As de Picas** | **[Tu Nombre Completo Aquí]** | **Arquitecto Cinético · Investigación, Desarrollo y Pruebas** | Diseñar, programar, validar y documentar la solución integral del peaje sin dejar nada al azar. |

**No necesito compinches cuando tengo el mazo cargado a mi favor.**

---

# 🗃️ Expediente de Misión · Guía APE 4 – SmartToll: Peaje

> **Objetivo de la misión:** analizar el problema de manera individual, diseñar una solución lógica impecable, programarla en Java, verificar su funcionamiento bajo todos los escenarios de prueba y documentar los resultados.

### 📋 Descripción

El programa simula el control de un peaje bajo la supervisión de Gambito. Solicita la cantidad **N de vehículos** y, para cada uno, registra la **placa**, el **tipo de vehículo** (`1` Moto, `2` Automóvil, `3` Camión), el **número de ejes** y la **hora** de paso. Utilizando un bloque `switch`, determina la tarifa correspondiente y, al finalizar la ejecución, muestra el reporte final:

- El **total recaudado**.
- La **cantidad de camiones con más de 4 ejes**.
- La **placa que pagó la tarifa más alta** (el verdadero *High Roller*).

### ⚙️ Estructuras utilizadas

| Estructura | Uso dentro del programa |
| :--- | :--- |
| `for` | Procesar secuencialmente los N vehículos. |
| `while` | Validar cada entrada hasta asegurar que el dato sea correcto. |
| `switch` | Evaluar y calcular la tarifa base según el tipo de vehículo. |
| `if` / `else` | Aplicar el recargo por hora pico y determinar la tarifa máxima registrada. |
| Acumulador | Sumar el total recaudado en la caja general. |
| Contador | Registrar la cantidad de camiones con más de 4 ejes. |
| Variables de mayor | Guardar el importe de la tarifa más alta y la placa asociada. |

### 💰 Tabla de tarifas · Reglas de la Mesa de Juego

| Tipo | Vehículo | Ejes permitidos | Tarifa base |
| :---: | :--- | :---: | :--- |
| **1** | Moto | 2 | $1,00 |
| **2** | Automóvil | 2 | $2,00 |
| **3** | Camión | 2 a 9 | $1,50 por eje |

> **Hora pico:** de 07:00 a 09:59 y de 17:00 a 19:59 se aplica un **recargo del 20 %** sobre la tarifa base. La hora se ingresa como un entero entre `0` y `23`.

### 🛡️ Validaciones y criterios

- **N** debe ser un entero estrictamente mayor que cero.
- La **placa** no puede estar vacía ni compuesta solo por espacios.
- El **tipo** solo acepta las opciones `1`, `2` o `3`.
- Los **ejes** deben ajustarse al tipo: moto y automóvil requieren exactamente 2 ejes; camión acepta de 2 a 9 ejes.
- La **hora** debe estar en el rango de `0` a `23`.
- Si se ingresa un dato inválido, el sistema muestra una advertencia y solicita el dato nuevamente sin avanzar de vehículo.
- Un camión se contabiliza como **“más de 4 ejes”** únicamente si cuenta con 5 o más ejes.
- En caso de un empate en la tarifa más alta, la casa respeta la **primera placa** registrada.

---

# ⚙️ Instrucciones de ejecución · Cargando la Baraja

Para compilar y ejecutar el programa se debe contar con el entorno de desarrollo **Java (JDK 8 o superior)** instalado.

El proyecto está listo para ser ejecutado en cualquiera de los siguientes entornos:

- Visual Studio Code.
- Apache NetBeans.
- IntelliJ IDEA.
- Eclipse.
- Consola o Terminal del sistema.

## 🖥️ Ejecución desde un IDE

1. Abrir el entorno de desarrollo preferido.
2. Cargar el proyecto o crear una clase llamada `SmartToll.java`.
3. Asegurarse de que el archivo contenga el punto de entrada principal:

```java
public static void main(String[] args)
