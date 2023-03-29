//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.

Algoritmo sin_titulo
	Definir a,b Como Entero
	
	Escribir "Ingrese el valor A:"
	Leer a
	Escribir "Ingrese el valor B:"
	Leer b
	
	Intercambio(a,b)
	
	Escribir ""
	Escribir "A:",a
	Escribir "B:",b
	
FinAlgoritmo

SubProceso Intercambio(a Por Referencia,b Por Referencia)
	Definir c Como Entero
	c = a
	a = b
	b = c
FinSubProceso


	