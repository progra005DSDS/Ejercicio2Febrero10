# Ejercicio2Febrero10 
ejercicio 2
## DESCRIPCION DEL PROBLEMA
Se requiere un programa en Java para calcular el resultado de la suma, diferencia, producto, módulo y cociente de dos números decimales de cualquier longitud.
## Definicion de la solucion 
-Datos de entrada
float nim1, num2, suma , duferncia, producto, conciente, modulo,
-Proceso
ingreso el primer número a utilizar
ingreso el segundo  número a utilizar
suma=num1+num2;
diferencia=num1-num2;
producto=num1*num2;
cociente= num1/num2
-Salida
suma
diferencia
producto
cociente
## Diseñar la solucion
! [](
## Desarollar la solucion
suma=num1+num2
diferencia=num1-num2
producto=num1*num2
cociente= num1/num2
## Depuracion y prueba
-Prueba numero 1
suma=4+5
diferencia=4-5
producto=num1*5
cociente= 4/5
## Documentacion
documento.com
