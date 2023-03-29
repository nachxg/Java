//Construir un pseudocódigo que permita ingresar un número, si el número es mayor de
//500, se debe calcular y mostrar en pantalla el 18% de este.

Algoritmo sin_titulo
	Definir nro Como Real
	
	Escribir "Ingrese un numero:"
	Leer nro
	
	Si nro > 500 Entonces
		nro = nro * 18 / 100
		Escribir nro
	FinSi
FinAlgoritmo
